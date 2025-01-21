package _600_690._650_Polymorphie._030_KlassenAttributeUndObjektAttribute;

class Fahrzeug {
    static int counter = 1;
    String hersteller = "VW";
}

class PKW extends Fahrzeug {
    static int counter = 2;
    String hersteller = "Audi";
}

public class Main {
    public static void main(String[] args) {

        // Sowohl die Klassen- als auch die Objekt-Attribute werden zur Compile-Time ermittelt.
        // Daher ist der Referenz-Typ dafür ausschlaggebend.
        PKW fahr1 = new PKW();
        System.out.println(fahr1.counter);     // 2
        System.out.println(PKW.counter);       // 2
        System.out.println(fahr1.hersteller);  // Audi

        Fahrzeug fahr2 = new PKW();
        System.out.println(fahr2.counter);     // 1
        System.out.println(Fahrzeug.counter);  // 1
        System.out.println(fahr2.hersteller);  // VW

    }
}
