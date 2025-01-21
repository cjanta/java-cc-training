package _700_790._720_Initializers._010_InstanzInitializers;

// Initializers
// Instanz-Initializers
// Wird jedesmal ausgeführt, wenn ein Object erzeugt wird.

class Iltis {

    {
        System.out.println("I am an initializer!");
    }
}

public class Main {

    public static void main(String[] args) {

        new Iltis();  // I am an initializer!
        new Iltis();  // I am an initializer!
    }
}
