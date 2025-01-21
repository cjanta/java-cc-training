package _300_390._301_ElternUndKindklasse;

public class LKW extends Fahrzeug {

    // Kindklasse, Subklasse

    // extends zum Erben von EINER Klasse

    // super verweist auf die Elternklasse (Superklasse)

    // Konstruktoren werden nicht vererbt
    // und müssen daher neu geschrieben werden.

    private boolean sattelkupplung;  // false

    LKW() {
        //super();  // optional
    }

    LKW(String farbe) {
        super(farbe);  // optional
    }

    public boolean getSattelkupplung() {
        return sattelkupplung;
    }

    public void setSattelkupplung(boolean sattelkupplung) {
        this.sattelkupplung = sattelkupplung;
    }

    @Override
    public String toString() {
        // return "LKW - " + super;
        return "LKW - " + super.toString();
    }


}
