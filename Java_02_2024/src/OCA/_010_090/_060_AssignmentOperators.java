package _010_090;

public class _060_AssignmentOperators {

    public static void main(String[] args) {

        // Zuweisungsoperatoren
        int x = 7 + 13 * 2;
        System.out.println(x);  // 33

        // Verkürzte Zuweosungsoperatoren
        // += -= *= /= %=

        x += 7;
        System.out.println(x);  // 40
        x = x + 7;
        System.out.println(x);  // 47

        x -= 10;
        System.out.println(x); // 37

        // x %= 9;
        // x = x % 9;
        x = 37 % 9;
        System.out.println(x);  // 1

        // Multiple Assignment
        // Kommaseparierte Liste
        // Die Variablen müssen vom gleichen Datentyp sein
        // Der Datentype steht einmal am Anfang der Zeile
        int y = 6, z = 30;
        System.out.println(y);  // 6
        System.out.println(z);  // 30

        // Der Rückgabewert einer Zuweisung ist der zugewiesenen Wert
        int b = 12;
        System.out.println(b = 23);  // 23
        System.out.println(b);       // 23

        // Eine Variable während der Initialisierung schon benutzen
        int a = (a = 3) * 4;
        System.out.println(a);  // 12

    }
}
