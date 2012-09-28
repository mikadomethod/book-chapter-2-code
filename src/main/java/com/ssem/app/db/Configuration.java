package com.ssem.app.db;

import java.io.File;

public class Configuration {

	private static File file;
	
	public File getStorage() {
		return file;
	}

	public void setStorage(String fileName) {
		file = new File(fileName);
	}

	
}
