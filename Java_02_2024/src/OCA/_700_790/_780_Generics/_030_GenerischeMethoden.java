package _700_790._780_Generics;

public class _030_GenerischeMethoden {

    // Generic methods
    // Alternative zum Überladen
    // Geht nur mit Referenz-Typ-Datentypen (nicht mit primitiven Datentypen)

    public static void main(String[] args) {

        String[] namen = {"Tick", "Trick", "Track"};
        Integer[] zahlen = {23, 43, 4711};  // Muss eine Wrapper-Klasse sein

        printArray(namen);
        printArray(zahlen);
        printArrayParametrisiert(namen);
        printArrayParametrisiert(zahlen);
    }

    // Überladung - Overloading
    static void printArray(String[] arr) {
        for (String a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    static void printArray(Integer[] arr) {
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    // Der Diamont-Operator muss direkt vor dem Rückgabewert stehen.
    static <E> void printArrayParametrisiert(E[] arr) {
        for (E a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
