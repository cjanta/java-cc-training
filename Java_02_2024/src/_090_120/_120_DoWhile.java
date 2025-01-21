package _090_120;

import java.util.Random;

public class _120_DoWhile {
    public static void main(String[] args) {

        // do while
        // Fußgesteuerte Schleife
        // Wird mindestens einmal durchlaufen
        System.out.println("Do While");
        int j = 1234567;
        do {
            System.out.print(j + " ");
            j++;
            // } while (false);
        } while (j < 10);
        System.out.println();

        // Stärke von while/do while:
        System.out.println("Die Anzahl der Durchläufe muss nicht bekannt sein.");
        Random r = new Random();
        int wurf = 0;
        int counter = 0;
        while (wurf != 6) {
            wurf = r.nextInt(1, 7);
            System.out.print(wurf + " ");
            counter++;
        }
        System.out.println("Anzahl: " + counter);
    }
}
