package com.btb.search.core.services.index.strategy;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.btb.search.core.PK;
import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexOperation;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.conf.index.IndexedType;
import com.btb.search.core.services.index.Index;
import com.btb.search.core.services.index.IndexerException;

public interface IndexerStrategy {

    void setIndexOperation(IndexOperation opration);

    void setFacetSearchConfig(FacetSearchConfig facetSearConfig);

    void setIndexedType(IndexedType indexType);

    void setIndexedProperties(Collection<IndexedProperty> properties);

    void setPks(List<PK> pks);

    void setIndex(Index index);

    void setIndexerHints(Map<String, String> hits);

    void execute() throws IndexerException;
}