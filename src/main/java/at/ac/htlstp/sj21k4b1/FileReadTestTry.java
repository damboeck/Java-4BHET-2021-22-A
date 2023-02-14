package at.ac.htlstp.sj21k4b1;

import java.io.*;

public class FileReadTestTry {

    public static void main(String[] args) {
        File file = new File(FileWriteTest.FILENAME);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fileReader);
            String line;
            try {
                while ((line=bfr.readLine())!=null)
                    System.out.println(line);
                bfr.close();
            } catch (IOException e) {
                System.out.println("Lesefehler!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Datei "+file.getAbsolutePath()+" not found!");
        }
    }
}
