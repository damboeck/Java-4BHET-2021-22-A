package at.ac.htlstp.sj21k4b1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDatei {

    public static final String DATEINAME="test.txt";

    public static File file;
    public static Vector<String> data;

    @BeforeAll
    public static void beforeAll() {
        file=new File(DATEINAME);
        data = new Vector<String>();
        data.add("abc");
        data.add("def");
        assertTrue(Datei.write(data,file));
    }

    @AfterAll
    public static void afterAll() {
        File file = new File(DATEINAME);
        if (file.exists()) file.delete();
    }

    @Test
    public void testReadFile() {
        long size = file.length();
        Vector<String> data1 = Datei.read(file);
        assertEquals(data1.size(),data1.size());
        for (int i=0;i<data.size();i++)
            assertEquals(data.get(i),data1.get(i));
        assertTrue(Datei.write(data1,file));
        assertEquals(size,file.length());
    }

    @Test
    public void testReadChar() {
        long size = file.length();
        char[] c = Datei.readCharBuffer(file).array();
        assertTrue(Datei.write(c,file));
        assertEquals(size,file.length());
    }
}
