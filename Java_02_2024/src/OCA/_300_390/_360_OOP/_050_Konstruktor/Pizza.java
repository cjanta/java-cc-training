package _300_390._360_OOP._050_Konstruktor;

public class Pizza {

    // Konstruktor
    // Methode mit dem Namen der Klasse
    // Darf keinen Rückgabewert haben
    // Wenn es keinen Konstruktor gibt,
    // wird vom Compiler ein leerer Default-Konstruktor eingebaut.

    // Standard-Werte besser im Konstruktor festlegen

    // Die Deklaration von Objekt-Attributen kann nur hier stattfinden.
    String typ;
    int durchmesser;

    Pizza() {
        // String typ = "Heiss";
        // int durchmesser;
        this.typ = "Margherita";
        this.durchmesser = 28;
        System.out.println("Es wurde eine Pizza gebacken!");
    }

    void beschreibPizza() {
        System.out.print("Ich bin eine Pizza: ");
        System.out.println(this.typ + ": " + this.durchmesser + " cm");
    }

}
