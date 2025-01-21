package _210_260;

import java.util.Arrays;
import java.util.List;

public class _030_DoppelgaengerEntfernen {
    public static void main(String[] args) {
    // Doppelgänger entfernen
    //
    // Entferne die Doppelgänger aus einer ArrayList von Zahlen
    // (z. B. aus [1, 2, 3, 2, 7, 3, 9]).
    // Die Ergebnisliste soll aufsteigend sortiert sein.

    List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 2, 7, 3, 9);

    System.out.println("Die gegebenen, unsortierte Liste:\n");
    numbers.stream().forEach(System.out::println);

    System.out.println("Die sortierte Liste, ohne Dupletten:\n");
    numbers.stream().distinct().sorted().forEach(System.out::println);






    }
}
