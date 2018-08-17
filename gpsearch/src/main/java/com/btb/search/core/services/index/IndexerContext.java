package com.btb.search.core.services.index;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.btb.search.core.PK;
import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.conf.index.IndexOperation;
import com.btb.search.core.conf.index.IndexedProperty;
import com.btb.search.core.conf.index.IndexedType;

public interface IndexerContext {

    long getIndexOperationId();

    IndexOperation getIndexOperation();

    boolean isExternalIndexOperation();

    FacetSearchConfig getFacetSearchConfig();

    IndexedType getIndexedType();

    Collection<IndexedProperty> getIndexedProperties();

    List<PK> getPks();

    void setPks(List<PK> pks);

    Index getIndex();

    void setIndex(Index index);

    Map<String, String> getIndexerHints();

    Map<String, Object> getAttributes();

    IndexerContext.Status getStatus();

    List<Exception> getFailureExceptions();

    public static enum Status {
        CREATED,
        STARTING,
        EXECUTING,
        STOPPING,
        COMPLETED,
        FAILED;

        private Status() {
        }
    }
}
