package _600_690;

import java.util.Arrays;

public class _690_DestruktiveMethoden {

    public static void main(String[] args) {

        // Sammlung destruktiver Methoden
        // Rückgabewerte von destruktiven Methoden müssen nicht wieder aufgefangen werden.

        // StringBuilder

        // StringBuilder StringBuilder.append()
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.append("Hello"));  // Hello
        sb1.append("World");
        System.out.println(sb1);                  // HelloWorld

        // StringBuilder StringBuilder.insert()
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2.insert(1, "eee"));  // Heeeello
        System.out.println(sb2);                              // Heeeello

        // StringBuilder StringBuilder.delete()
        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(sb3.delete(1, 3));  // Hlo
        System.out.println(sb3);

        // void StringBuilder.setCharAt()
        StringBuilder sb4 = new StringBuilder("Hello");
        // System.out.println(sb4.setCharAt(1, 'a'));  // Geht nicht
        sb4.setCharAt(1, 'a');  // Geht nicht
        System.out.println(sb4);          // Hallo

        // StringBuilder StringBuilder.delete()
        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println(sb5.reverse());  // olleH
        System.out.println(sb5);            // olleH

        // Arrays-Klasse

        // void Arrays.fill(arr, fromIndex, toIndex, val)
        int[] zahlen1 = new int[9];
        Arrays.fill(zahlen1, 3, 6, 1);
        System.out.println(Arrays.toString(zahlen1));  // [0, 0, 0, 1, 1, 1, 0, 0, 0]

        // void Arrays.sort(arr)
        int[] zahlen2 = {4, 2, 7, 3, 1, 6, 9, 5, 2};
        System.out.println(Arrays.toString(zahlen2));  // [4, 2, 7, 3, 1, 6, 9, 5, 2]
        Arrays.sort(zahlen2);
        System.out.println(Arrays.toString(zahlen2));  // [1, 2, 2, 3, 4, 5, 6, 7, 9]

    }
}
