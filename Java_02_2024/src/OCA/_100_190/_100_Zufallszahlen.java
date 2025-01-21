package _100_190;

import java.util.Random;

public class _100_Zufallszahlen {

    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(r);  // java.util.Random@568db2f2

        // nextInt(bound)
        // Gibt 0 bis bound (exclusiv) zurück
        System.out.println(r.nextInt(6));  // 0 - 5
        System.out.println(r.nextInt(6) + 1);  // 1 - 6

        // Math.random()
        System.out.println(Math.random());                  // 0 - 0.99999999
        System.out.println(Math.random() * 6);              // 0 - 5.99999999
        System.out.println((int) (Math.random() * 6));      // 0 - 5
        System.out.println((int) (Math.random() * 6) + 1);  // 1 - 6

    }
}