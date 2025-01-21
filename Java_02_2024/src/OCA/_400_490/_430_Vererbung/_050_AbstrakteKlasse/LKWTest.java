package _400_490._430_Vererbung._050_AbstrakteKlasse;

public class LKWTest {

    public static void main(String[] args) {

        LKW lkw1 = new LKW();
        System.out.println(lkw1);
        // LKW: Sattelkupplung=false -> Fahrzeug{hersteller='Volvo', farbe='Silber'}

        LKW lkw2 = new LKW("VW");
        System.out.println(lkw2);
        // LKW: Sattelkupplung=false -> Fahrzeug{hersteller='VW', farbe='Silber'}

        LKW lkw3 = new LKW("Iveco", "Orange");
        System.out.println(lkw3);
        // LKW: Sattelkupplung=false -> Fahrzeug{hersteller='Iveco', farbe='Orange'}

        LKW lkw4 = new LKW("Mercedes", "Blau", true);
        System.out.println(lkw4);
        // LKW: Sattelkupplung=true -> Fahrzeug{hersteller='Mercedes', farbe='Blau'}

    }
}

