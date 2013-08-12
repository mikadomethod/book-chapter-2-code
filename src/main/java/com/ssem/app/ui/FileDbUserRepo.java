package com.ssem.app.ui;

import java.util.List;

import com.ssem.app.db.Database;

public class FileDbUserRepo {

    private final Database database;

    public FileDbUserRepo(Database database) {
        this.database = database;
    }

    public List<String> fetchAll() {
        return database.load("users");
    }
}