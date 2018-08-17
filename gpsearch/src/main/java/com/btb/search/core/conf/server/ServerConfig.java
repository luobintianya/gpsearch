package com.btb.search.core.conf.server;

import java.util.Date;
import java.util.List;

import com.btb.search.core.conf.client.ElasticClientConfig;

public class ServerConfig {

	private static final long serialVersionUID = 1L;

	private String name;

	private ServerMode mode;

	private List<EndpointURL> endpointURLs;

	private boolean useMasterNodeExclusivelyForIndexing;

	private Integer numShards;

	private Integer replicationFactor;

	private ElasticClientConfig clientConfig;

	private ElasticClientConfig indexingClientConfig;

	private QueryMethod queryMethod;

	private Date modifiedTime;

	private String version;

	public ServerConfig() {
		// default constructor
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMode(final ServerMode mode) {
		this.mode = mode;
	}

	public ServerMode getMode() {
		return mode;
	}

	public void setEndpointURLs(final List<EndpointURL> endpointURLs) {
		this.endpointURLs = endpointURLs;
	}

	public List<EndpointURL> getEndpointURLs() {
		return endpointURLs;
	}

	public void setUseMasterNodeExclusivelyForIndexing(final boolean useMasterNodeExclusivelyForIndexing) {
		this.useMasterNodeExclusivelyForIndexing = useMasterNodeExclusivelyForIndexing;
	}

	public boolean isUseMasterNodeExclusivelyForIndexing() {
		return useMasterNodeExclusivelyForIndexing;
	}

	public void setNumShards(final Integer numShards) {
		this.numShards = numShards;
	}

	public Integer getNumShards() {
		return numShards;
	}

	public void setReplicationFactor(final Integer replicationFactor) {
		this.replicationFactor = replicationFactor;
	}

	public Integer getReplicationFactor() {
		return replicationFactor;
	}

	public void setClientConfig(final ElasticClientConfig clientConfig) {
		this.clientConfig = clientConfig;
	}

	public ElasticClientConfig getClientConfig() {
		return clientConfig;
	}

	public void setIndexingClientConfig(final ElasticClientConfig indexingClientConfig) {
		this.indexingClientConfig = indexingClientConfig;
	}

	public ElasticClientConfig getIndexingClientConfig() {
		return indexingClientConfig;
	}

	public void setQueryMethod(final QueryMethod queryMethod) {
		this.queryMethod = queryMethod;
	}

	public QueryMethod getQueryMethod() {
		return queryMethod;
	}

	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setVersion(final String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

}
