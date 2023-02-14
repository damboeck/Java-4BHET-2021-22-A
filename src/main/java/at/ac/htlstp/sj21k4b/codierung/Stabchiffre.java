package at.ac.htlstp.sj21k4b.codierung;

import at.ac.htlstp.sj21k4b.Datei;

import java.nio.CharBuffer;

public class Stabchiffre {
    public static final String FAUST="datasrc/faust.txt";
    public static void main(String[] args) {
        CharBuffer charBuffer = Datei.readCharBuffer(FAUST);
        char[] cb = charBuffer.array();
        for (int i=0;i<cb.length;i++)
            System.out.print(cb[i]);
    }

}
