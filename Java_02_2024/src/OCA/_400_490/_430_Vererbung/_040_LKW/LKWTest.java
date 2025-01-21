package _400_490._430_Vererbung._040_LKW;

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

        LKW lkw5 = new LKW(true);
        System.out.println(lkw5);
        // LKW: Sattelkupplung=true -> Fahrzeug{hersteller='Volvo', farbe='Silber'}

        LKW lkw6 = new LKW("MAN", true);
        System.out.println(lkw6);
        // LKW: Sattelkupplung=true -> Fahrzeug{hersteller='MAN', farbe='Silber'}

    }
}

