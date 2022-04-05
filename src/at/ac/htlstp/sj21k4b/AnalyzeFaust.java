package at.ac.htlstp.sj21k4b;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzeFaust {
    public static final String FAUST="datasrc/faust.txt";

    public static class BS implements Comparable<BS>{
        char c;
        int  anz;
        public BS(char c, int anz) { this.c=c; this.anz = anz;}

        @Override
        public int compareTo(BS o) {
            return Integer.compare(this.anz,o.anz);
        }
        @Override
        public String toString() {
            return "(" + c + ":" + anz + ")";
        }
    }

    public static void main(String[] args) {
        Vector<String> data = Datei.read(FAUST);
        Hashtable<Character,Integer> bs = new Hashtable<>();
        int sum=0;
        for (char c='a';c<='z';c+=1) {
            Pattern pattern = Pattern.compile("["+c+Character.toUpperCase(c)+"]");
            int ct=0;
            for (String line:data) {
                Matcher matcher=pattern.matcher(line);
                while (matcher.find()) ct++;
            }
            bs.put(c,ct);
            sum+=ct;
        }
        System.out.println("bs:"+sum+" "+bs);
        System.out.println("e:"+bs.get('e'));
        Vector<BS> bsv = new Vector<BS>();
        for (char c:bs.keySet()) bsv.add(new BS(c,bs.get(c)));
        Collections.sort(bsv);
        System.out.println(bsv);

    }
}
