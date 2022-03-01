package at.ac.htlstp.sj21k4b;

import java.io.*;

public class FileReadTest {

    public static void main(String[] args) throws IOException {
        File file = new File(FileWriteTest.FILENAME);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            System.out.println(line);
        }

        bufferedReader.close();
        // fileReader.close();
    }
}
