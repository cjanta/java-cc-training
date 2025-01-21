package _600_690._660_Interface._050_Comparable;

public class Bruch implements Comparable {

    @Override
    public int compareTo(Object obj) {
        Bruch bruch = (Bruch) obj;
        // if (this.equals(bruch)) return 0;
        if (this.dezimalwert() > bruch.dezimalwert()) return 1;
        else if (this.dezimalwert() < bruch.dezimalwert()) return -1;
        return 0;
    }

    double dezimalwert() {
        return (double) zaehler / nenner;
    }

    @Override
    public boolean equals(Object x) {
        if (x == null) return false;
        if (!(x instanceof Bruch)) return false;
        Bruch y = (Bruch) x;

        Bruch a = new Bruch(this.zaehler, this.nenner);
        Bruch b = new Bruch(y.zaehler, y.nenner);
        a.kuerzen();
        b.kuerzen();
        return (a.zaehler == b.zaehler) && (a.nenner == b.nenner);
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

    private int zaehler;
    private int nenner;

    Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    Bruch(int x) {
        zaehler = x;
        nenner = 1;
    }

    Bruch(int x, int y) {
        zaehler = x;
        nenner = y;
    }

    void setZaehler(int z) {
        zaehler = z;
    }

    void setNenner(int n) {
        nenner = n;
    }

    int getZaehler() {
        return zaehler;
    }

    int getNenner() {
        return nenner;
    }

    void ausgeben() {
        System.out.print(zaehler + "/" + nenner);
    }


    String bruchToString() {
        return zaehler + "/" + nenner;
    }

    void kuerzen() {
        int m, n, r; // lokale Variablen
        m = Math.abs(zaehler); // speichert in m den Betrag von zaehler
        n = Math.abs(nenner); // speichert in n den Betrag von nenner
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n; // in n steht jetzt der ggT
        nenner /= n;
    }

    void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    Bruch addiere(Bruch b) {
        int z = zaehler * b.nenner + b.zaehler * nenner;
        int n = nenner * b.nenner;
        Bruch summe = new Bruch(z, n);
        return summe;
    }

    Bruch subtrahiere(Bruch b) {
        int z = zaehler * b.nenner - b.zaehler * nenner;
        int n = nenner * b.nenner;
        Bruch differenz = new Bruch(z, n);
        return differenz;
    }

    Bruch multipliziere(Bruch m) {
        int z = zaehler * m.zaehler;
        int n = nenner * m.nenner;
        Bruch produkt = new Bruch(z, n);
        return produkt;
    }

    int signum() {
        if (this.dezimalwert() == 0.0) {
            return 0;
        }
        if (this.dezimalwert() > 0.0) {
            return 1;
        }
        return -1;
    }

}
