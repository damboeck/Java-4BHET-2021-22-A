package at.ac.htlstp.sj21k4b1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

    public static void main(String[] args) throws IOException {
        File data = new File("data");
        if (!data.exists()) data.mkdirs();
        File file = new File("data/test.txt");
        FileWriter fileWriter = new FileWriter(file);
    }

}
