package _600_690;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _640_Arrays {

    // Klasse Arrays
    // Mit statischen MEthoden zum Thema Arrays

    public static void main(String[] args) {

        // toString(arr)
        int[] zahlen = new int[11];
        System.out.println(Arrays.toString(zahlen));  // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // fill(arr, val)
        Arrays.fill(zahlen, 7);
        System.out.println(Arrays.toString(zahlen));  // [7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7]

        // fill(arr, fromIndex, toIndex, val)
        Arrays.fill(zahlen, 3, 6, 11);
        System.out.println(Arrays.toString(zahlen));  // [7, 7, 7, 11, 11, 11, 7, 7, 7, 7, 7]

        // sort(arr)
        int[] zahlen2 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        System.out.println(Arrays.toString(zahlen2));  // [4, 2, 7, 3, 1, 6, 9, 5, 2]
        Arrays.sort(zahlen2);
        System.out.println(Arrays.toString(zahlen2));  // [1, 2, 2, 3, 4, 5, 6, 7, 9]

        // binarySearch(arr, el)
        // Gibt den Index des Elements zurück.
        // Die binäre Suche funktioniert nur,
        // wenn sich das Array in einem sortierten Zustand befindet.
        // Wenn das Element nicht gefunden wird, wird ein negativer Wert zurück gegeben.
        int[] zahlen3 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        Arrays.sort(zahlen3);
        System.out.println(Arrays.binarySearch(zahlen3, 9));  // 8
        System.out.println(Arrays.binarySearch(zahlen3, 8));   // -9
        System.out.println(Arrays.binarySearch(zahlen3, 99));  // -10

        // equals(arr1, arr2)
        int[] zahlen4 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        int[] zahlen5 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        System.out.println(Arrays.equals(zahlen4, zahlen5));  // true
        System.out.println(zahlen4 == zahlen5);               // false (weil, verschiedene Speicherorte)

        // List asList()
        ArrayList<String> arrList1 = new ArrayList<>(Arrays.asList("Peter", "Paul", "Mary"));
        System.out.println(arrList1);  // [Peter, Paul, Mary]

        List<String> list2 = Arrays.asList("Peter", "Paul", "Mary");
        ArrayList<String> arrList2 = new ArrayList<>(list2);
        System.out.println(arrList2);  // [Peter, Paul, Mary]

        // int mismatch(arr1, arr2) kommt erst in Java 9

        // copyOf()
        // Ohne copyOf() entsteht eine Referenz;
        int[] zahlen6 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        int[] zahlen7 = zahlen6;  // Hier wird als Wert die Objekt-Referenz zugewiesen
        zahlen7[6] = 23;
        System.out.println(Arrays.toString(zahlen6));  // [4, 2, 7, 3, 1, 6, 23, 5, 2]
        System.out.println(Arrays.toString(zahlen7));  // [4, 2, 7, 3, 1, 6, 23, 5, 2]

        // copyOf() erzeugt ein neues Objekt als KOPIE
        int[] zahlen8 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        int[] zahlen9 = Arrays.copyOf(zahlen6, zahlen6.length);
        zahlen9[6] = 23;
        System.out.println(Arrays.toString(zahlen8));  // [4, 2, 7, 3, 1, 6, 9, 5, 2]
        System.out.println(Arrays.toString(zahlen9));  // [4, 2, 7, 3, 1, 6, 23, 5, 2]

        // Die Länge des Arrays verändern
        int[] zahlen10 = Arrays.copyOf(zahlen6, zahlen6.length - 3);
        System.out.println(Arrays.toString(zahlen10));  // [4, 2, 7, 3, 1, 6]
        int[] zahlen11 = Arrays.copyOf(zahlen6, zahlen6.length + 3);
        System.out.println(Arrays.toString(zahlen11));  // [4, 2, 7, 3, 1, 6, 23, 5, 2, 0, 0, 0]

        // copyOfRange()
        // Kann auch vorne was weg nehmen
        int[] zahlen12 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        int[] zahlen13 = Arrays.copyOfRange(zahlen12, 2, zahlen12.length - 2);
        System.out.println(Arrays.toString(zahlen13));  // [7, 3, 1, 6, 9]


    }
}
