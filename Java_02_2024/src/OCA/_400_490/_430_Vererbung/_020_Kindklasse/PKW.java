package _400_490._430_Vererbung._020_Kindklasse;

public class PKW extends Fahrzeug {

    // Kindklasse, Subklasse

    // extends zum erben von EINER Klasse

    // super verweist auf die Elternklasse (Superklasse)
    // super kann man NICHT chainen um an die Ureltern-Klasse zu kommen (NO super.super...)

    // Konstruktoren werden nicht vererbt
    // und müssen daher neu geschrieben werden.

    PKW() {
        //super();  // optional
    }

    PKW(String hersteller) {
        //super(hersteller);
    }

    PKW(String hersteller, String farbe) {
        super(hersteller, farbe);
    }

    @Override
    public String toString() {
        // return "PKW - " + super;
        return "PKW - " + super.toString();
    }

}
