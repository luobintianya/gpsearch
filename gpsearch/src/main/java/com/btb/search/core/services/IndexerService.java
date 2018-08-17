package com.btb.search.core.services;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.btb.search.core.PK;
import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.conf.index.IndexedType;
import com.btb.search.core.services.index.IndexerException;

public interface  IndexerService {

    void performFullIndex(FacetSearchConfig var1) throws IndexerException;

    void performFullIndex(FacetSearchConfig var1, Map<String, String> var2) throws IndexerException;

    void updateIndex(FacetSearchConfig var1) throws IndexerException;

    void updateIndex(FacetSearchConfig var1, Map<String, String> var2) throws IndexerException;

    void updateTypeIndex(FacetSearchConfig var1, IndexedType var2) throws IndexerException;

    void updateTypeIndex(FacetSearchConfig var1, IndexedType var2, Map<String, String> var3) throws IndexerException;

    void updateTypeIndex(FacetSearchConfig var1, IndexedType var2, List<String> var3) throws IndexerException;

    void updateTypeIndex(FacetSearchConfig var1, IndexedType var2, List<String> var3, Map<String, String> var4) throws IndexerException;

    void updatePartialTypeIndex(FacetSearchConfig var1, IndexedType var2, Collection<IndexedProperty> var3, List<PK> var4) throws IndexerException;

    void updatePartialTypeIndex(FacetSearchConfig var1, IndexedType var2, Collection<IndexedProperty> var3, List<PK> var4, Map<String, String> var5) throws IndexerException;

    void deleteFromIndex(FacetSearchConfig var1) throws IndexerException;

    void deleteFromIndex(FacetSearchConfig var1, Map<String, String> var2) throws IndexerException;

    void deleteTypeIndex(FacetSearchConfig var1, IndexedType var2) throws IndexerException;

    void deleteTypeIndex(FacetSearchConfig var1, IndexedType var2, Map<String, String> var3) throws IndexerException;

    void deleteTypeIndex(FacetSearchConfig var1, IndexedType var2, List<String> var3) throws IndexerException;

    void deleteTypeIndex(FacetSearchConfig var1, IndexedType var2, List<String> var3, Map<String, String> var4) throws IndexerException;
}
