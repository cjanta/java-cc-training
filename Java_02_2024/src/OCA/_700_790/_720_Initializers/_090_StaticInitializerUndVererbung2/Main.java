package _700_790._720_Initializers._090_StaticInitializerUndVererbung2;

// Static Initializer & Vererbung 2

class Tier {
    static String name = "Tier";

    static {
        System.out.println("I am an Tier initializer");  // I am an Tier initializer
    }
}

class Iltis extends Tier {
    static String name = "Iltis";

    static {
        System.out.println("I am an Iltis initializer");  // I am an Iltis initializer
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(Iltis.name);  // Iltis

    }
}
