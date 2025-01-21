package _300_390._360_OOP._070_thisMethode;

public class Pizza {

    // this()-Methode
    // Muss immer als erstes stehen!!!

    String typ;
    int durchmesser;

    Pizza() {
        this("Margherita", 28);
    }

    Pizza(String typ) {
        // System.out.println();  // Gibt Ärger !!!
        this(typ, 28);
        System.out.println("Dies ist von der Reihenfolge her möglich.");
    }

    Pizza(int durchmesser) {
        this("Margherita", durchmesser);
    }

    Pizza(String typ, int durchmesser) {
        this.typ = typ;                   // Diese this ist Pflicht!!!
        this.durchmesser = durchmesser;   // Diese this ist Pflicht!!!
        System.out.println("Es wurde eine Pizza gebacken!");
        // Zusätzliches für alle Konstruktoren hier rein!
    }

    void beschreibPizza() {
        System.out.print("Ich bin eine Pizza: ");
        System.out.println(this.typ + ": " + this.durchmesser + " cm");
    }

}
