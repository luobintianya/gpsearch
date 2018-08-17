package com.btb.search.core.conf.index;

import java.io.Serializable;

public class IndexedTypeSortField implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fieldName;

	private boolean ascending;

	public IndexedTypeSortField() {
		// default constructor
	}

	public void setFieldName(final String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setAscending(final boolean ascending) {
		this.ascending = ascending;
	}

	public boolean isAscending() {
		return ascending;
	}

}
