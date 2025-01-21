package _600_690._660_Interface._040_Zeichenbar;

import java.util.ArrayList;
import java.util.List;

interface Zeichenbar {
    String zeichnen();  // public abstract
}

abstract class Form implements Zeichenbar {
    abstract double flaeche();
}

class Rechteck extends Form {
    double breite, hoehe;

    @Override
    double flaeche() {
        return breite * hoehe;
    }

    @Override
    public String zeichnen() {
        return "Zeichnung des Rechtecks";
    }
}

class Hund implements Zeichenbar {
    @Override
    public String zeichnen() {
        return "Zeichnung des Hundes";
    }

    void bewegen() {
        System.out.println("Bewegt sich wie ein Hund.");
    }
}

public class Main {
    public static void main(String[] args) {

        List<Zeichenbar> zeichenbare = new ArrayList<>();
        zeichenbare.add(new Rechteck());
        zeichenbare.add(new Hund());
        System.out.println(zeichenbare);
    }
}
