package com.btb.search.core.services.index.factory.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;

import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.strategy.IndexerStrategy;

public class DefaultIndexerStrategyFactory {
	private String indexerStrategyBeanId;
	private String distributedIndexerStrategyBeanId;
	private ApplicationContext applicationContext;

	public DefaultIndexerStrategyFactory() {
	}

	public String getIndexerStrategyBeanId() {
		return this.indexerStrategyBeanId;
	}

	@Required
	public void setIndexerStrategyBeanId(String indexerStrategyBeanId) {
		this.indexerStrategyBeanId = indexerStrategyBeanId;
	}

	public String getDistributedIndexerStrategyBeanId() {
		return this.distributedIndexerStrategyBeanId;
	}

	@Required
	public void setDistributedIndexerStrategyBeanId(String distributedIndexerStrategyBeanId) {
		this.distributedIndexerStrategyBeanId = distributedIndexerStrategyBeanId;
	}

	public ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public IndexerStrategy createIndexerStrategy(FacetSearchConfig facetSearchConfig) throws IndexerException {
		try {
			return facetSearchConfig.getIndexConfig().isDistributedIndexing()
					? (IndexerStrategy) this.applicationContext.getBean(this.distributedIndexerStrategyBeanId,
							IndexerStrategy.class)
					: (IndexerStrategy) this.applicationContext.getBean(this.indexerStrategyBeanId,
							IndexerStrategy.class);
		} catch (BeansException bean) {
			throw new IndexerException("Cannot create indexer strategy [" + this.indexerStrategyBeanId + "]", bean);
		}
	}
}
