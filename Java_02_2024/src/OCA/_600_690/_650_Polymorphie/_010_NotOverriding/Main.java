package _600_690._650_Polymorphie._010_NotOverriding;

import java.util.ArrayList;
import java.util.List;

// Polymorphie - Vielgestalt

class Tier {
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

        // Referenz-Typ gleich Objekt-Typ
        Hund hund1 = new Hund();
        hund1.sprich();              // Wuff
        Katze katze1 = new Katze();
        katze1.sprich();             // Miau

        // Vorfahrenklasse als Referenz-Typ
        List<String> arrList = new ArrayList<>();
        Tier hund2 = new Hund();
        // hund2.sprich();  // cannot find symbol sprich()
        // Geht nicht, weil ein Tier nicht die sprich()-Methode hat.
        // Dies wird zur Compile-Zeit überprüft.

        // Downcasting mit neuem Objekt
        Hund hund3 = (Hund) hund2;
        hund3.sprich();  // Wuff
        // Downcasting live
        ((Hund) hund2).sprich();  // Wuff
        // hund2.sprich();  // hund2 ist immer noch ein Tier.

        // In hund2 ist weiterhin ein Tier
        hund2 = (Hund) hund2;
        // hund2.sprich();  // cannot find symbol sprich()

        // ((Katze) hund2).sprich();  // ClassCastException

        // Vorteil von Polymorphie

        ArrayList<Tier> tiere = new ArrayList<>();
        Tier hund4 = new Hund();
        Tier katze4 = new Katze();
        tiere.add(hund4);
        tiere.add(katze4);
        System.out.println(tiere);  // [...Hund@29453f44, ...Katze@5cad8086]

        // tiere.get(0).sprich();        // hund2 ist immer noch ein Tier.
        ((Katze) tiere.get(1)).sprich();  // Miau


    }
}
