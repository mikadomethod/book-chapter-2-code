package com.ssem.app;

import com.ssem.app.ui.ApplicationException;
import com.ssem.app.ui.Login;

public class Launcher {

	public static void main(String[] argv) {
			try {
				Login.showScreen();
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
