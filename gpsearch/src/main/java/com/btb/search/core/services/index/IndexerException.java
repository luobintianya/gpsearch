package com.btb.search.core.services.index;

public class IndexerException extends Exception {

	public IndexerException(String message) {
		super(message);
	}
	public IndexerException(String message,Exception ex) {
		super(message);
	}
	public IndexerException(Exception ex) {
		super(ex.getMessage());
	}
}
