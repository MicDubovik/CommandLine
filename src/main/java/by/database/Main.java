package by.database;

import by.database.work.Ls;
import by.database.work.Ps;
import by.database.work.Pwd;

import java.util.Properties;

/**
 * by.database.Main.
 */
public class Main {

    public static void main(String[] args) {

        String psCom = null;
        String lsCom = null;
        String pwdCom = null;

        Properties property = new Properties();
        try
        {
            ClassLoader myCL = Main.class.getClassLoader();
            property.load(
                    myCL.getResourceAsStream(
                            "config.properties"));

            psCom = property.getProperty("command.ps");
            lsCom = property.getProperty("command.ls");
            pwdCom = property.getProperty("command.pwd");


        }
        catch (Exception x)
        {
            x.printStackTrace();
        }


        Pwd pwd = new Pwd();
        Ps ps = new Ps();
        Ls ls = new Ls();

        int size = args.length;

        if (size==0){
            System.out.println("Not found command");return;
        }

        if (args[0].equals(pwdCom)){
            pwd.getPathName();
        } else if (args[0].equals(psCom)){

            if (size==1){
                ps.process();
            } else {
                ps.process(args[1]);
            }

        } else if (args[0].equals(lsCom) ){
            if (size==1){
                ls.getDirectory();
            } else {
                ls.getDirectory(args[1]);
            }

        }

    }
}