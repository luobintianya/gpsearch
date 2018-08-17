package com.btb.search.core.services.index.impl;

import org.apache.http.HttpHost;
import org.apache.log4j.Logger;
import org.elasticsearch.client.RestClient;

import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.IndexerWorker;
import com.btb.search.core.services.index.IndexerWorkerParameters;

import us.codecraft.webmagic.Site;

public class DefaultIndexerWorker implements IndexerWorker {
	private static final Logger LOG = Logger.getLogger(DefaultIndexerWorker.class);

	private IndexerWorkerParameters workerParameters;

	public DefaultIndexerWorker() {
	}

	public void initialize(IndexerWorkerParameters workerParameters) {
		this.workerParameters = workerParameters;
	}

	public boolean isInitialized() {
		return this.workerParameters != null;
	}

	public void run() {
		if (!this.isInitialized()) {
			throw new IllegalStateException("Indexer worker was not initialized");
		} else {
			try {
				;
				this.doRun();

			} catch (Exception var7) {
				this.logWorkerInterrupted();
				Thread.currentThread().interrupt();

			}

		}
	}

	protected void doRun() throws IndexerException, InterruptedException {

		RestClient restClient = RestClient
				.builder(new HttpHost("localhost", 9200, "http"), new HttpHost("localhost", 9201, "http")).build();
		 

	}

	public static void main(String args[]) {

		DefaultIndexerWorker dx = new DefaultIndexerWorker();

		IndexerWorkerParameters workerParameters = new IndexerWorkerParameters();
		dx.initialize(workerParameters);
		Thread x = new Thread(dx);
		x.start();

	}

	protected void initializeSession() {

	}

	protected void destroySession() {
	}

	protected String getTaskName() {
		return "Indexer worker " + this.workerParameters.getWorkerNumber() + " ("
				+ this.workerParameters.getIndexOperation() + " index operation on "
				+ this.workerParameters.getFacetSearchConfig() + "/" + this.workerParameters.getIndexedType() + ")";
	}

	protected void logWorkerStart() {

	}

	protected void logWorkerSuccess() {
		if (LOG.isDebugEnabled()) {
			String taskName = this.getTaskName();
			LOG.debug("[" + taskName + "] completed");
		}

	}

	protected void logWorkerError(Exception exception) {
		String taskName = this.getTaskName();
		LOG.error("[" + taskName + "] failed to process index items due to " + exception.getMessage(), exception);
	}

	protected void logWorkerInterrupted() {
		if (LOG.isDebugEnabled()) {
			String taskName = this.getTaskName();
			LOG.debug("[" + taskName + "] interrupted");
		}

	}
}
