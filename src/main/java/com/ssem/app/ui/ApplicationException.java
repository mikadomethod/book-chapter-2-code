package com.ssem.app.ui;

import com.ssem.app.db.DatabaseException;

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;

	public ApplicationException(DatabaseException e) {
		super(e);
	}


}
