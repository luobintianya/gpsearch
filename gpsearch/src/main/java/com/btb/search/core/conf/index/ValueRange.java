package com.btb.search.core.conf.index;

import java.io.Serializable;

public class ValueRange implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	private Comparable from;

	private Comparable to;

	public ValueRange() {
		// default constructor
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setFrom(final Comparable from) {
		this.from = from;
	}

	public Comparable getFrom() {
		return from;
	}

	public void setTo(final Comparable to) {
		this.to = to;
	}

	public Comparable getTo() {
		return to;
	}

}
