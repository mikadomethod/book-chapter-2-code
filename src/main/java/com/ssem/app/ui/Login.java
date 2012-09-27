package com.ssem.app.ui;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ssem.app.db.Database;
import com.ssem.app.db.DatabaseException;
import com.ssem.app.db.DbConnection;

public class Login {

	public static void showScreen() throws ApplicationException {
		DbConnection connection = null;
		try {
			connection = Database.getConnection("db", "user", "password");
		} catch (DatabaseException e) {
			throw new ApplicationException(e);
		}
		
		if (connection != null) {
			Map<String, Serializable> data = connection.load();
			List<String> users = (List<String>) data.get("users");
			new UI().setUsers(users);
		}
		
	}

}
