package com.ssem.app.ui;



public class App {

	public static void start() throws ApplicationException {
			UI ui = new UI();
			ui.init();
			ui.showLogin();
	}

}
