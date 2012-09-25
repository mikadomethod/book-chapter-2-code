package com.ssem.app.db;

public class Database {

	public static DbConnection getConnection(String dbName, String username, String password) {
		return new DbConnection(dbName);
	}

}
