package com.ssem.app;

import com.ssem.app.ui.App;
import com.ssem.app.ui.ApplicationException;

public class Launcher {

	public static void main(String[] argv) {
			try {
				App app = new App();
				app.init();
				app.launch();
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
