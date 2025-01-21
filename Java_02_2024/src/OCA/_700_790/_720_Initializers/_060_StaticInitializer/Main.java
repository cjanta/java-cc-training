package _700_790._720_Initializers._060_StaticInitializer;

// Static Initializer nur einmal
// Statische Initiatoren
// Die Klasse muss benutzt werden, damit ein statischer Initializer ausgeführt wird.

class Iltis {

    static {
        System.out.println("I am an Iltis initializer");
    }

}

public class Main {

    static {
        System.out.println("I am an Main initializer");  // I am an Main initializer
    }

    public static void main(String[] args) {

    }
}
