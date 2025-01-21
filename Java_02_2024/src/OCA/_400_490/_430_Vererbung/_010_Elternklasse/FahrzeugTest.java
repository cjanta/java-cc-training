package _400_490._430_Vererbung._010_Elternklasse;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug fahr1 = new Fahrzeug();
        Fahrzeug fahr2 = new Fahrzeug("Mercedes");
        Fahrzeug fahr3 = new Fahrzeug("BMW", "Schwarz");

        System.out.println(fahr1);  // Fahrzeug{hersteller='Volvo', farbe='Silber'}
        System.out.println(fahr2);  // Fahrzeug{hersteller='Mercedes', farbe='Silber'}
        System.out.println(fahr3);  // Fahrzeug{hersteller='BMW', farbe='Schwarz'}

    }
}
