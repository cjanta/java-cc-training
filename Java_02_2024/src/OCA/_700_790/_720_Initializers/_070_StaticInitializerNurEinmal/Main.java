package _700_790._720_Initializers._070_StaticInitializerNurEinmal;

// Static Initializer
// Der statische Initializer wird nur einmal eingelesen.

class Iltis {

    static {
        System.out.println("I am an Iltis initializer");  // I am an Iltis initializer
    }

}

public class Main {

    public static void main(String[] args) {

        new Iltis();
        new Iltis();
        Iltis iltis = new Iltis();

    }
}
