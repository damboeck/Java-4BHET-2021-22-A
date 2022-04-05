package at.ac.htlstp.sj21k4b1;

import java.io.*;
import java.nio.CharBuffer;
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

    public static CharBuffer readCharBuffer(String filename) { return readCharBuffer(new File(filename));}
    public static CharBuffer readCharBuffer(File file) {
        Vector<String> data = read(file);
        int size = 0;
        for (String line:data) size += line.replaceAll("\\r","").length()+1;
        if (data != null) {
            CharBuffer result = CharBuffer.allocate(size);
            for (String line:data)
                result.append(line.replaceAll("\\r","")+"\n");
            return result;
        } else return null;
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

    public static boolean write(char[] data, String filename) {return write(data,new File(filename));}
    public static boolean write(char[] data, File file) {
        CharBuffer cb = CharBuffer.wrap(data);
        String s = cb.toString();
        Vector<String> vdata = new Vector<String>();
        vdata.add(s.substring(0,s.length()-1));
        return write(vdata,file);
    }
}
