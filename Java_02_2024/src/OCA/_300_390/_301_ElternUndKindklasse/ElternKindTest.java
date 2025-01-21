package _300_390._301_ElternUndKindklasse;

public class ElternKindTest {

    public static void main(String[] args) {

        Fahrzeug fahr1 = new Fahrzeug();
        System.out.println(fahr1);  // Fahrzeug{hersteller='Volvo', farbe='Silber'}
        System.out.println(fahr1.getFarbe());   // schwarz
        fahr1.setFarbe("weiß");
        System.out.println(fahr1.getFarbe());   // weiß

        PKW pkw1 = new PKW();
        System.out.println(pkw1); // PKW - Fahrzeug {hersteller='Volvo', farbe='Silber'}
        System.out.println(pkw1.getFarbe());
        pkw1.setFarbe("blau");
        System.out.println(pkw1.getFarbe());    // blau

        // hier testen wir die neuen Attribute von PKW und LKW
        LKW lkw1 = new LKW();
        System.out.println(lkw1.getSattelkupplung());
        System.out.println(pkw1.getKofferraumVolumen());

        // Elternklasse hat keinen Zugriff auf Kind- Attribute und Methoden
        // System.out.println(fahr1.getSattelkupplung());   // FEHLER!
        // System.out.println(fahr1.getKofferraumVolumen());   // FEHLER!

        // Geschwisterklassen haben keinen Zugriff auf Geschwister- Attribute und Methoden
        // System.out.println(lkw1.getKofferraumVolumen());
        // System.out.println(pkw1.getSattelkupplung());


    }
}
