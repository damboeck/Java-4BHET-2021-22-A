package at.ac.htlstp.sj21k4b;

import at.ac.htlstp.sj21k4b1.Datei;

import java.util.Vector;

public class CSVsumme {
    public static final String mappe="datasrc/Mappe1.csv";
    public static void main(String[] args) {
        Vector<String> data = Datei.read(mappe);
        if (data!=null) {
            double summe=0;
            for (int zeile=1;zeile<=data.size();zeile++) {
                if (zeile>1) {
                    String[] spalten = data.get(zeile-1).split(";");
                    for (String sp:spalten) {
                        try {
                            double d = Double.parseDouble(sp.replaceAll(",", "."));
                            summe += d;
                        } catch (NumberFormatException e) {}
                    }
                }
            }
            System.out.println("Summe = "+summe);
        } else System.out.println("Datei kann nicht gelesen werden!");
    }
}
