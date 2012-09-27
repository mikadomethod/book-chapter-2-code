package com.ssem.app;

import com.ssem.app.db.Database;
import com.ssem.app.ui.ApplicationException;
import com.ssem.app.ui.App;

public class Launcher {

	public static void main(String[] argv) {
			try {
				Database.setStorage("/home/ola/db.old");
				App.start();
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
