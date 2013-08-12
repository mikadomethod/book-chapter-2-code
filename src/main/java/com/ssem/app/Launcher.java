package com.ssem.app;

import com.ssem.app.db.Database;
import com.ssem.app.ui.App;
import com.ssem.app.ui.ApplicationException;
import com.ssem.app.ui.FileDbUserRepo;

public class Launcher {

    public static void main(String[] argv) {
        try {
            Database database = new Database("/opt/local/app/db.txt");
            FileDbUserRepo repo = new FileDbUserRepo(database);
            App app = new App();
            app.launch(repo);
        } catch (ApplicationException e) {
            System.err.println("Could not start application");
            e.printStackTrace();
        }
    }
}
