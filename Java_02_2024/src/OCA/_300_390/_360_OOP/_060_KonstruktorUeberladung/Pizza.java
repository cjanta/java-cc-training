package _300_390._360_OOP._060_KonstruktorUeberladung;

public class Pizza {

    // Konstruktor-Überladung
    String typ;
    int durchmesser;

    Pizza() {
        this.typ = "Margherita";
        this.durchmesser = 28;
        System.out.println("Es wurde eine Pizza gebacken!");
    }

    Pizza(String typ) {
        this.typ = typ;   // Diese this ist Pflicht!!!
        this.durchmesser = 28;
        System.out.println("Es wurde eine Pizza gebacken!");
    }

    Pizza(int durchmesser) {
        this.typ = "Margherita";
        this.durchmesser = durchmesser;   // Diese this ist Pflicht!!!
        System.out.println("Es wurde eine Pizza gebacken!");
    }

    Pizza(String typ, int durchmesser) {
        this.typ = typ;                   // Diese this ist Pflicht!!!
        this.durchmesser = durchmesser;   // Diese this ist Pflicht!!!
        System.out.println("Es wurde eine Pizza gebacken!");
    }

    void beschreibPizza() {
        System.out.print("Ich bin eine Pizza: ");
        System.out.println(this.typ + ": " + this.durchmesser + " cm");
    }

}
