package _700_790;

// default als Keyword bei Interface-Methoden
// Das Interface soll nachträglich verbessert werden.
// default Methoden können auch überschrieben werden.

interface Reachable {
    void telefonieren();

    // void whatsAppen();  // Dies bricht alle schon bestehenden Klassen, die Reachable implementieren.
    default void whatsAppen() {
        System.out.println("WhatsApp me!");
    }
}

// Der folgende Code ist draußen in Benutzung:
abstract class Sportler implements Reachable {
}

class Fussballer extends Sportler {
    @Override
    public void telefonieren() {
        System.out.println("Call me!");
    }
}

class Mitarbeiter implements Reachable {
    @Override
    public void telefonieren() {
        System.out.println("Call me!");
    }

    @Override
    public void whatsAppen() {
        System.out.println("I prefer Telegram!");
    }
}

public class _730_default {
    public static void main(String[] args) {
        Fussballer fussballer = new Fussballer();
        fussballer.telefonieren();  // Call me!
        fussballer.whatsAppen();    // WhatsApp me!

        Mitarbeiter mitarbeiter = new Mitarbeiter();
        mitarbeiter.telefonieren();  // Call me!
        mitarbeiter.whatsAppen();    // I prefer Telegram!
    }
}
