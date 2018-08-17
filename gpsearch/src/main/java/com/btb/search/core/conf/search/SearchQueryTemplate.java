package com.btb.search.core.conf.search;

import java.util.Collection;
import java.util.Map;

import com.btb.search.core.conf.index.IndexedProperty;

public class SearchQueryTemplate {

	private static final long serialVersionUID = 1L;

	private String name;

	private boolean showFacets;

	private boolean restrictFieldsInResponse;

	private boolean enableHighlighting;

	private boolean group;

	private IndexedProperty groupProperty;

	private Integer groupLimit;

	private boolean groupFacets;

	private Integer pageSize;

	private String ftsQueryBuilder;

	private Map<String, String> ftsQueryBuilderParameters;

	private Map<String, SearchQueryProperty> searchQueryProperties;

	private Collection<SearchQuerySort> searchQuerySorts;

	public SearchQueryTemplate() {
		// default constructor
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setShowFacets(final boolean showFacets) {
		this.showFacets = showFacets;
	}

	public boolean isShowFacets() {
		return showFacets;
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

	public void setGroup(final boolean group) {
		this.group = group;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroupProperty(final IndexedProperty groupProperty) {
		this.groupProperty = groupProperty;
	}

	public IndexedProperty getGroupProperty() {
		return groupProperty;
	}

	public void setGroupLimit(final Integer groupLimit) {
		this.groupLimit = groupLimit;
	}

	public Integer getGroupLimit() {
		return groupLimit;
	}

	public void setGroupFacets(final boolean groupFacets) {
		this.groupFacets = groupFacets;
	}

	public boolean isGroupFacets() {
		return groupFacets;
	}

	public void setPageSize(final Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setFtsQueryBuilder(final String ftsQueryBuilder) {
		this.ftsQueryBuilder = ftsQueryBuilder;
	}

	public String getFtsQueryBuilder() {
		return ftsQueryBuilder;
	}

	public void setFtsQueryBuilderParameters(final Map<String, String> ftsQueryBuilderParameters) {
		this.ftsQueryBuilderParameters = ftsQueryBuilderParameters;
	}

	public Map<String, String> getFtsQueryBuilderParameters() {
		return ftsQueryBuilderParameters;
	}

	public void setSearchQueryProperties(final Map<String, SearchQueryProperty> searchQueryProperties) {
		this.searchQueryProperties = searchQueryProperties;
	}

	public Map<String, SearchQueryProperty> getSearchQueryProperties() {
		return searchQueryProperties;
	}

	public void setSearchQuerySorts(final Collection<SearchQuerySort> searchQuerySorts) {
		this.searchQuerySorts = searchQuerySorts;
	}

	public Collection<SearchQuerySort> getSearchQuerySorts() {
		return searchQuerySorts;
	}

}
