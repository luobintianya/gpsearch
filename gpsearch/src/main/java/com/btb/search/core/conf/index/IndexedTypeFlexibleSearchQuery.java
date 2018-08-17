package com.btb.search.core.conf.index;

import java.util.Map;

public class IndexedTypeFlexibleSearchQuery {

	private static final long serialVersionUID = 1L;

	private String query;

	private String userId;

	private Map<String, Object> parameters;

	private boolean injectLastIndexTime;

	private boolean injectCurrentTime;

	private boolean injectCurrentDate;

	private IndexOperation type;

	private String parameterProviderId;

	public IndexedTypeFlexibleSearchQuery() {
		// default constructor
	}

	public void setQuery(final String query) {
		this.query = query;
	}

	public String getQuery() {
		return query;
	}

	public void setUserId(final String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setParameters(final Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setInjectLastIndexTime(final boolean injectLastIndexTime) {
		this.injectLastIndexTime = injectLastIndexTime;
	}

	public boolean isInjectLastIndexTime() {
		return injectLastIndexTime;
	}

	public void setInjectCurrentTime(final boolean injectCurrentTime) {
		this.injectCurrentTime = injectCurrentTime;
	}

	public boolean isInjectCurrentTime() {
		return injectCurrentTime;
	}

	public void setInjectCurrentDate(final boolean injectCurrentDate) {
		this.injectCurrentDate = injectCurrentDate;
	}

	public boolean isInjectCurrentDate() {
		return injectCurrentDate;
	}

	public void setType(final IndexOperation type) {
		this.type = type;
	}

	public IndexOperation getType() {
		return type;
	}

	public void setParameterProviderId(final String parameterProviderId) {
		this.parameterProviderId = parameterProviderId;
	}

	public String getParameterProviderId() {
		return parameterProviderId;
	}

}
