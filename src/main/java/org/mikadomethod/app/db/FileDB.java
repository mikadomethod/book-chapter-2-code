package org.mikadomethod.app.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class FileDB {

	private File file;

	public FileDB(String storageFile) {
		file = new File(storageFile);		
	}
	
	public List<String> load(String key) {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
			Map<String, Serializable> data = (Map<String, Serializable>)stream.readObject();
			return (List<String>) data.get(key);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void store(Map<String, Serializable> data) {
		try {
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream stream = new ObjectOutputStream(out);
			stream.writeObject(data);
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
