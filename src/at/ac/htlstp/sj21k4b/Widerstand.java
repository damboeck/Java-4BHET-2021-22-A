package at.ac.htlstp.sj21k4b;

import java.util.Scanner;

public class Widerstand {

    public static void main(String[] args) {
        double r1,r2,rp,rs;
        Scanner sc =  new Scanner(System.in);
        System.out.print("R1=");
        r1 = sc.nextDouble();
        System.out.print("R2=");
        r2 = sc.nextDouble();
        // Berechnung
        rp = r1*r2/(r1+r2);
        rs = r1+r2;
        System.out.printf("Parallel: %f Serie: %f\n",rp,rs);
    }
}
