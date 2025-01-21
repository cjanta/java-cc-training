package _300_390._301_ElternUndKindklasse;

public class PKW extends Fahrzeug {

    // Kindklasse, Subklasse

    // extends zum Erben von EINER Klasse

    // super verweist auf die Elternklasse (Superklasse)

    // Konstruktoren werden nicht vererbt
    // und müssen daher neu geschrieben werden.

    private int kofferraumColumen = 300;

    public PKW() {
        //super();  // optional
    }

    PKW(String farbe) {
        super(farbe);  // optional
    }

    public int getKofferraumVolumen() {
        return this.kofferraumColumen;
    }

    public void setKofferraumVolumen(int value) {
        this.kofferraumColumen = value;
    }

    @Override
    public String toString() {
        // return "PKW - " + super;
        return "PKW - " + super.toString();
    }

}
