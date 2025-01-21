package _270_300;

public class _270_StatischeMethoden {

    static int test;

    public static void main(String[] args) {

        // Methode-Bezeichner
        // lowerCamelCase
        // Sprechender Bezeichner
        // Handlungsaufforderung -> Imperativ

        // Methoden können mehrmals ausgeführt werden
        gibAus();  // "Ich bin in der Methode gibAus()!"
        gibAus();  // "Ich bin in der Methode gibAus()!"
        gibAus();  // "Ich bin in der Methode gibAus()!"

        _270_StatischeMethoden.gibAus();  // "Ich bin in der Methode gibAus()!"

        // Parameter
        // Rückgabewert mit return
        System.out.println(addiere(3, 4));  // 7

        System.out.println(Math.PI);
    }

    static void gibAus() {
        System.out.println("Ich bin in der Methode gibAus()!");
    }

    static int addiere(int x, int y) {
        return x + y;
    }
}
