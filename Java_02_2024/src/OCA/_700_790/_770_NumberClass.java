package _700_790;

import java.util.ArrayList;

// Number-Klasse ist die Elternklasse der Zahlen-Datentypen

public class _770_NumberClass {

    public static void main(String[] args) {

        Number x = 7;
        System.out.println(x);  // 7

        ArrayList<Number> zahlen = new ArrayList<>();
        zahlen.add((byte) 7);
        zahlen.add((short) 7);
        zahlen.add(7);
        zahlen.add(7L);
        zahlen.add(7.7F);
        zahlen.add(7.7);

        Integer y = 7;
        zahlen.add(y);

        for (Number zahl : zahlen) {
            System.out.println(zahl);
        }
        // 7
        // 7
        // 7
        // 7
        // 7.7
        // 7.7
        // 7

    }
}
