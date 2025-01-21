package _300_390;

// Es darf nur die Klasse public sein, die so heisst wie die Datei.
// Aber es geht auch komplett ohne public Klasse.

class Buch {

    static final double MWST = 1.07;
    // finale Variablen (Konstanten) können nach der ersten Wertzuweisung nicht mehr verändert werden.

    private String titel;
    private double nettopreis;  // nettoPreis wäre hier auch möglich

    Buch(String titel, double nettopreis) {
        this.titel = titel;
        this.nettopreis = nettopreis;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getNettopreis() {
        return this.nettopreis;
    }

    public void setNettopreis(double nettopreis) {
        this.nettopreis = nettopreis;
    }

    public double getBruttopreis() {
        return this.nettopreis * MWST;
    }

    public void setBruttopreis(double bruttopreis) {
        this.nettopreis = bruttopreis / MWST;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", nettopreis=" + nettopreis +
                '}';
    }
}

class C {

    // Virtuelle Attribute
    // Wird genauso drauf zugegriffen wie auf ein echtes Attribut,
    // ohne dass es das virtuelle Attribut in der Klasse gibt.

    public static void main(String[] args) {

        Buch buch1 = new Buch("Programmieren macht Spaß!", 10);
        // System.out.println(buch1);  // _300_390.Buch@29453f44
        System.out.println(buch1);  // Buch{titel='Programmieren macht Spaß!', nettopreis=10.0}

        buch1.setNettopreis(20);
        System.out.println(buch1.getNettopreis());  // 20.0

        System.out.println(buch1.getBruttopreis());  // 21.400000000000002

        buch1.setBruttopreis(107);
        System.out.println(buch1.getNettopreis());  // 100.0

    }
}
