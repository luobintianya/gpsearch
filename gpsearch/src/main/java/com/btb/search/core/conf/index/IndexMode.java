package com.btb.search.core.conf.index;

public enum IndexMode {

	DIRECT("DIRECT"),

	TWO_PHASE("TWO_PHASE");
	private final String code;

	private IndexMode(final String code) {
		this.code = code.intern();
	}

	public String getCode() {
		return this.code;
	}

}
