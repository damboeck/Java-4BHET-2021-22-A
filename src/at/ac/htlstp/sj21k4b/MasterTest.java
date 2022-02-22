package at.ac.htlstp.sj21k4b;

import java.io.File;
import java.io.IOException;

public class MasterTest {

    public static void main(String[] args) throws IOException {
        File directory = new File("data");
        if (!directory.exists()) directory.mkdirs();
        File file = new File("data/test.txt");
        if (file.exists()) {
            System.out.println("File exists!");
        } else {
            file.createNewFile();
        }
    }

}
