package at.ac.htlstp.sj21k4b;

import java.util.Vector;

public class DataIO {

    public static final String FILENAME = "data/test.txt";

    public static Vector<String> readFile(String filename) {

        return null;
    }

    public static boolean writeFile(Vector<String> data, String filename) {
       return false;
    }

    public static void main(String[] args) {
        Vector<String> data = readFile(FILENAME);
        data.add("neue Zeile");
        writeFile(data,FILENAME);
    }
}
