package com.ssem.app.db;

import java.io.FileNotFoundException;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DatabaseException(FileNotFoundException e) {
		super(e);
	}

}
