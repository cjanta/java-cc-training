package _130_160.Aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _040_KleinsteVonDreiUnterschiedlichenZahlen {

    public static void main(String[] args) {

        /*
         * Kleinste von drei UNTERSCHIEDLICHEN Zahlen
         *
         * Schreibe ein Programm,
         * das drei Variablen mit zufälligen,
         * UNTERSCHIEDLICHEN Zahlen (aus dem gleichen Zahlenraum) befüllt.
         * Dann soll das Programm testen,
         * welche der Zahlen die Kleinste ist und diese ausgeben.
         */
        List<Integer> randomNumbers = getRandomNumbers();
        randomNumbers.stream().forEach(System.out::println);
        int minValue = randomNumbers.stream().mapToInt(Integer::intValue).min().getAsInt();

        System.out.println("Kleinste der drei Zufallszahlen: " + minValue);

    }

    private static List<Integer> getRandomNumbers(){
        List<Integer> randomNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 3; i++){
            randomNumbers.add(rand.nextInt());
        }
        return randomNumbers;
    }
}
