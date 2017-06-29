package by.database.work;

import java.io.File;


public class Ls {


    public void getDirectory(String arg) {

        String pathName = String.format("%s://", arg);

        File dir = new File(pathName);

        if (dir.isDirectory()) {

            for (File directory : dir.listFiles()) {
                System.out.println(directory);
            }
        }

    }

    public void getDirectory() {

        String pathName = new File(".").getAbsolutePath();

        File dir = new File(pathName);

        if (dir.isDirectory()) {

            for (File directory : dir.listFiles()) {
                System.out.println(directory);
            }
        }

    }


}
