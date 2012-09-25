package com.ssem.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login {

	public static void launch() throws ApplicationException {
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
