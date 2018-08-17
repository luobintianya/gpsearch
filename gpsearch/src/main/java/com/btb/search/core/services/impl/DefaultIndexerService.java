package com.btb.search.core.services.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

import com.btb.search.core.PK;
import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexConfig;
import com.btb.search.core.conf.index.IndexOperation;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.conf.index.IndexedType;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.factory.IndexerStrategyFactory;
import com.btb.search.core.services.index.strategy.IndexerStrategy;

public class DefaultIndexerService {

	private IndexerStrategyFactory indexerStrategyFactory;

	public DefaultIndexerService() {
	}

	public IndexerStrategyFactory getIndexerStrategyFactory() {
		return this.indexerStrategyFactory;
	}

	@Required
	public void setIndexerStrategyFactory(IndexerStrategyFactory indexerStrategyFactory) {
		this.indexerStrategyFactory = indexerStrategyFactory;
	}

	public void performFullIndex(FacetSearchConfig facetSearchConfig) throws IndexerException {
		this.performFullIndex(facetSearchConfig, Collections.EMPTY_MAP);
	}

	public void performFullIndex(FacetSearchConfig facetSearchConfig, Map<String, String> indexerHints)
			throws IndexerException {
		IndexConfig indexConfig = facetSearchConfig.getIndexConfig();
		Iterator var5 = indexConfig.getIndexedTypes().values().iterator();

		while (var5.hasNext()) {
			IndexedType indexedType = (IndexedType) var5.next();
			IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
			indexerStrategy.setIndexOperation(IndexOperation.FULL);
			indexerStrategy.setFacetSearchConfig(facetSearchConfig);
			indexerStrategy.setIndexedType(indexedType);
			indexerStrategy.setIndexerHints(indexerHints);
			indexerStrategy.execute();
		}

	}

	public void updateIndex(FacetSearchConfig facetSearchConfig) throws IndexerException {
		this.updateIndex(facetSearchConfig, Collections.EMPTY_MAP);
	}

	public void updateIndex(FacetSearchConfig facetSearchConfig, Map<String, String> indexerHints)
			throws IndexerException {
		IndexConfig indexConfig = facetSearchConfig.getIndexConfig();
		Iterator var5 = indexConfig.getIndexedTypes().values().iterator();

		while (var5.hasNext()) {
			IndexedType indexedType = (IndexedType) var5.next();
			IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
			indexerStrategy.setIndexOperation(IndexOperation.UPDATE);
			indexerStrategy.setFacetSearchConfig(facetSearchConfig);
			indexerStrategy.setIndexedType(indexedType);
			indexerStrategy.setIndexerHints(indexerHints);
			indexerStrategy.execute();
		}

	}

	public void updateTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType) throws IndexerException {
		this.updateTypeIndex(facetSearchConfig, indexedType, Collections.EMPTY_MAP);
	}

	public void updateTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType,
			Map<String, String> indexerHints) throws IndexerException {
		IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
		indexerStrategy.setIndexOperation(IndexOperation.UPDATE);
		indexerStrategy.setFacetSearchConfig(facetSearchConfig);
		indexerStrategy.setIndexedType(indexedType);
		indexerStrategy.setIndexerHints(indexerHints);
		indexerStrategy.execute();
	}

	public void updateTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType, List<PK> pks)
			throws IndexerException {
		this.updateTypeIndex(facetSearchConfig, indexedType, pks, Collections.EMPTY_MAP);
	}

	public void updateTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType, List<PK> pks,
			Map<String, String> indexerHints) throws IndexerException {
		IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
		indexerStrategy.setIndexOperation(IndexOperation.UPDATE);
		indexerStrategy.setFacetSearchConfig(facetSearchConfig);
		indexerStrategy.setIndexedType(indexedType);
		indexerStrategy.setPks(pks);
		indexerStrategy.setIndexerHints(indexerHints);
		indexerStrategy.execute();
	}

	public void updatePartialTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType,
			Collection<IndexedProperty> indexedProperties, List<PK> pks) throws IndexerException {
		this.updatePartialTypeIndex(facetSearchConfig, indexedType, indexedProperties, pks, Collections.EMPTY_MAP);
	}

	public void updatePartialTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType,
			Collection<IndexedProperty> indexedProperties, List<PK> pks, Map<String, String> indexerHints)
			throws IndexerException {
		IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
		indexerStrategy.setIndexOperation(IndexOperation.PARTIAL_UPDATE);
		indexerStrategy.setFacetSearchConfig(facetSearchConfig);
		indexerStrategy.setIndexedType(indexedType);
		indexerStrategy.setIndexedProperties(indexedProperties);
		indexerStrategy.setPks(pks);
		indexerStrategy.setIndexerHints(indexerHints);
		indexerStrategy.execute();
	}

	public void deleteFromIndex(FacetSearchConfig facetSearchConfig) throws IndexerException {
		this.deleteFromIndex(facetSearchConfig, (Map<String, String>) Collections.EMPTY_MAP);
	}

	public void deleteFromIndex(FacetSearchConfig facetSearchConfig, Map<String, String> indexerHints)
			throws IndexerException {
		IndexConfig indexConfig = facetSearchConfig.getIndexConfig();
		Iterator var5 = indexConfig.getIndexedTypes().values().iterator();

		while (var5.hasNext()) {
			IndexedType indexedType = (IndexedType) var5.next();
			IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
			indexerStrategy.setIndexOperation(IndexOperation.DELETE);
			indexerStrategy.setFacetSearchConfig(facetSearchConfig);
			indexerStrategy.setIndexedType(indexedType);
			indexerStrategy.setIndexerHints(indexerHints);
			indexerStrategy.execute();
		}

	}

	public void deleteTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType) throws IndexerException {
		this.deleteTypeIndex(facetSearchConfig, indexedType, Collections.EMPTY_MAP);
	}

	public void deleteTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType,
			Map<String, String> indexerHints) throws IndexerException {
		IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
		indexerStrategy.setIndexOperation(IndexOperation.DELETE);
		indexerStrategy.setFacetSearchConfig(facetSearchConfig);
		indexerStrategy.setIndexedType(indexedType);
		indexerStrategy.setIndexerHints(indexerHints);
		indexerStrategy.execute();
	}

	public void deleteTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType, List<PK> pks)
			throws IndexerException {
		this.deleteTypeIndex(facetSearchConfig, indexedType, pks, Collections.EMPTY_MAP);
	}

	public void deleteTypeIndex(FacetSearchConfig facetSearchConfig, IndexedType indexedType, List<PK> pks,
			Map<String, String> indexerHints) throws IndexerException {
		IndexerStrategy indexerStrategy = this.createIndexerStrategy(facetSearchConfig);
		indexerStrategy.setIndexOperation(IndexOperation.DELETE);
		indexerStrategy.setFacetSearchConfig(facetSearchConfig);
		indexerStrategy.setIndexedType(indexedType);
		indexerStrategy.setPks(pks);
		indexerStrategy.setIndexerHints(indexerHints);
		indexerStrategy.execute();
	}

	protected IndexerStrategy createIndexerStrategy(FacetSearchConfig facetSearchConfig) throws IndexerException {
		return this.indexerStrategyFactory.createIndexerStrategy(facetSearchConfig);
	}
}
