package at.ac.htlstp.sj21k4b1;

import java.io.*;

public class FileReadTest {

    public static void main(String[] args) throws IOException {
        File file =  new File(FileWriteTest.FILENAME);
        FileReader fileReader = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileReader);
        String line;
        while ((line=bfr.readLine())!=null)
            System.out.println(line);
        bfr.close();
    }
}
