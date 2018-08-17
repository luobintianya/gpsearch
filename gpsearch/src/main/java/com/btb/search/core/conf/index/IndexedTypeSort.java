package com.btb.search.core.conf.index;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class IndexedTypeSort implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;

	private String name;

	private Map<String, String> localizedName;

	private boolean applyPromotedItems;

	private List<IndexedTypeSortField> fields;

	public IndexedTypeSort() {
		// default constructor
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLocalizedName(final Map<String, String> localizedName) {
		this.localizedName = localizedName;
	}

	public Map<String, String> getLocalizedName() {
		return localizedName;
	}

	public void setApplyPromotedItems(final boolean applyPromotedItems) {
		this.applyPromotedItems = applyPromotedItems;
	}

	public boolean isApplyPromotedItems() {
		return applyPromotedItems;
	}

	public void setFields(final List<IndexedTypeSortField> fields) {
		this.fields = fields;
	}

	public List<IndexedTypeSortField> getFields() {
		return fields;
	}

}
