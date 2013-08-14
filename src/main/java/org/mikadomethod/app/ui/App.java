package org.mikadomethod.app.ui;

import org.mikadomethod.app.db.FileDB;


public class App {

	private UI ui;
	private static String storePath;

	public void launch() throws ApplicationException {
		ui = new UI(new FileDB(App.getStorageFile()));
		ui.showLogin();
	}

	public static String getStorageFile() {
		return storePath;
	}

	public static void setStorageFile(String storePath) {
		App.storePath = storePath;
	}

}
