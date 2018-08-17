package com.btb.search.core.conf.client;

public class ElasticClientConfig {

	private static final long serialVersionUID = 1L;

	private Integer aliveCheckInterval;

	private Integer connectionTimeout;

	private Integer socketTimeout;

	private Integer maxConnections;

	private Integer maxConnectionsPerHost;

	private boolean tcpNoDelay;

	private String username;

	private String password;

	public ElasticClientConfig() {
		// default constructor
	}

	public void setAliveCheckInterval(final Integer aliveCheckInterval) {
		this.aliveCheckInterval = aliveCheckInterval;
	}

	public Integer getAliveCheckInterval() {
		return aliveCheckInterval;
	}

	public void setConnectionTimeout(final Integer connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public Integer getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setSocketTimeout(final Integer socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	public Integer getSocketTimeout() {
		return socketTimeout;
	}

	public void setMaxConnections(final Integer maxConnections) {
		this.maxConnections = maxConnections;
	}

	public Integer getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnectionsPerHost(final Integer maxConnectionsPerHost) {
		this.maxConnectionsPerHost = maxConnectionsPerHost;
	}

	public Integer getMaxConnectionsPerHost() {
		return maxConnectionsPerHost;
	}

	public void setTcpNoDelay(final boolean tcpNoDelay) {
		this.tcpNoDelay = tcpNoDelay;
	}

	public boolean isTcpNoDelay() {
		return tcpNoDelay;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
