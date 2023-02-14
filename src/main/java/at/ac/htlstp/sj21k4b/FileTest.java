package at.ac.htlstp.sj21k4b;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        File file = new File("data/test.txt");
        if (file.exists()) {
            System.out.println("File exists!");
            file.delete();
        } else {
            try {
                file.createNewFile();
                System.out.println("File created!");
            } catch (IOException e) {
                File directory = new File("data");
                if (directory.exists()) {
                    System.out.println("File cannot be created!");
                } else {
                    directory.mkdirs();
                    try {
                        file.createNewFile();
                    } catch (IOException ex) {
                        System.out.println("File cannot be created!");
                    }
                }
            }
        }
    }

}
