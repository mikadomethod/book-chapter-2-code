package com.ssem.app;

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;

	public ApplicationException(DatabaseException e) {
		super(e);
	}


}
