package com.btb.search.core.conf.search;

import com.btb.search.core.conf.FacetType;
import com.btb.search.core.conf.WildcardType;

public class SearchQueryProperty {

	private static final long serialVersionUID = 1L;

	private String indexedProperty;

	private boolean facet;

	private FacetType facetType;

	private Integer priority;

	private boolean includeInResponse;

	private boolean highlight;

	private String facetDisplayNameProvider;

	private String facetSortProvider;

	private String facetTopValuesProvider;

	private boolean ftsQuery;

	private Integer ftsQueryMinTermLength;

	private Float ftsQueryBoost;

	private boolean ftsFuzzyQuery;

	private Integer ftsFuzzyQueryMinTermLength;

	private Integer ftsFuzzyQueryFuzziness;

	private Float ftsFuzzyQueryBoost;

	private boolean ftsWildcardQuery;

	private Integer ftsWildcardQueryMinTermLength;

	private WildcardType ftsWildcardQueryType;

	private Float ftsWildcardQueryBoost;

	private boolean ftsPhraseQuery;

	private Float ftsPhraseQuerySlop;

	private Float ftsPhraseQueryBoost;

	public SearchQueryProperty() {
		// default constructor
	}

	public void setIndexedProperty(final String indexedProperty) {
		this.indexedProperty = indexedProperty;
	}

	public String getIndexedProperty() {
		return indexedProperty;
	}

	public void setFacet(final boolean facet) {
		this.facet = facet;
	}

	public boolean isFacet() {
		return facet;
	}

	public void setFacetType(final FacetType facetType) {
		this.facetType = facetType;
	}

	public FacetType getFacetType() {
		return facetType;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setIncludeInResponse(final boolean includeInResponse) {
		this.includeInResponse = includeInResponse;
	}

	public boolean isIncludeInResponse() {
		return includeInResponse;
	}

	public void setHighlight(final boolean highlight) {
		this.highlight = highlight;
	}

	public boolean isHighlight() {
		return highlight;
	}

	public void setFacetDisplayNameProvider(final String facetDisplayNameProvider) {
		this.facetDisplayNameProvider = facetDisplayNameProvider;
	}

	public String getFacetDisplayNameProvider() {
		return facetDisplayNameProvider;
	}

	public void setFacetSortProvider(final String facetSortProvider) {
		this.facetSortProvider = facetSortProvider;
	}

	public String getFacetSortProvider() {
		return facetSortProvider;
	}

	public void setFacetTopValuesProvider(final String facetTopValuesProvider) {
		this.facetTopValuesProvider = facetTopValuesProvider;
	}

	public String getFacetTopValuesProvider() {
		return facetTopValuesProvider;
	}

	public void setFtsQuery(final boolean ftsQuery) {
		this.ftsQuery = ftsQuery;
	}

	public boolean isFtsQuery() {
		return ftsQuery;
	}

	public void setFtsQueryMinTermLength(final Integer ftsQueryMinTermLength) {
		this.ftsQueryMinTermLength = ftsQueryMinTermLength;
	}

	public Integer getFtsQueryMinTermLength() {
		return ftsQueryMinTermLength;
	}

	public void setFtsQueryBoost(final Float ftsQueryBoost) {
		this.ftsQueryBoost = ftsQueryBoost;
	}

	public Float getFtsQueryBoost() {
		return ftsQueryBoost;
	}

	public void setFtsFuzzyQuery(final boolean ftsFuzzyQuery) {
		this.ftsFuzzyQuery = ftsFuzzyQuery;
	}

	public boolean isFtsFuzzyQuery() {
		return ftsFuzzyQuery;
	}

	public void setFtsFuzzyQueryMinTermLength(final Integer ftsFuzzyQueryMinTermLength) {
		this.ftsFuzzyQueryMinTermLength = ftsFuzzyQueryMinTermLength;
	}

	public Integer getFtsFuzzyQueryMinTermLength() {
		return ftsFuzzyQueryMinTermLength;
	}

	public void setFtsFuzzyQueryFuzziness(final Integer ftsFuzzyQueryFuzziness) {
		this.ftsFuzzyQueryFuzziness = ftsFuzzyQueryFuzziness;
	}

	public Integer getFtsFuzzyQueryFuzziness() {
		return ftsFuzzyQueryFuzziness;
	}

	public void setFtsFuzzyQueryBoost(final Float ftsFuzzyQueryBoost) {
		this.ftsFuzzyQueryBoost = ftsFuzzyQueryBoost;
	}

	public Float getFtsFuzzyQueryBoost() {
		return ftsFuzzyQueryBoost;
	}

	public void setFtsWildcardQuery(final boolean ftsWildcardQuery) {
		this.ftsWildcardQuery = ftsWildcardQuery;
	}

	public boolean isFtsWildcardQuery() {
		return ftsWildcardQuery;
	}

	public void setFtsWildcardQueryMinTermLength(final Integer ftsWildcardQueryMinTermLength) {
		this.ftsWildcardQueryMinTermLength = ftsWildcardQueryMinTermLength;
	}

	public Integer getFtsWildcardQueryMinTermLength() {
		return ftsWildcardQueryMinTermLength;
	}

	public void setFtsWildcardQueryType(final WildcardType ftsWildcardQueryType) {
		this.ftsWildcardQueryType = ftsWildcardQueryType;
	}

	public WildcardType getFtsWildcardQueryType() {
		return ftsWildcardQueryType;
	}

	public void setFtsWildcardQueryBoost(final Float ftsWildcardQueryBoost) {
		this.ftsWildcardQueryBoost = ftsWildcardQueryBoost;
	}

	public Float getFtsWildcardQueryBoost() {
		return ftsWildcardQueryBoost;
	}

	public void setFtsPhraseQuery(final boolean ftsPhraseQuery) {
		this.ftsPhraseQuery = ftsPhraseQuery;
	}

	public boolean isFtsPhraseQuery() {
		return ftsPhraseQuery;
	}

	public void setFtsPhraseQuerySlop(final Float ftsPhraseQuerySlop) {
		this.ftsPhraseQuerySlop = ftsPhraseQuerySlop;
	}

	public Float getFtsPhraseQuerySlop() {
		return ftsPhraseQuerySlop;
	}

	public void setFtsPhraseQueryBoost(final Float ftsPhraseQueryBoost) {
		this.ftsPhraseQueryBoost = ftsPhraseQueryBoost;
	}

	public Float getFtsPhraseQueryBoost() {
		return ftsPhraseQueryBoost;
	}

}
