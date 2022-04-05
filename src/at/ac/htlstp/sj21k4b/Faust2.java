package at.ac.htlstp.sj21k4b;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Faust2 {
    public static final String FAUST="datasrc/faust.txt";

    public static void main(String[] args) {
        Vector<String> data = Datei.read(FAUST);
        Pattern pattern = Pattern.compile("(^|[\\s\\\"\\.])[a-zA-Z]*tt[a-zA-Z]*($|[\\s\\\"\\.\\,])");
        Matcher matcher;
        int lines=0;
        int words=0;
        for (String line:data) {
            matcher = pattern.matcher(line);
            if (matcher.find()) {
                words++;
                lines++;
            }
            while (matcher.find()) words++;
        }
        System.out.println("lines:"+lines+" words:"+words);
    }
}
