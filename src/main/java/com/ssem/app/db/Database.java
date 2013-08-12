package com.ssem.app.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Database {

    private final File file;

    public Database(String storageFile) {
        this.file = new File(storageFile);
    }

    public List<String> load(String key) {
        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
            Map<String, Serializable> data = (Map<String, Serializable>) stream.readObject();
            return (List<String>) data.get(key);

        } catch (FileNotFoundException e) {
            throw new DatabaseException(e);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
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
}
