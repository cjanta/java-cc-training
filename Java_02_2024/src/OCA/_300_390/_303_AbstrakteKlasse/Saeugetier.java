package _300_390._303_AbstrakteKlasse;

// Abtrakte Klassen können von abstrakten Klassen erben,
// ohne die Methoden zu ueberscreiben
public abstract class Saeugetier extends Tier {
    public abstract void lautMachen();

    @Override
    public void atmen() {
        System.out.println("Lungenatmung");
    }
}
