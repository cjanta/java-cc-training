package _400_490._430_Vererbung._010_Elternklasse;

public class Fahrzeug {

    // Elternklasse - Basisklasse - Superklasse

    private String hersteller;
    private String farbe;

    public Fahrzeug() {
        this("Volvo", "Silber");
    }

    public Fahrzeug(String hersteller) {
        this(hersteller, "Silber");
    }

    public Fahrzeug(String hersteller, String farbe) {
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
        return "Fahrzeug{" +
                "hersteller='" + hersteller + '\'' +
                ", farbe='" + farbe + '\'' +
                '}';
    }

}
