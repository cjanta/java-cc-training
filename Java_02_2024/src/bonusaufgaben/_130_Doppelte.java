package bonusaufgaben;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _130_Doppelte {

    public static void main(String[] args) {

        /*
         * Doppelte
         *
         * Schreibe ein Methode, die überprüft,
         * ob in einem Array doppelte Elemente sind.
         * Der Methode wird das Array übergegen
         * und sie soll den Boolean true zurück geben,
         * wenn es doppelte Elemente in dem Array gibt.
         * Anderfalls soll die Methode den Boolean false zurück geben.
         */

        int[] zahlen1 = {1, 3, 7, 9, 7, 11, 17};
        int[] zahlen2 = {1, 3, 7, 9, 11, 17};
        System.out.println("Überprüfung doppelter Elemente");
        System.out.println(hasDoublets(zahlen1));  // true
        System.out.println(hasDoublets(zahlen2));  // false
    }

    private static boolean hasDoublets(int[] zahlenreihe){
        HashSet<Integer> validatedNumbers = new HashSet<>();
        
        for (int num : zahlenreihe) {
            if (!validatedNumbers.add(num)) {
                return true;
            }
        }
        return false;
    }

}
