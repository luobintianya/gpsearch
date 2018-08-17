package com.btb.search.core.services.index;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.btb.search.core.PK;
import com.btb.search.core.conf.index.IndexOperation;

public class IndexerWorkerParameters  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.workerNumber</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private long workerNumber;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.tenant</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String tenant;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.sessionUser</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String sessionUser;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.sessionLanguage</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String sessionLanguage;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.sessionCurrency</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String sessionCurrency;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.indexOperationId</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private long indexOperationId;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.indexOperation</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private IndexOperation indexOperation;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.externalIndexOperation</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean externalIndexOperation;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.facetSearchConfig</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String facetSearchConfig;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.indexedType</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String indexedType;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.indexedProperties</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Collection<String> indexedProperties;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.pks</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private List<PK> pks;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.index</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private String index;

	/** <i>Generated property</i> for <code>IndexerWorkerParameters.indexerHints</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Map<String,String> indexerHints;
	
	public IndexerWorkerParameters()
	{
		// default constructor
	}
	
		
	
	public void setWorkerNumber(final long workerNumber)
	{
		this.workerNumber = workerNumber;
	}

		
	
	public long getWorkerNumber() 
	{
		return workerNumber;
	}
	
		
	
	public void setTenant(final String tenant)
	{
		this.tenant = tenant;
	}

		
	
	public String getTenant() 
	{
		return tenant;
	}
	
		
	
	public void setSessionUser(final String sessionUser)
	{
		this.sessionUser = sessionUser;
	}

		
	
	public String getSessionUser() 
	{
		return sessionUser;
	}
	
		
	
	public void setSessionLanguage(final String sessionLanguage)
	{
		this.sessionLanguage = sessionLanguage;
	}

		
	
	public String getSessionLanguage() 
	{
		return sessionLanguage;
	}
	
		
	
	public void setSessionCurrency(final String sessionCurrency)
	{
		this.sessionCurrency = sessionCurrency;
	}

		
	
	public String getSessionCurrency() 
	{
		return sessionCurrency;
	}
	
		
	
	public void setIndexOperationId(final long indexOperationId)
	{
		this.indexOperationId = indexOperationId;
	}

		
	
	public long getIndexOperationId() 
	{
		return indexOperationId;
	}
	
		
	
	public void setIndexOperation(final IndexOperation indexOperation)
	{
		this.indexOperation = indexOperation;
	}

		
	
	public IndexOperation getIndexOperation() 
	{
		return indexOperation;
	}
	
		
	
	public void setExternalIndexOperation(final boolean externalIndexOperation)
	{
		this.externalIndexOperation = externalIndexOperation;
	}

		
	
	public boolean isExternalIndexOperation() 
	{
		return externalIndexOperation;
	}
	
		
	
	public void setFacetSearchConfig(final String facetSearchConfig)
	{
		this.facetSearchConfig = facetSearchConfig;
	}

		
	
	public String getFacetSearchConfig() 
	{
		return facetSearchConfig;
	}
	
		
	
	public void setIndexedType(final String indexedType)
	{
		this.indexedType = indexedType;
	}

		
	
	public String getIndexedType() 
	{
		return indexedType;
	}
	
		
	
	public void setIndexedProperties(final Collection<String> indexedProperties)
	{
		this.indexedProperties = indexedProperties;
	}

		
	
	public Collection<String> getIndexedProperties() 
	{
		return indexedProperties;
	}
	
		
	
	public void setPks(final List<PK> pks)
	{
		this.pks = pks;
	}

		
	
	public List<PK> getPks() 
	{
		return pks;
	}
	
		
	
	public void setIndex(final String index)
	{
		this.index = index;
	}

		
	
	public String getIndex() 
	{
		return index;
	}
	
		
	
	public void setIndexerHints(final Map<String,String> indexerHints)
	{
		this.indexerHints = indexerHints;
	}

		
	
	public Map<String,String> getIndexerHints() 
	{
		return indexerHints;
	}
	
}