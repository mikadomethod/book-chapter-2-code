package org.mikadomethod.app;

import org.mikadomethod.app.db.FileDB;
import org.mikadomethod.app.ui.App;
import org.mikadomethod.app.ui.ApplicationException;

public class Launcher {
	public static void main(String[] argv) {
		try {
			App app = new App();
			app.launch(new FileDB(argv[0]));
		} catch (ApplicationException e) {
			System.err.println("Could not start application");
			e.printStackTrace();
		}
	}
}
