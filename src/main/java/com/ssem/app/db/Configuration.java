package com.ssem.app.db;

import java.io.File;

public class Configuration {

	private static File file;
	
	public static File getStorage() {
		return file;
	}

	public static void setStorage(String fileName) {
		file = new File(fileName);
	}

	
}
