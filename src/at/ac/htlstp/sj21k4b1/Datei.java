package at.ac.htlstp.sj21k4b1;

import java.io.*;
import java.util.Vector;

public class Datei {

    public static Vector<String> read(String filename) {
        File file = new File(filename);
        return read(file);
    }

    public static Vector<String> read(File file) {
        Vector<String> lines = new Vector<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fileReader);
            String line;
            while ((line=bfr.readLine())!=null) lines.add(line);
            bfr.close();
            return lines;
        } catch (IOException exception) { return null;}
    }

    public static boolean write(Vector<String> lines, String filename) {
        return write(lines,new File(filename));
    }

    public static boolean write(Vector<String> lines, File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (String line:lines)
                fileWriter.write(line+"\n");
            fileWriter.close();
            return true;
        } catch (Exception ex) { return false; }
    }
}
