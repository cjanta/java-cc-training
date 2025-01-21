package _010_090;

public class _030_ExponentialSchreibweise {

    public static void main(String[] args) {

        // Exponentialschreibweise (E | e)
        // Wissenschaftlicher Schreibweise (scientific notation)

        double dou1 = 1.23456e4;
        System.out.println(dou1);                       // 12345.6
        System.out.println(1.23456 * Math.pow(10, 4));  // 12345.6
        System.out.println(1.23456 * 10_000);           // 12345.6

        double dou2 = 7.34246254626426865e13;
        System.out.println(dou2);  // 7.342462546264269E13

        // Negativer Exponent
        double dou3 = 4.5678e-2;
        System.out.println(dou3);                      // 0.045678
        System.out.println(4.5678 / Math.pow(10, 2));  // 0.045678
        System.out.println(4.5678 / 100);              // 0.045678

        // Rundungsfehler bei Fließkommazahlen
        System.out.println(3 * 0.1 - 0.3);  // 5.551115123125783E-17
        // 0.000000000000000005551115123125783
        System.out.println(2 * 0.1 - 0.2);  // 0.0

    }
}
