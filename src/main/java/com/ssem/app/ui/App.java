package com.ssem.app.ui;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ssem.app.db.Database;

public class App {

	public static void showLogin() throws ApplicationException {
			Database.setStorage("/home/ola/db.old");
			Map<String, Serializable> data = Database.load();
			List<String> users = (List<String>) data.get("users");
			new UI().setUsers(users);
	}

}
