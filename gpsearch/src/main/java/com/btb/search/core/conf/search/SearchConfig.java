package com.btb.search.core.conf.search;

import java.util.Collection;

import com.btb.search.core.conf.index.IndexedProperty;

public class SearchConfig {

	private static final long serialVersionUID = 1L;

	private Collection<String> defaultSortOrder;

	private int pageSize;

	private boolean allFacetValuesInResponse;

	private boolean restrictFieldsInResponse;

	private boolean enableHighlighting;

	private boolean legacyMode;

	private IndexedProperty groupingProperty;

	public SearchConfig() {
		// default constructor
	}

	public void setDefaultSortOrder(final Collection<String> defaultSortOrder) {
		this.defaultSortOrder = defaultSortOrder;
	}

	public Collection<String> getDefaultSortOrder() {
		return defaultSortOrder;
	}

	public void setPageSize(final int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setAllFacetValuesInResponse(final boolean allFacetValuesInResponse) {
		this.allFacetValuesInResponse = allFacetValuesInResponse;
	}

	public boolean isAllFacetValuesInResponse() {
		return allFacetValuesInResponse;
	}

	public void setRestrictFieldsInResponse(final boolean restrictFieldsInResponse) {
		this.restrictFieldsInResponse = restrictFieldsInResponse;
	}

	public boolean isRestrictFieldsInResponse() {
		return restrictFieldsInResponse;
	}

	public void setEnableHighlighting(final boolean enableHighlighting) {
		this.enableHighlighting = enableHighlighting;
	}

	public boolean isEnableHighlighting() {
		return enableHighlighting;
	}

	public void setGroupingProperty(final IndexedProperty groupingProperty) {
		this.groupingProperty = groupingProperty;
	}

	public IndexedProperty getGroupingProperty() {
		return groupingProperty;
	}

}
