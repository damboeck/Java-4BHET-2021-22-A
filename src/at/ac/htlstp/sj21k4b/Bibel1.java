package at.ac.htlstp.sj21k4b;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bibel1 {
    public static final String BIBEL="datasrc/bibel02.txt";

    public static void main(String[] args) {
        Vector<String> data = Datei.read(BIBEL);
        Pattern pattern = Pattern.compile("\\((?<xy>[^\\)\\(]*Jo([^a-zA-Z\\)\\(]?|[^a-zA-Z\\)\\(][^\\)\\(]*))\\)");
        Matcher matcher;
        for (String line:data) {
            matcher = pattern.matcher(line);
            while(matcher.find()) {
                String found = matcher.group("xy");
                System.out.println(found);
            }
        }
    }
}
