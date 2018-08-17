package com.btb.search.core.services.index.strategy;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import com.btb.search.core.PK;
import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexOperation;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.conf.index.IndexedType;
import com.btb.search.core.conf.index.IndexedTypeFlexibleSearchQuery;
import com.btb.search.core.services.index.Index;
import com.btb.search.core.services.index.IndexerContext;
import com.btb.search.core.services.index.IndexerException;

public abstract class AbstractIndexerStrategy implements IndexerStrategy {

	private static final Logger LOG = Logger.getLogger(AbstractIndexerStrategy.class);

	private IndexOperation indexOperation;
	private FacetSearchConfig facetSearchConfig;
	private IndexedType indexedType;
	private Collection<IndexedProperty> indexedProperties;
	private List<PK> pks;
	private Index index;
	private Map<String, String> indexerHints;

	public AbstractIndexerStrategy() {
	}

	public void execute() throws IndexerException {
		this.validateRequiredFields();

		StopWatch operationTimer = new StopWatch();
		operationTimer.start();
		this.logStrategyStart();

		try {

			Index resolvedIndex = this.resolveIndex();
			if (resolvedIndex == null && this.indexOperation != IndexOperation.FULL) {
				LOG.info("No active index found, FULL indexer operation must be performed before any other operation");
				return;
			}

			long indexOperationId = Long.valueOf(UUID.randomUUID().hashCode());
			boolean isExternalIndexOperation = true;
			if (this.pks == null) {
				isExternalIndexOperation = false;
			}

			this.doExecute(resolvedIndex, indexOperationId, isExternalIndexOperation);
			operationTimer.stop();
			this.logStrategySuccess(operationTimer);
		} catch (Exception var10) {
			operationTimer.stop();
			this.logStrategyError(operationTimer);

		} finally {

		}

	}

	protected void doExecute(Index resolvedIndex, long indexOperationId, boolean isExternalIndexOperation)
			throws IndexerException {
		this.doExecute(resolvedIndex, indexOperationId, isExternalIndexOperation);

	}

	protected abstract void doExecute(IndexerContext var1) throws IndexerException;

	protected void validateRequiredFields() {
		if (this.indexOperation == null) {
			throw new IllegalStateException("indexOperation field not set");
		} else if (this.facetSearchConfig == null) {
			throw new IllegalStateException("facetSearchConfig field not set");
		} else if (this.indexedType == null) {
			throw new IllegalStateException("indexedType field not set");
		}
	}

	protected Index resolveIndex() throws IndexerException {
		return null;
	}

	protected List<PK> executeIndexerQuery(FacetSearchConfig facetSearchConfig, IndexedType indexedType, String query,
			Map<String, Object> queryParameters) throws IndexerException {

		return null;
	}

	protected void logStrategyStart() {
		if (LOG.isDebugEnabled()) {
			LOG.debug(this.indexOperation + " index operation started on " + this.facetSearchConfig.getName() + "/"
					+ this.indexedType.getUniqueIndexedTypeCode() + ": " + new Date());
		}

	}

	protected void logStrategySuccess(StopWatch operationTimer) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(this.indexOperation + " index operation finished on " + this.facetSearchConfig.getName() + "/"
					+ this.indexedType.getUniqueIndexedTypeCode() + ": " + new Date() + ", total time: "
					+ operationTimer.getTotalTimeSeconds() + "s.");
		}

	}

	protected void logStrategyError(StopWatch operationTimer) {
		if (LOG.isDebugEnabled()) {
			LOG.debug(this.indexOperation + " index operation failed on " + this.facetSearchConfig.getName() + "/"
					+ this.indexedType.getUniqueIndexedTypeCode() + ": " + new Date() + ", total time: "
					+ operationTimer.getTotalTimeSeconds() + "s.");
		}

	}

	protected List<PK> resolvePks() throws IndexerException {
		return null;
	}

	protected Collection<IndexedProperty> resolveIndexedProperties() {
		return this.indexedProperties == null ? this.indexedType.getIndexedProperties().values()
				: this.indexedProperties;
	}

	protected Map<String, String> resolveIndexerHints() {
		return (Map) (this.indexerHints == null ? new HashMap() : this.indexerHints);
	}

	public IndexOperation getIndexOperation() {
		return this.indexOperation;
	}

	public void setIndexOperation(IndexOperation indexOperation) {
		this.indexOperation = indexOperation;
	}

	public FacetSearchConfig getFacetSearchConfig() {
		return this.facetSearchConfig;
	}

	public void setFacetSearchConfig(FacetSearchConfig facetSearchConfig) {
		this.facetSearchConfig = facetSearchConfig;
	}

	public IndexedType getIndexedType() {
		return this.indexedType;
	}

	public void setIndexedType(IndexedType indexedType) {
		this.indexedType = indexedType;
	}

	public Collection<IndexedProperty> getIndexedProperties() {
		return this.indexedProperties;
	}

	public void setIndexedProperties(Collection<IndexedProperty> indexedProperties) {
		this.indexedProperties = indexedProperties;
	}

	public List<PK> getPks() {
		return this.pks;
	}

	public void setPks(List<PK> pks) {
		this.pks = pks;
	}

	public Index getIndex() {
		return this.index;
	}

	public void setIndex(Index index) {
		this.index = index;
	}

	public Map<String, String> getIndexerHints() {
		return this.indexerHints;
	}

	public void setIndexerHints(Map<String, String> indexerHints) {
		this.indexerHints = indexerHints;
	}
}
