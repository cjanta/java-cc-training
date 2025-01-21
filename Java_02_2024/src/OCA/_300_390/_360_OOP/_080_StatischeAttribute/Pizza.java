package _300_390._360_OOP._080_StatischeAttribute;

public class Pizza {

    // Statische Attribute
    // Klassen Attribute
    // Klassen Variablen - class variables

    static int counter;

    String typ;
    int durchmesser;

    Pizza() {
        this("Margherita", 28);
    }

    Pizza(String typ) {
        this(typ, 28);
    }

    Pizza(int durchmesser) {
        this("Margherita", durchmesser);
    }

    Pizza(String typ, int durchmesser) {
        this.typ = typ;                   // Diese this ist Pflicht!!!
        this.durchmesser = durchmesser;   // Diese this ist Pflicht!!!
        System.out.println("Es wurde eine Pizza gebacken!");
        // Zusätzliches für alle Konstruktoren hier rein!
        Pizza.counter++;
        // counter++;  // Ginge hier ohne Pizza, aber besser erstmal mit
    }

    void beschreibPizza() {
        System.out.print("Ich bin eine Pizza: ");
        System.out.println(this.typ + ": " + this.durchmesser + " cm");
    }

}
