package _700_790._720_Initializers._080_StaticInitializerUndVererbung;

// Static Initializer & Vererbung

class Tier {
    static String name = "Tier";

    static {
        System.out.println("I am an Tier initializer");  // I am an Tier initializer
    }
}

class Iltis extends Tier {
    // Java-Notiz: Es gibt name in Tier
    static {
        System.out.println("I am an Iltis initializer");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(Iltis.name);  // Tier

    }
}
