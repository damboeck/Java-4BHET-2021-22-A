package at.ac.htlstp.sj21k4b;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bibel2 {
    public static final String BIBEL="datasrc/bibel02.txt";
    public static void main(String[] args) {
        Vector<String> data = Datei.read(BIBEL);
        if (data!=null) {
            Pattern pattern = Pattern.compile("\\((?<name>(|[^\\(\\)]*[^\\(\\)a-zA-Z])Jo(|[^\\(\\)a-zA-Z][^\\(\\)]*))\\)");
            Matcher m;
            for (String line:data) {
                m = pattern.matcher(line);
                while (m.find()) {
                    for (String part:m.group("name").split("\\s*;\\s*")) {
                        if (part.matches("(|[^a-zA-Z]+)Jo(|[^a-zA-Z]+)"))
                            System.out.println(part.trim());
                    }
                }
            }
        } else System.out.println("Datei konnte nicht gelesen werden!");
    }
}
