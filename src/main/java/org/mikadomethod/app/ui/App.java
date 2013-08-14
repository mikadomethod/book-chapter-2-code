package org.mikadomethod.app.ui;

import org.mikadomethod.app.db.Database;

public class App {

	private UI ui;
	private static String storePath;

	public void launch(Database database) throws ApplicationException {
		ui = new UI(database);
		ui.showLogin();
	}

	public static String getStorageFile() {
		return storePath;
	}

	public static void setStorageFile(String storePath) {
		App.storePath = storePath;
	}

}
