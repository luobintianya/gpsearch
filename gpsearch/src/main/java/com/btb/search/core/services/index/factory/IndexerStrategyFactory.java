package com.btb.search.core.services.index.factory;

import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.strategy.IndexerStrategy;

public interface IndexerStrategyFactory {
	 IndexerStrategy createIndexerStrategy(FacetSearchConfig facetSearchConfig) throws IndexerException;
}
