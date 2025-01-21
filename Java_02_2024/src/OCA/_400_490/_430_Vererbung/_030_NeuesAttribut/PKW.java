package _400_490._430_Vererbung._030_NeuesAttribut;

public class PKW extends Fahrzeug {

    // Neues Attribut

    // private int kofferraumVolumen;
    private int kofferraumVolumen = 300;

    PKW() {
        super();
        // this.kofferraumVolumen = 300;
    }

    PKW(String hersteller) {
        super(hersteller);
        // this.kofferraumVolumen = 300;
    }

    PKW(String hersteller, String farbe) {
        super(hersteller, farbe);
        // this.kofferraumVolumen = 300;
    }

    PKW(String hersteller, String farbe, int kofferraumVolumen) {
        super(hersteller, farbe);
        this.kofferraumVolumen = kofferraumVolumen;
    }

    public int getKofferraumVolumen() {
        return this.kofferraumVolumen;
    }

    public void setKofferraumVolumen(int kofferraumVolumen) {
        this.kofferraumVolumen = kofferraumVolumen;
    }

    @Override
    public String toString() {
        // return "PKW - " + super;
        return "PKW - "
                + "Kofferraum-Volumen:"
                + this.kofferraumVolumen
                + " - "
                + super.toString();
    }

}
