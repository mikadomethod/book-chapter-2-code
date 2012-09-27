package com.ssem.app.ui;

import com.ssem.app.db.Configuration;

public class App {

	public void init() {
		Configuration.setStorage("/home/ola/db.old");		
	}
	
	public void launch() throws ApplicationException {
			UI ui = new UI();
			ui.showLogin();
	}


}
