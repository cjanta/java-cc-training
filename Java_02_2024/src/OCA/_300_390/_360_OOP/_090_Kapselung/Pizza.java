package _300_390._360_OOP._090_Kapselung;

public class Pizza {

    // Kapselung (encapsulation)
    // Das Verkapseln von Objekt-Attributen

    // Access modifier
    // public:                class, package, subclass, world
    // protected:             class, package, subclass
    // no modifier (package): class, package
    // private:               class

    // no modifier == package == package-private == default == friendly

    // package wird oft auch package-private genannt
    // und manche sprechen dabei auch von dem default-Zustand
    // da es der Zustand ist, wenn man keinen Modifier angibt.
    // Das ist aber mit Vorsicht zu genießen, da es mittlerweile in Interfaces
    // auch den Modifier default als Keyword gibt.

    // Getter & Setter
    // Objekt-Attribute sollten standardmäßig private sein
    // und der Zugriff sollte über Getter & Setter gesteuert werden.
    // (Von den Konventionen her.)

    private static int counter;

    private String typ;
    private int durchmesser;

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
