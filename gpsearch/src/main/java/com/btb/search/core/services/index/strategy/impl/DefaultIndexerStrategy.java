package com.btb.search.core.services.index.strategy.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import org.apache.log4j.Logger;

import com.btb.search.core.PK;
import com.btb.search.core.conf.index.IndexConfig;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.services.index.IndexerContext;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.IndexerWorker;
import com.btb.search.core.services.index.IndexerWorkerParameters;
import com.btb.search.core.services.index.factory.IndexerWorkerFactory;

public class DefaultIndexerStrategy {

	private static final Logger LOG = Logger.getLogger(DefaultIndexerStrategy.class);
	private IndexerWorkerFactory indexerWorkerFactory;

	public DefaultIndexerStrategy() {
	}

	protected void doExecute(IndexerContext indexerContext) throws IndexerException {
		IndexConfig indexConfig = indexerContext.getFacetSearchConfig().getIndexConfig();
		List<PK> pks = indexerContext.getPks();
		List<DefaultIndexerStrategy.IndexerWorkerWrapper> workers = new ArrayList();
		int batchSize = indexConfig.getBatchSize();
		int numberOfThreads = indexConfig.getNumberOfThreads();
		int numberOfWorkers = (int) Math.ceil((double) pks.size() / (double) batchSize);
		if (LOG.isDebugEnabled()) {
			LOG.debug("Batch size: " + batchSize);
			LOG.debug("Number of threads: " + numberOfThreads);
			LOG.debug("Number of workers: " + numberOfWorkers);
		}

		ExecutorService executorService = this.createIndexerWorkersPool(numberOfThreads);
		ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService(executorService);
		int maxRetries = Math.max(0, indexConfig.getMaxRetries());
		int maxBatchRetries = Math.max(0, indexConfig.getMaxBatchRetries());

		try {
			Throwable var12 = null;
			Object var13 = null;

			try {

				try {
					int index = 0;

					for (int start = 0; index < numberOfWorkers; start += batchSize) {
						int end = Math.min(start + batchSize, pks.size());
						List<PK> workerPks = pks.subList(start, end);
						IndexerWorker indexerWorker = this.createIndexerWorker(indexerContext, (long) index, workerPks);
						DefaultIndexerStrategy.IndexerWorkerWrapper indexerWorkerWrapper = new DefaultIndexerStrategy.IndexerWorkerWrapper(
								indexerWorker, index, maxBatchRetries, workerPks);
						workers.add(indexerWorkerWrapper);
						++index;
					}

					this.runWorkers(indexerContext, completionService, workers, maxRetries);
				} finally {

				}
			} catch (Throwable var36) {
				if (var12 == null) {
					var12 = var36;
				} else if (var12 != var36) {
					var12.addSuppressed(var36);
				}
			}
		} catch (Exception var37) {
			throw new IndexerException(var37);
		} finally {
			executorService.shutdownNow();
		}
	}

	protected void runWorkers(IndexerContext indexerContext, ExecutorCompletionService<Integer> completionService,
			List<DefaultIndexerStrategy.IndexerWorkerWrapper> workers, int retriesLeft) throws IndexerException {
		int currentRetriesLeft = retriesLeft;
		Map<Integer, DefaultIndexerStrategy.IndexerWorkerWrapper> failedWorkers = new HashMap();
		if (LOG.isDebugEnabled()) {
			LOG.debug("Submitting indexer workers (retries left: " + retriesLeft + ")");
		}

		Iterator var8 = workers.iterator();

		while (var8.hasNext()) {
			DefaultIndexerStrategy.IndexerWorkerWrapper worker = (DefaultIndexerStrategy.IndexerWorkerWrapper) var8
					.next();
			completionService.submit(worker.getIndexerWorker(), worker.getWorkerNumber());
			failedWorkers.put(worker.getWorkerNumber(), worker);
			if (LOG.isDebugEnabled()) {
				LOG.debug("Worker " + worker.getWorkerNumber() + " has been submitted (retries left: "
						+ worker.getRetriesLeft() + ")");
			}
		}

		for (int i = 0; i < workers.size(); ++i) {
			try {
				Future<Integer> future = completionService.take();
				Integer workerNumber = (Integer) future.get();
				if (LOG.isDebugEnabled()) {
					LOG.debug("Worker " + workerNumber + " finished");
				}

				failedWorkers.remove(workerNumber);
			} catch (ExecutionException var11) {
				if (currentRetriesLeft <= 0) {
					throw new IndexerException("Indexer worker failed. Max number of retries in total has been reached",
							var11);
				}

				--currentRetriesLeft;
			} catch (InterruptedException var12) {
				if (currentRetriesLeft <= 0) {
					throw new IndexerException(
							"Indexer worker was interrupted. Max number of retries in total has been reached", var12);
				}

				--currentRetriesLeft;
			}
		}

		if (!failedWorkers.isEmpty()) {
			List<DefaultIndexerStrategy.IndexerWorkerWrapper> rerunWorkers = new ArrayList();
			Iterator var17 = failedWorkers.values().iterator();

			while (var17.hasNext()) {
				DefaultIndexerStrategy.IndexerWorkerWrapper indexerWorkerWrapper = (DefaultIndexerStrategy.IndexerWorkerWrapper) var17
						.next();
				if (indexerWorkerWrapper.getRetriesLeft() <= 0) {
					throw new IndexerException("Indexer worker " + indexerWorkerWrapper.getWorkerNumber()
							+ " failed. Max number of retries per worker has been reached");
				}

				IndexerWorker indexerWorker = this.createIndexerWorker(indexerContext,
						(long) indexerWorkerWrapper.getWorkerNumber(), indexerWorkerWrapper.getWorkerPks());
				indexerWorkerWrapper.setIndexerWorker(indexerWorker);
				indexerWorkerWrapper.setRetriesLeft(indexerWorkerWrapper.getRetriesLeft() - 1);
				rerunWorkers.add(indexerWorkerWrapper);
			}

			this.runWorkers(indexerContext, completionService, rerunWorkers, currentRetriesLeft);
		}

	}

	protected ExecutorService createIndexerWorkersPool(int numberOfThreads) {
		ThreadFactory threadFactory = new ThreadFactory() {
			private final ThreadFactory defaultFactory = Executors.defaultThreadFactory();

			public Thread newThread(Runnable runnable) {
				Thread thread = this.defaultFactory.newThread(runnable);
				thread.setName("solr indexer thread");
				return thread;
			}
		};
		return Executors.newFixedThreadPool(numberOfThreads, threadFactory);
	}

	protected IndexerWorker createIndexerWorker(IndexerContext indexerContext, long workerNumber, List<PK> workerPks)
			throws IndexerException {
		Collection<String> indexedProperties = new ArrayList();
		Iterator var7 = indexerContext.getIndexedProperties().iterator();

		while (var7.hasNext()) {
			IndexedProperty indexedProperty = (IndexedProperty) var7.next();
			indexedProperties.add(indexedProperty.getName());
		}

		IndexerWorkerParameters workerParameters = new IndexerWorkerParameters();
		workerParameters.setWorkerNumber(workerNumber);
		workerParameters.setIndexOperationId(indexerContext.getIndexOperationId());
		workerParameters.setIndexOperation(indexerContext.getIndexOperation());
		workerParameters.setExternalIndexOperation(indexerContext.isExternalIndexOperation());
		workerParameters.setFacetSearchConfig(indexerContext.getFacetSearchConfig().getName());
		workerParameters.setIndexedType(indexerContext.getIndexedType().getUniqueIndexedTypeCode());
		workerParameters.setIndexedProperties(indexedProperties);
		workerParameters.setPks(workerPks);
		workerParameters.setIndexerHints(indexerContext.getIndexerHints());
		workerParameters.setIndex(indexerContext.getIndex().getQualifier());

		IndexerWorker indexerWorker = this.indexerWorkerFactory
				.createIndexerWorker(indexerContext.getFacetSearchConfig());
		indexerWorker.initialize(workerParameters);
		return indexerWorker;
	}

	public IndexerWorkerFactory getIndexerWorkerFactory() {
		return this.indexerWorkerFactory;
	}

	public void setIndexerWorkerFactory(IndexerWorkerFactory indexerWorkerFactory) {
		this.indexerWorkerFactory = indexerWorkerFactory;
	}

	protected static class IndexerWorkerWrapper {
		private IndexerWorker indexerWorker;
		private int retriesLeft;
		private final Integer workerNumber;
		private final List<PK> workerPks;

		public IndexerWorkerWrapper(IndexerWorker indexerWorker, Integer workerNumber, int retriesLeft,
				List<PK> workerPks) {
			this.indexerWorker = indexerWorker;
			this.workerNumber = workerNumber;
			this.retriesLeft = retriesLeft;
			this.workerPks = workerPks;
		}

		public IndexerWorker getIndexerWorker() {
			return this.indexerWorker;
		}

		public void setIndexerWorker(IndexerWorker indexerWorker) {
			this.indexerWorker = indexerWorker;
		}

		public int getRetriesLeft() {
			return this.retriesLeft;
		}

		public void setRetriesLeft(int retriesLeft) {
			this.retriesLeft = retriesLeft;
		}

		public Integer getWorkerNumber() {
			return this.workerNumber;
		}

		public List<PK> getWorkerPks() {
			return this.workerPks;
		}
	}
}
