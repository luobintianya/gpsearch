package com.btb.search.response.dto;

import java.util.Locale;

public abstract class AbstractQuery {
	private int count = -1;
	private int start = 0;
	private boolean needTotal = false;
	private Locale locale = null;
	private boolean failOnUnknownFields;
	private boolean disableSearchRestrictions;
	private Boolean disableSpecificDbLimitSupport;
	private boolean disableCaching;

	public AbstractQuery() {
		this.failOnUnknownFields = true;
		this.disableSearchRestrictions = false;
		this.disableSpecificDbLimitSupport = null;
		this.disableCaching = false;
	}

	public boolean isDisableSearchRestrictions() {
		return this.disableSearchRestrictions;
	}

	public void setDisableSearchRestrictions(boolean disableSearchRestrictions) {
		this.disableSearchRestrictions = disableSearchRestrictions;
	}

	public void setFailOnUnknownFields(boolean isFailOnUnknownFields) {
		this.failOnUnknownFields = isFailOnUnknownFields;
	}

	public boolean isFailOnUnknownFields() {
		return this.failOnUnknownFields;
	}

	public int getCount() {
		return this.count;
	}

	public Locale getLocale() {
		return this.locale;
	}

	public int getStart() {
		return this.start;
	}

	public boolean isNeedTotal() {
		return this.needTotal;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public void setNeedTotal(boolean needTotal) {
		this.needTotal = needTotal;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public Boolean isDisableSpecificDbLimitSupport() {
		return this.disableSpecificDbLimitSupport;
	}

	public void setDisableSpecificDbLimitSupport(Boolean disableSpecificDbLimitSupport) {
		this.disableSpecificDbLimitSupport = disableSpecificDbLimitSupport;
	}

	public boolean isDisableCaching() {
		return this.disableCaching;
	}

	public void setDisableCaching(boolean disableCaching) {
		this.disableCaching = disableCaching;
	}
}
