package org.mikadomethod.app.ui;

import org.mikadomethod.app.db.DatabaseException;

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;

	public ApplicationException(DatabaseException e) {
		super(e);
	}


}
