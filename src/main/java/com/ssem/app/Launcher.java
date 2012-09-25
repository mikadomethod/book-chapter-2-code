package com.ssem.app;

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
