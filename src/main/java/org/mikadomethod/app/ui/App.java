package org.mikadomethod.app.ui;


public class App {

	private UI ui;
	private static String storePath;

	public void launch() throws ApplicationException {
		ui = new UI();
		ui.showLogin();
	}
}
