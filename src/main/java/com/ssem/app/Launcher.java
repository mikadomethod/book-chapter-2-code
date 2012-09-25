package com.ssem.app;

import com.ssem.app.ui.ApplicationException;

public class Launcher {

	public static void main(String[] argv) {
			try {
				Login.launch();
			} catch (ApplicationException e) {
				System.err.println("Could not start application");
				e.printStackTrace();
			}
	}
 
}
