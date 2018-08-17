package com.btb.search.core.services.index.factory;

import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.IndexerWorker;

public interface IndexerWorkerFactory {
	IndexerWorker createIndexerWorker(FacetSearchConfig facetSearchConfig) throws IndexerException;
}
