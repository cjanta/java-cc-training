package _300_390._303_AbstrakteKlasse;

public abstract class Tier {
    // das keyword "abstract" markiert eine abstrakte- Klassen und Methoden

    // Abstrakte Methoden müssen von konkreten Kindklassen durch konkrete Methoden überschrieben werden
    public abstract void lautMachen(); // Abstrakte Methode

    // Abstrakte Klassen können auch NICHT-abstrakte Methoden haben
    public void atmen() {
        System.out.println("Atmet");
    }

    int id = 001;

}

