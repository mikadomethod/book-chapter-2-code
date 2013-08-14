package org.mikadomethod.app.ui;

import org.mikadomethod.app.db.Database;

public class App {
	private UI ui;

	public void launch(Database database) throws ApplicationException {
		ui = new UI(database);
		ui.showLogin();
	}
}
