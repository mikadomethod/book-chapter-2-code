package com.ssem.app.ui;

import com.ssem.app.db.Configuration;

public class App {

	private final Configuration configuration;

	public App(Configuration configuration) {
		this.configuration = configuration;
	}

	public void init() {
		configuration.setStorage("/home/ola/db.old");		
	}
	
	public void launch() throws ApplicationException {
			UI ui = new UI();
			ui.showLogin();
	}


}
