package _400_490._430_Vererbung._050_AbstrakteKlasse;

public class PKWTest {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println(pkw1);
        // PKW - Kofferraum-Volumen:300 - Fahrzeug {hersteller='Volvo', farbe='Silber'}

        PKW pkw2 = new PKW("Audi");
        System.out.println(pkw2);
        // PKW - Kofferraum-Volumen:300 - Fahrzeug {hersteller='Audi', farbe='Silber'}

        PKW pkw3 = new PKW("BMW", "Blau");
        System.out.println(pkw3);
        // PKW - Kofferraum-Volumen:300 - Fahrzeug {hersteller='BMW', farbe='Blau'}

        PKW pkw4 = new PKW("Mercedes", "Weiss", 1000);
        System.out.println(pkw4);
        // PKW - Kofferraum-Volumen:1000 - Fahrzeug {hersteller='Mercedes', farbe='Weiss'}

    }
}
