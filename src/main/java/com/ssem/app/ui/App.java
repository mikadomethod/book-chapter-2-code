package com.ssem.app.ui;

import com.ssem.app.db.Configuration;
import com.ssem.app.db.Database;




public class App {

	public void init() {
		Configuration.setStorage("/home/ola/db.old");		
	}
	
	public void start() throws ApplicationException {
			UI ui = new UI();
			Database db = new Database();
			ui.setDatabase(db);
			ui.showLogin();
	}


}
