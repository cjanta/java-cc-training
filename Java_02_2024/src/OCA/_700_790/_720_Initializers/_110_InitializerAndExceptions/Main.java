package _700_790._720_Initializers._110_InitializerAndExceptions;

// Static & Object initializer

class Iltis {
    {
        System.out.println(name);  // Zacharias
        name = "Albert";
    }

    static {
        // System.out.println(name);     // java: illegal forward reference
        System.out.println(Iltis.name);  // null
        name = "David";
        // System.out.println(name);     // java: illegal forward reference
        System.out.println(Iltis.name);  // David
    }

    static String name = "Hermann";

    {
        System.out.println(name);  // Albert
        name = "Mike";
    }

    static {
        System.out.println(name);        // Hermann
        System.out.println(Iltis.name);  // Hermann
        name = "Zacharias";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Iltis().name);  // Mike
    }
}
