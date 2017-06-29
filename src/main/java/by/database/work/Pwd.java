package by.database.work;


import java.io.File;

public class Pwd {

    public Pwd() {
    }

    public void getPathName() {

        String path = null;

        path = new File("").getAbsolutePath();
        System.out.println(path);
    }


}
