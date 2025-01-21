package _300_390._301_ElternUndKindklasse;

public class Fahrzeug {

    // Elternklasse - Basisklasse - Superklasse

    private String hersteller;
    private String farbe;

    public Fahrzeug() {
        this.hersteller = "Volvo";
        this.farbe = "schwarz";
    }

    public Fahrzeug(String farbe) {
        this();
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
