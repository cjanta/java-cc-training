package _010_090;

public class _080_LogicalOperators {

    public static void main(String[] args) {

        // Logische Operatoren
        // Boolsche Operatoren

        // &&, ||, !

        // && - UND (sowohl als auch)
        System.out.println(3 >= 2 && 7 != 9);      // true
        System.out.println((3 >= 2) && (7 != 9));  // true

        // Nur true, wenn beide true sind
        // Sowohl als auch
        System.out.println(true && true);     // true
        System.out.println(false && true);    // false
        System.out.println(true && false);    // false
        System.out.println(false && false);   // false

        // Nur false, wenn beide false sind
        // Und/oder
        System.out.println(true || true);     // true
        System.out.println(false || true);    // true
        System.out.println(true || false);    // true
        System.out.println(false || false);   // false

        // ! NICHT (not)
        System.out.println(!(1 == 1));  // false
        System.out.println(!true);      // false
        System.out.println(!false);     // true

        // Entweder oder: ^
        System.out.println("Entweder-Oder");
        System.out.println(true ^ true);     // false  !!! Unterschied zu ||
        System.out.println(false ^ true);    // true
        System.out.println(true ^ false);    // true
        System.out.println(false ^ false);   // false


    }
}
