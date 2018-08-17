package com.btb.search.core.services.index.factory.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.btb.search.core.conf.FacetSearchConfig;
import com.btb.search.core.services.index.IndexerException;
import com.btb.search.core.services.index.IndexerWorker;
import com.btb.search.core.services.index.factory.IndexerWorkerFactory;

public class DefaultIndexerWorkerFactory  implements IndexerWorkerFactory, ApplicationContextAware {
    private String workerBeanId;
    private ApplicationContext applicationContext;

    public DefaultIndexerWorkerFactory() {
    }

    public String getWorkerBeanId() {
        return this.workerBeanId;
    }

    @Required
    public void setWorkerBeanId(String workerBeanId) {
        this.workerBeanId = workerBeanId;
    }

    public ApplicationContext getApplicationContext() {
        return this.applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public IndexerWorker createIndexerWorker(FacetSearchConfig facetSearchConfig) throws IndexerException {
        try {
            return (IndexerWorker)this.applicationContext.getBean(this.workerBeanId, IndexerWorker.class);
        } catch (BeansException var3) {
            throw new IndexerException("Cannot create indexer worker [" + this.workerBeanId + "]", var3);
        }
    }
}