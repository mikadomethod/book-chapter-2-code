package com.ssem.app;

import com.ssem.app.ui.App;
import com.ssem.app.ui.ApplicationException;

public class Launcher {

	public static void main(String[] argv) {
			try {
				App.setStorageFile("/home/ola/db.old");
				App app = new App();
				app.launch();
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
