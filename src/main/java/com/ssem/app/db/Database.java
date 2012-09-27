package com.ssem.app.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

public class Database {

	private static File file;
	
	public static void setStorage(String fileName) {
		file = new File(fileName);
	}
	
	public void store(Map<String, Serializable> data) {
		try {
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream stream = new ObjectOutputStream(out);
			stream.writeObject(data);
			out.close();
		} catch (FileNotFoundException e) {
			throw new DatabaseException(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Map<String, Serializable> load() {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
			return (Map<String, Serializable>)stream.readObject();
			
		} catch (FileNotFoundException e) {
			throw new DatabaseException(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
