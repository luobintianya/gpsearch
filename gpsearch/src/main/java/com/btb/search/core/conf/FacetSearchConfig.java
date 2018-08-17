package com.btb.search.core.conf;

import com.btb.search.core.conf.index.IndexConfig;
import com.btb.search.core.conf.search.SearchConfig;
import com.btb.search.core.conf.server.ElasticConfig;

public class FacetSearchConfig {

	private static final long serialVersionUID = 1L;

	private String name;

	private String description;

	private IndexConfig indexConfig;

	private SearchConfig searchConfig;

	private ElasticConfig solrConfig;

	public FacetSearchConfig() {
		// default constructor
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setIndexConfig(final IndexConfig indexConfig) {
		this.indexConfig = indexConfig;
	}

	public IndexConfig getIndexConfig() {
		return indexConfig;
	}

	public void setSearchConfig(final SearchConfig searchConfig) {
		this.searchConfig = searchConfig;
	}

	public SearchConfig getSearchConfig() {
		return searchConfig;
	}

	public void setSolrConfig(final ElasticConfig solrConfig) {
		this.solrConfig = solrConfig;
	}

	public ElasticConfig getSolrConfig() {
		return solrConfig;
	}

}
