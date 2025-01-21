package _300_390._360_OOP._100_toString;

public class Pizza {

    // toString()-Methode
    // Jede Klasse erbt diese Methode automatisch
    // von der Java-eigenen Klasse Object
    // Muss unbedingt public sein, da sie in Object public ist.
    // Muss unbedingt (wie in Object) einen String zurück geben.

    // Überschreibung - Overriding
    // toString()

    // Annotation, damit der Compiler es überprüfen kann

    @Override
    public String toString() {
        return "Ich bin eine Pizza: "
                + this.typ + ": " + this.durchmesser + " cm";
    }

    private static int counter;

    private String typ;
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
        this.typ = typ;
        this.durchmesser = durchmesser;
        System.out.println("Es wurde eine Pizza gebacken!");
        Pizza.counter++;
    }

    // Getter & Setter
    public static int getCounter() {
        return counter;
    }

    // Keinen Setter für den Counter,
    // damit er nicht beschreibbar ist.

    public String getTyp() {
        return this.typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    void beschreibPizza() {
        System.out.print("Ich bin eine Pizza: ");
        System.out.println(this.typ + ": " + this.durchmesser + " cm");
    }


}
