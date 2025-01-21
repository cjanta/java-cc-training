package _600_690._650_Polymorphie._020_Overriding;

import java.util.ArrayList;

// Polymorphie - Vielgestalt

class Tier {
    void sprich() {
        System.out.println("Ich Tier");
    }
}

class Hund extends Tier {
    void sprich() {
        System.out.println("Wuff");
    }
}

class Katze extends Tier {
    void sprich() {
        System.out.println("Miau");
    }
}

public class Main {

    public static void main(String[] args) {

        // Referenz-Typ wird zur Kontrolle beim Compilieren heran gezogen.
        // Objekt-Typ wird zur Runtime verwendet.
        Tier hund1 = new Hund();
        hund1.sprich();  // Wuff

        ArrayList<Tier> tiere = new ArrayList<>();
        Tier hund2 = new Hund();
        Tier katze2 = new Katze();
        tiere.add(hund2);
        tiere.add(katze2);

        tiere.get(0).sprich();  // Wuff
        tiere.get(1).sprich();  // Miau

    }
}
