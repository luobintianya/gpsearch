package com.btb.search.core.services.index;

import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexedType;

public interface Index {

    String getName();

    FacetSearchConfig getFacetSearchConfig();

    IndexedType getIndexedType();

    String getQualifier();
}
