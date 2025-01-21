package _300_390._303_AbstrakteKlasse;

// public class Hund extends Tier, Saeugetier{ Klassen können nur von einer Klasse erben
public class Hund extends Tier {

    // abstrakte Methoden müssen überschrieben werden
    @Override
    public void lautMachen() {
        System.out.println("Wuff!");
    }
}
