package com.btb.search.core.conf.index;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class IndexConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private Map<String, IndexedType> indexedTypes;

	private Collection<String> versions;

	private boolean enabledLanguageFallbackMechanism;

	private Collection<String> listeners;

	private String exportPath;

	private int batchSize;

	private int numberOfThreads;

	private IndexMode indexMode;

	private CommitMode commitMode;

	private OptimizeMode optimizeMode;

	private boolean ignoreErrors;

	private boolean legacyMode;

	private int maxRetries;

	private int maxBatchRetries;

	private boolean distributedIndexing;

	private String nodeGroup;

	private String baseSite;

	public IndexConfig() {
		// default constructor
	}

	public void setIndexedTypes(final Map<String, IndexedType> indexedTypes) {
		this.indexedTypes = indexedTypes;
	}

	public Map<String, IndexedType> getIndexedTypes() {
		return indexedTypes;
	}

	public void setEnabledLanguageFallbackMechanism(final boolean enabledLanguageFallbackMechanism) {
		this.enabledLanguageFallbackMechanism = enabledLanguageFallbackMechanism;
	}

	public boolean isEnabledLanguageFallbackMechanism() {
		return enabledLanguageFallbackMechanism;
	}

	public void setListeners(final Collection<String> listeners) {
		this.listeners = listeners;
	}

	public Collection<String> getListeners() {
		return listeners;
	}

	public void setExportPath(final String exportPath) {
		this.exportPath = exportPath;
	}

	public String getExportPath() {
		return exportPath;
	}

	public void setBatchSize(final int batchSize) {
		this.batchSize = batchSize;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setNumberOfThreads(final int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}

	public int getNumberOfThreads() {
		return numberOfThreads;
	}

	public void setIndexMode(final IndexMode indexMode) {
		this.indexMode = indexMode;
	}

	public IndexMode getIndexMode() {
		return indexMode;
	}

	public void setCommitMode(final CommitMode commitMode) {
		this.commitMode = commitMode;
	}

	public CommitMode getCommitMode() {
		return commitMode;
	}

	public void setOptimizeMode(final OptimizeMode optimizeMode) {
		this.optimizeMode = optimizeMode;
	}

	public OptimizeMode getOptimizeMode() {
		return optimizeMode;
	}

	public void setIgnoreErrors(final boolean ignoreErrors) {
		this.ignoreErrors = ignoreErrors;
	}

	public boolean isIgnoreErrors() {
		return ignoreErrors;
	}

	@Deprecated
	public void setLegacyMode(final boolean legacyMode) {
		this.legacyMode = legacyMode;
	}

	@Deprecated
	public boolean isLegacyMode() {
		return legacyMode;
	}

	public void setMaxRetries(final int maxRetries) {
		this.maxRetries = maxRetries;
	}

	public int getMaxRetries() {
		return maxRetries;
	}

	public void setMaxBatchRetries(final int maxBatchRetries) {
		this.maxBatchRetries = maxBatchRetries;
	}

	public int getMaxBatchRetries() {
		return maxBatchRetries;
	}

	public void setDistributedIndexing(final boolean distributedIndexing) {
		this.distributedIndexing = distributedIndexing;
	}

	public boolean isDistributedIndexing() {
		return distributedIndexing;
	}

	public void setNodeGroup(final String nodeGroup) {
		this.nodeGroup = nodeGroup;
	}

	public String getNodeGroup() {
		return nodeGroup;
	}

}
