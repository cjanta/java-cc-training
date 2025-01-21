package _100_190;

import java.util.Random;

public class _130_WhileDoWhile {

    public static void main(String[] args) {

        // while
        // Kopfgesteuerte Schleife
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

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
        // Die Anzahl der Durchläufe muss nicht bekannt sein.
        Random r = new Random();
        int wurf = 0;
        int counter = 0;
        while (wurf != 6) {
            wurf = r.nextInt(6) + 1;
            System.out.print(wurf + " ");
            counter++;
        }
        System.out.println("Anzahl: " + counter);

    }
}
