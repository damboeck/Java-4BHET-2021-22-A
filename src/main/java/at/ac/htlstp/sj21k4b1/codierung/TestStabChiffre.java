package at.ac.htlstp.sj21k4b1.codierung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStabChiffre {

    @Test
    public void testStabChiffre() {
        String s = "Dies ist ein Satz";
        String se= "Dsse ti tiSzei ha";
        String e = Stabchiffre.encodeStabChiffre(s,3);
        assertEquals(s,Stabchiffre.decodeStabChiffre(e,3));
        assertEquals(se,e);
    }
}
