package _300_390._360_OOP._120_ObjekteDirektBenutzen;

public class Pizza {

    protected static int counter;

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
        Pizza.counter++;
    }

    public static int getCounter() {
        return counter;
    }

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

    @Override
    public String toString() {
        return "Ich bin eine Pizza: "
                + this.typ + ": " + this.durchmesser + " cm";
    }

    public int berechneFlaeche() {
        return (int) Math.round(Math.pow(getDurchmesser() / 2.0, 2) * Math.PI);
    }

}
