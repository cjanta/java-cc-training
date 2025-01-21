package _400_490._430_Vererbung._020_Kindklasse;

public class PKWTest {

    public static void main(String[] args) {

        PKW pkw1 = new PKW();
        System.out.println(pkw1);
        // PKW - Fahrzeug {hersteller='Volvo', farbe='Silber'}

        PKW pkw2 = new PKW("Audi");
        System.out.println(pkw2);
        // PKW - Fahrzeug {hersteller='Audi', farbe='Silber'}

        PKW pkw3 = new PKW("BMW", "Blau");
        System.out.println(pkw3);
        // PKW - Fahrzeug {hersteller='BMW', farbe='Blau'}

    }
}
