package org.mikadomethod.app.ui;


public class App {

	private UI ui;
	private static String storePath;

	public void launch() throws ApplicationException {
		ui = new UI();
		ui.showLogin();
	}

	public static String getStorageFile() {
		return storePath;
	}

	public static void setStorageFile(String storePath) {
		App.storePath = storePath;
	}

}
