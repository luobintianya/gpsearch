package com.btb.search.core.conf.index;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.btb.search.core.conf.search.SearchQueryTemplate;

public class IndexedType {

	private static final long serialVersionUID = 1L;

	private String identifier;

	private Map<String, IndexedProperty> indexedProperties;

	private Map<IndexOperation, IndexedTypeFlexibleSearchQuery> flexibleSearchQueries;

	private String composedType;

	private boolean variant;

	private boolean staged;

	private String identityProvider;

	private String modelLoader;

	private String indexName;

	private String indexNameFromConfig;

	private Set<String> typeFacets;

	private String defaultFieldValueProvider;

	private String fieldsValuesProvider;

	private String solrResultConverter;

	private String code;

	private String uniqueIndexedTypeCode;

	private boolean group;

	private String groupFieldName;

	private int groupLimit;

	private boolean groupFacets;

	private Collection<String> listeners;

	private String configSet;

	private String ftsQueryBuilder;

	private Map<String, String> ftsQueryBuilderParameters;

	private Map<String, SearchQueryTemplate> searchQueryTemplates;

	private Map<String, String> additionalParameters;

	private List<IndexedTypeSort> sorts;

	private Map<String, IndexedTypeSort> sortsByCode;

	public IndexedType() {
		// default constructor
	}

	public void setIdentifier(final String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIndexedProperties(final Map<String, IndexedProperty> indexedProperties) {
		this.indexedProperties = indexedProperties;
	}

	public Map<String, IndexedProperty> getIndexedProperties() {
		return indexedProperties;
	}

	public void setFlexibleSearchQueries(
			final Map<IndexOperation, IndexedTypeFlexibleSearchQuery> flexibleSearchQueries) {
		this.flexibleSearchQueries = flexibleSearchQueries;
	}

	public Map<IndexOperation, IndexedTypeFlexibleSearchQuery> getFlexibleSearchQueries() {
		return flexibleSearchQueries;
	}

	public void setComposedType(final String composedType) {
		this.composedType = composedType;
	}

	public String getComposedType() {
		return composedType;
	}

	public void setVariant(final boolean variant) {
		this.variant = variant;
	}

	public boolean isVariant() {
		return variant;
	}

	public void setStaged(final boolean staged) {
		this.staged = staged;
	}

	public boolean isStaged() {
		return staged;
	}

	public void setIdentityProvider(final String identityProvider) {
		this.identityProvider = identityProvider;
	}

	public String getIdentityProvider() {
		return identityProvider;
	}

	public void setModelLoader(final String modelLoader) {
		this.modelLoader = modelLoader;
	}

	public String getModelLoader() {
		return modelLoader;
	}

	public void setIndexName(final String indexName) {
		this.indexName = indexName;
	}

	public String getIndexName() {
		return indexName;
	}

	public void setIndexNameFromConfig(final String indexNameFromConfig) {
		this.indexNameFromConfig = indexNameFromConfig;
	}

	public String getIndexNameFromConfig() {
		return indexNameFromConfig;
	}

	public void setTypeFacets(final Set<String> typeFacets) {
		this.typeFacets = typeFacets;
	}

	public Set<String> getTypeFacets() {
		return typeFacets;
	}

	public void setDefaultFieldValueProvider(final String defaultFieldValueProvider) {
		this.defaultFieldValueProvider = defaultFieldValueProvider;
	}

	public String getDefaultFieldValueProvider() {
		return defaultFieldValueProvider;
	}

	public void setFieldsValuesProvider(final String fieldsValuesProvider) {
		this.fieldsValuesProvider = fieldsValuesProvider;
	}

	public String getFieldsValuesProvider() {
		return fieldsValuesProvider;
	}

	public void setSolrResultConverter(final String solrResultConverter) {
		this.solrResultConverter = solrResultConverter;
	}

	public String getSolrResultConverter() {
		return solrResultConverter;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setUniqueIndexedTypeCode(final String uniqueIndexedTypeCode) {
		this.uniqueIndexedTypeCode = uniqueIndexedTypeCode;
	}

	public String getUniqueIndexedTypeCode() {
		return uniqueIndexedTypeCode;
	}

	public void setGroup(final boolean group) {
		this.group = group;
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroupFieldName(final String groupFieldName) {
		this.groupFieldName = groupFieldName;
	}

	public String getGroupFieldName() {
		return groupFieldName;
	}

	public void setGroupLimit(final int groupLimit) {
		this.groupLimit = groupLimit;
	}

	public int getGroupLimit() {
		return groupLimit;
	}

	public void setGroupFacets(final boolean groupFacets) {
		this.groupFacets = groupFacets;
	}

	public boolean isGroupFacets() {
		return groupFacets;
	}

	public void setListeners(final Collection<String> listeners) {
		this.listeners = listeners;
	}

	public Collection<String> getListeners() {
		return listeners;
	}

	public void setConfigSet(final String configSet) {
		this.configSet = configSet;
	}

	public String getConfigSet() {
		return configSet;
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

	public void setSearchQueryTemplates(final Map<String, SearchQueryTemplate> searchQueryTemplates) {
		this.searchQueryTemplates = searchQueryTemplates;
	}

	public Map<String, SearchQueryTemplate> getSearchQueryTemplates() {
		return searchQueryTemplates;
	}

	public void setAdditionalParameters(final Map<String, String> additionalParameters) {
		this.additionalParameters = additionalParameters;
	}

	public Map<String, String> getAdditionalParameters() {
		return additionalParameters;
	}

	public void setSorts(final List<IndexedTypeSort> sorts) {
		this.sorts = sorts;
	}

	public List<IndexedTypeSort> getSorts() {
		return sorts;
	}

	public void setSortsByCode(final Map<String, IndexedTypeSort> sortsByCode) {
		this.sortsByCode = sortsByCode;
	}

	public Map<String, IndexedTypeSort> getSortsByCode() {
		return sortsByCode;
	}

}
