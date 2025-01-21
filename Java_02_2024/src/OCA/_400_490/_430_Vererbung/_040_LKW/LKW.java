package _400_490._430_Vererbung._040_LKW;

public class LKW extends Fahrzeug {

    private boolean sattelkupplung;  // false

    LKW() {
        super();
    }

    LKW(String hersteller) {
        super(hersteller);
    }

    LKW(String hersteller, String farbe) {
        super(hersteller, farbe);
    }

    LKW(boolean sattelkupplung) {
        super();
        setSattelkupplung(sattelkupplung);
        // this.sattelkupplung = sattelkupplung;
    }

    LKW(String hersteller, boolean sattelkupplung) {
        super(hersteller);
        setSattelkupplung(sattelkupplung);
    }

    LKW(String hersteller, String farbe, boolean sattelkupplung) {
        super(hersteller, farbe);
        setSattelkupplung(sattelkupplung);
    }

    public boolean getSattelkupplung() {
        return sattelkupplung;
    }

    public void setSattelkupplung(boolean sattelkupplung) {
        this.sattelkupplung = sattelkupplung;
    }

    @Override
    public String toString() {
        return "LKW: "
                + "Sattelkupplung="
                + sattelkupplung
                + " -> "
                + super.toString();
    }

}
