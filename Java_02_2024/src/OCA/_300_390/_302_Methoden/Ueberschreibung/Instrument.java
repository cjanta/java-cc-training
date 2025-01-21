package _300_390._302_Methoden.Ueberschreibung;

import _300_390._301_ElternUndKindklasse.PKW;

public class Instrument {
    public void spielen() {
        System.out.println("Das Instrument wird gespielt.");
    }

    public static void main(String[] args) {
        Instrument inst = new Instrument();
        Klavier klav = new Klavier();

        inst.spielen();  // Ausgabe: Das Instrument wird gespielt.
        klav.spielen();  // Ausgabe: Das Klavier wird mit den Tasten gespielt.

        klav.Lifecicle();
    }
}

// Kindklasse
class Klavier extends Instrument {
    // Methode (überschreibt Methode der Elternklasse)
    @Override
    public void spielen() {
        System.out.println("Das Klavier wird mit den Tasten gespielt.");
    }


    public void Lifecicle() {
        PKW pkw = new PKW();
        System.out.println(pkw.getKofferraumVolumen());
    }
}






