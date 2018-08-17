package com.btb.search.core.conf.server;

import java.util.Date;

public class EndpointURL {

	private static final long serialVersionUID = 1L;

	private String url;

	private boolean master;

	private Date modifiedTime;

	public EndpointURL() {
		// default constructor
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setMaster(final boolean master) {
		this.master = master;
	}

	public boolean isMaster() {
		return master;
	}

	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

}
