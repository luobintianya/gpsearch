package com.btb.search.core.conf.index;

import java.util.Map;

import com.btb.search.core.conf.FacetType;
import com.btb.search.core.conf.WildcardType;

public class IndexedProperty {

	private static final long serialVersionUID = 1L;

	private String name;

	private String displayName;

	private String sortableType;

	private String type;

	private String exportId;

	private boolean facet;

	private boolean localized;

	private boolean currency;

	private boolean multiValue;

	private boolean spellCheck;

	private boolean autoSuggest;

	private boolean highlight;

	private FacetType facetType;

	private int priority;

	private boolean includeInResponse;

	private String facetDisplayNameProvider;

	private String fieldValueProvider;

	private String valueProviderParameter;

	private Map<String, String> valueProviderParameters;

	private String facetSortProvider;

	private String topValuesProvider;

	private Map<String, ValueRangeSet> valueRangeSets;

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

	private boolean categoryField;

	private boolean multiSelect;

	private boolean visible;

	public IndexedProperty() {
		// default constructor
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setSortableType(final String sortableType) {
		this.sortableType = sortableType;
	}

	public String getSortableType() {
		return sortableType;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setExportId(final String exportId) {
		this.exportId = exportId;
	}

	public String getExportId() {
		return exportId;
	}

	public void setFacet(final boolean facet) {
		this.facet = facet;
	}

	public boolean isFacet() {
		return facet;
	}

	public void setLocalized(final boolean localized) {
		this.localized = localized;
	}

	public boolean isLocalized() {
		return localized;
	}

	public void setCurrency(final boolean currency) {
		this.currency = currency;
	}

	public boolean isCurrency() {
		return currency;
	}

	public void setMultiValue(final boolean multiValue) {
		this.multiValue = multiValue;
	}

	public boolean isMultiValue() {
		return multiValue;
	}

	public void setSpellCheck(final boolean spellCheck) {
		this.spellCheck = spellCheck;
	}

	public boolean isSpellCheck() {
		return spellCheck;
	}

	public void setAutoSuggest(final boolean autoSuggest) {
		this.autoSuggest = autoSuggest;
	}

	public boolean isAutoSuggest() {
		return autoSuggest;
	}

	public void setHighlight(final boolean highlight) {
		this.highlight = highlight;
	}

	public boolean isHighlight() {
		return highlight;
	}

	public void setFacetType(final FacetType facetType) {
		this.facetType = facetType;
	}

	public FacetType getFacetType() {
		return facetType;
	}

	public void setPriority(final int priority) {
		this.priority = priority;
	}

	public int getPriority() {
		return priority;
	}

	public void setIncludeInResponse(final boolean includeInResponse) {
		this.includeInResponse = includeInResponse;
	}

	public boolean isIncludeInResponse() {
		return includeInResponse;
	}

	public void setFacetDisplayNameProvider(final String facetDisplayNameProvider) {
		this.facetDisplayNameProvider = facetDisplayNameProvider;
	}

	public String getFacetDisplayNameProvider() {
		return facetDisplayNameProvider;
	}

	public void setFieldValueProvider(final String fieldValueProvider) {
		this.fieldValueProvider = fieldValueProvider;
	}

	public String getFieldValueProvider() {
		return fieldValueProvider;
	}

	public void setValueProviderParameter(final String valueProviderParameter) {
		this.valueProviderParameter = valueProviderParameter;
	}

	public String getValueProviderParameter() {
		return valueProviderParameter;
	}

	public void setValueProviderParameters(final Map<String, String> valueProviderParameters) {
		this.valueProviderParameters = valueProviderParameters;
	}

	public Map<String, String> getValueProviderParameters() {
		return valueProviderParameters;
	}

	public void setFacetSortProvider(final String facetSortProvider) {
		this.facetSortProvider = facetSortProvider;
	}

	public String getFacetSortProvider() {
		return facetSortProvider;
	}

	public void setTopValuesProvider(final String topValuesProvider) {
		this.topValuesProvider = topValuesProvider;
	}

	public String getTopValuesProvider() {
		return topValuesProvider;
	}

	public void setValueRangeSets(final Map<String, ValueRangeSet> valueRangeSets) {
		this.valueRangeSets = valueRangeSets;
	}

	public Map<String, ValueRangeSet> getValueRangeSets() {
		return valueRangeSets;
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

	public void setCategoryField(final boolean categoryField) {
		this.categoryField = categoryField;
	}

	public boolean isCategoryField() {
		return categoryField;
	}

	public void setMultiSelect(final boolean multiSelect) {
		this.multiSelect = multiSelect;
	}

	public boolean isMultiSelect() {
		return multiSelect;
	}

	public void setVisible(final boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}

}
