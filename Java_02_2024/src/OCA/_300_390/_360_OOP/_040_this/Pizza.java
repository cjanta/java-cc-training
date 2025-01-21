package _300_390._360_OOP._040_this;

public class Pizza {

    // this
    // Schlüsselwort - keyword
    // Repräsentiert das Objekt
    // Wenn es keine gleichnamige, lokale Variable gibt,
    // kann das this weggelassen werden.

    String typ = "Margherita";
    int durchmesser = 28;

    void beschreibPizza() {
        String typ = "Heiss";
        System.out.print("Ich bin eine Pizza: ");
        // System.out.println(this.typ + ": " + this.durchmesser + " cm");
        // System.out.println(typ + ": " + durchmesser + " cm");  // Heiss
        System.out.println(this.typ + ": " + durchmesser + " cm");
    }

}