package at.ac.htlstp.sj21k4b1.codierung;

import at.ac.htlstp.sj21k4b.Datei;

import java.nio.CharBuffer;

public class Stabchiffre {
    public static final String FAUST = "datasrc/faust.txt";
    public static final String TARGET = "data/fc.txt";

    public static char[] encodeStabChiffre(char[] data, int n) {
        return data;
    }

    public static String encodeStabChiffre(String data, int n) {
        return String.valueOf(encodeStabChiffre(data.toCharArray(),n));
    }

    public static char[] decodeStabChiffre(char[] chiffre, int n) {
        return chiffre;
    }

    public static String decodeStabChiffre(String chiffre, int n) {
        return String.valueOf(decodeStabChiffre(chiffre.toCharArray(),n));
    }

    public static void main(String[] args) {
        char[] data = Datei.readCharBuffer(FAUST).array();
        char[] target = encodeStabChiffre(data,5);
        Datei.write(target,TARGET);
    }
}
