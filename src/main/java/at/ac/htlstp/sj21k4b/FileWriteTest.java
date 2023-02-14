package at.ac.htlstp.sj21k4b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

    public static final String FILENAME = "data/test.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILENAME);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hallo ");
        fileWriter.write("Welt!\n");
        fileWriter.write("2. Zeile\n");
        fileWriter.write("3. Zeile\n");
        fileWriter.close();
    }

}
