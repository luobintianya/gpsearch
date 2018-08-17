package com.btb.search.core.conf.search;

public class SearchQuerySort {

	private static final long serialVersionUID = 1L;

	private String field;

	private boolean ascending;

	public SearchQuerySort() {
		// default constructor
	}

	public void setField(final String field) {
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setAscending(final boolean ascending) {
		this.ascending = ascending;
	}

	public boolean isAscending() {
		return ascending;
	}

}
