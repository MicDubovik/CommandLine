package by.database.work;


import java.io.*;

/**
 * Created by Katy on 28.06.2017.
 */
public class Ps {


    public void process(String arg) {
        try {
            String process;
            Process p = Runtime.getRuntime().exec("tasklist");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

            while ((process = input.readLine()) != null) {


                if (process.toLowerCase().contains(arg.toLowerCase())) {
                    System.out.println(process);
                }
            }
            input.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public void process() {
        try {
            String process;
            Process p = Runtime.getRuntime().exec("tasklist");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

            while ((process = input.readLine()) != null) {

                System.out.println(process);

            }
            input.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }


}
