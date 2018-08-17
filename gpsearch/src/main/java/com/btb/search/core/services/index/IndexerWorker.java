package com.btb.search.core.services.index;

public   interface IndexerWorker extends Runnable {
    void initialize(IndexerWorkerParameters parameters);

    boolean isInitialized();
}
