package at.ac.htlstp.sj21k4b1;

import java.util.Vector;

public class DateiTest {

    public static void main(String[] args) {
        Vector<String> data;
        data = Datei.read(FileWriteTest.FILENAME);
        if (data==null) System.out.println("Datei kann nicht gelesen werden!");
        else {
            for (String line:data) System.out.println(line);
            data.add("3.Zeile");
            Datei.write(data,FileWriteTest.FILENAME+"1");
        }
    }
}
