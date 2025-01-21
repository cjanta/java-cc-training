package _400_490._430_Vererbung._030_NeuesAttribut;

public class Fahrzeug {

    // Elternklasse - Basisklasse - Superklasse

    private String hersteller;
    private String farbe;

    Fahrzeug() {
        this("Volvo", "Silber");
    }

    Fahrzeug(String hersteller) {
        this(hersteller, "Silber");
    }

    Fahrzeug(String hersteller, String farbe) {
        this.hersteller = hersteller;
        this.farbe = farbe;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Fahrzeug {" +
                "hersteller='" + hersteller + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }

}
