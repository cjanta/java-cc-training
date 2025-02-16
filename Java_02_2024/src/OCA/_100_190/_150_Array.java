package _100_190;

import java.util.Arrays;

public class _150_Array {

    public static void main(String[] args) {

        // Array
        // Die Länge von Arrays ist nicht veränderbar
        // Es darf nur einen Datentyp in einem Array geben
        // Arrays sind null-basiert
        // Eckige Klammern
        // Bezeichner am besten im Plural

        int[] values = new int[3];  // Initialisierung

        int[] values2;         // Deklaration als Array von int
        values2 = new int[3];  // Zuweisung des ersten Wertes

        System.out.println(values);  // [I@568db2f2

        // Der Default-Wert des Datentyps wird automatisch eingefügt
        System.out.println(values[0]);  // 0
        System.out.println(values[1]);  // 0
        System.out.println(values[2]);  // 0

        // Das Attribut length
        System.out.println(values.length);  // 3

        // ArrayIndexOutOfBoundsException
        // Wenn es den Index nixht gibt
        // System.out.println(values[99]);  // ArrayIndexOutOfBoundsException

        // Array befüllen
        values[0] = 7;
        values[1] = 11;
        values[2] = 23;

        System.out.println(Arrays.toString(values));  // [7, 11, 23]

        // for ( ; ; )
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");  // 7 11 23
        }
        System.out.println();

        // for als foreach (enhanced for)
        // for ( : )
        // Kann nur auslesen
        for (int value : values) {
            System.out.print(value + " ");  // 7 11 23
        }
        System.out.println();

        // Array-Literale
        String[] namen = new String[]{"Peter", "Paul", "Mary"};
        // String[] namens = new String[3] {"Peter", "Paul", "Mary"};  // java: ';' expected
        // Kurzschreibweise
        String[] namen2 = {"Peter", "Paul", "Mary"};
        System.out.println(Arrays.toString(namen2));  // [Peter, Paul, Mary]

        // C-style Array-Deklaration
        int zahlen[] = {1, 2, 3};
        System.out.println(Arrays.toString(zahlen));  // [1, 2, 3]

        // Arrays mit Arrays überschreiben
        int z1[] = {1};
        int z2[] = {1, 2, 3};
        int z3[] = {1, 2, 3, 4, 5};
        z2 = z1;
        System.out.println(Arrays.toString(z2));  // [1]
        z2 = z3;
        System.out.println(Arrays.toString(z2));  // [1, 2, 3, 4, 5]

        // Andere Default-Werte der Datentypen
        char[] ca = new char[7];
        System.out.println(Arrays.toString(ca));  // [ ,  ,  ,  ,  ,  ,  ]

        boolean[] ba = new boolean[3];
        System.out.println(Arrays.toString(ba));  // [false, false, false]

        double[] da = new double[5];
        System.out.println(Arrays.toString(da));  // [0.0, 0.0, 0.0, 0.0, 0.0]

        // Alle Objekte haben den Default-Wert null
        String[] sa = new String[2];
        System.out.println(Arrays.toString(sa));  // [null, null]

        // Der Index wird zuerst festgelegt
        int i = 0;
        int[] zahlen2 = {0, 1, 2, 3};
        zahlen2[i++] = i;  // Der index bleibt 0, aber dann wird direkt i erhöht
        System.out.println(Arrays.toString(zahlen2));  // [1, 1, 2, 3]

        // Zahlen dürfen nur rechts vom = stehen
        // int[4] arr1;               // java: ']' expected
        // int[4] arr2 = new int[4];  // java: ']' expected

        // getClass().isArray()
        int[] int1 = {0};
        Class class1 = int1.getClass();
        System.out.println(class1);                     // class [I
        System.out.println(int1.getClass());            // class [I
        System.out.println(int1.getClass().isArray());  // true

        // Array mit der Länge 0
        int[] ia = new int[0];
        System.out.println(Arrays.toString(ia));  // []
        System.out.println(ia.length);            // 0


    }
}
