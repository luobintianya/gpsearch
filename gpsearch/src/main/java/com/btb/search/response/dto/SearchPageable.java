package com.btb.search.response.dto;

import java.io.Serializable;

public class SearchPageable<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int pageSize;

	private int currentPage;

	private int numberOfPages;

	private long totalNumberOfResults;

	private boolean needsTotal;

	public SearchPageable() {
	}

	public void setPageSize(final int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setCurrentPage(final int currentPage) {
		this.currentPage = currentPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setNumberOfPages(final int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setTotalNumberOfResults(final long totalNumberOfResults) {
		this.totalNumberOfResults = totalNumberOfResults;
	}

	public long getTotalNumberOfResults() {
		return totalNumberOfResults;
	}

	public void setNeedsTotal(final boolean needsTotal) {
		this.needsTotal = needsTotal;
	}

	public boolean isNeedsTotal() {
		return needsTotal;
	}

}
