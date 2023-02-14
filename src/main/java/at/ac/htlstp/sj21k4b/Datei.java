package at.ac.htlstp.sj21k4b;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Vector;

public class Datei {

    public static Vector<String> read(String filename) {
        return read(new File(filename));
    }
    public static Vector<String> read(File file) {
        try {
            BufferedReader bfr = new BufferedReader(new FileReader(file));
            Vector<String> data = new Vector<String>();
            String line;
            while ((line=bfr.readLine())!=null) data.add(line);
            bfr.close();
            return data;
        } catch (IOException e) { return null; }
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

    public static boolean write(Vector<String> data, String filename) {
        return write(data, new File(filename));
    }
    public static boolean write(Vector<String> data, File file) {
        try {
            FileWriter fw = new FileWriter(file);
            for (String line:data) fw.write(line+"\n");
            fw.close();
            return true;
        } catch (IOException e) { return false; }
    }

    public static void main(String[] args) {
        Vector<String> data;
        data = read("data/test.txt");
        data.add("3.Zeile");
        write(data,"data/test1.txt");
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
