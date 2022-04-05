package at.ac.htlstp.sj21k4b.codierung;

import at.ac.htlstp.sj21k4b.Datei;
import org.junit.jupiter.api.Test;

public class TestDatei {

    public static final String TESTDATEI = "test.txt";

    @Test
    public void testDateiChar(){
        String tdata = "Das ist toll\nBlaBlaBla";
        char[] tcdata= tdata.toCharArray();
        Datei.write(tcdata,TESTDATEI);
        char[] rdata = Datei.readCharBuffer(TESTDATEI).array();
        String rstring = new String(rdata);
        // jetzt sollte rstring gleich wie tdata sein
    }

}
