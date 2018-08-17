package com.btb.search.core.conf.index;

import java.io.Serializable;
import java.util.List;

import com.btb.search.core.conf.ValueRangeType;

public class ValueRangeSet implements Serializable {

	private static final long serialVersionUID = 1L;

	private String qualifier;

	private List<ValueRange> valueRanges;

	private ValueRangeType type;

	public ValueRangeSet() {
		// default constructor
	}

	public void setQualifier(final String qualifier) {
		this.qualifier = qualifier;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setValueRanges(final List<ValueRange> valueRanges) {
		this.valueRanges = valueRanges;
	}

	public List<ValueRange> getValueRanges() {
		return valueRanges;
	}

	public void setType(final ValueRangeType type) {
		this.type = type;
	}

	public ValueRangeType getType() {
		return type;
	}

}
