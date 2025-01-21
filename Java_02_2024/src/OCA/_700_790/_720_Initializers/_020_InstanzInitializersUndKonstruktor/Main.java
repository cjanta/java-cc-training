package _700_790._720_Initializers._020_InstanzInitializersUndKonstruktor;

// Instanz-Initializers & Konstruktor
// Der Instanz-Initializer wird vor den Konstruktoren ausgeführt.
// Unabhängig von der Reihenfolge im Quellcode.

class Iltis {

    Iltis() {
        System.out.println("I am a constructor!");
    }

    {
        System.out.println("I am an initializer!");
    }
}

public class Main {

    public static void main(String[] args) {

        new Iltis();
        // I am an initializer!
        // I am a constructor!
    }
}
