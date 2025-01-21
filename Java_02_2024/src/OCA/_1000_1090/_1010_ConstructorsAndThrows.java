package _1000_1090;


class Pachyderm {

    Pachyderm() throws Exception {
    }

}

class Elefant extends Pachyderm {

    // Elefant() throws Throwable {}  // Geht
    Elefant() throws Exception {
    }  // Geht
    // Elefant() throws RuntimeException {}  // Geht nicht
    // java: unreported exception java.lang.Exception; must be caught or declared to be thrown

    // Der Konstructor der Kindklasse hat impliziet super()
    // und muss daher mindestens die gleich Exception-Klasse werfen.

}

public class _1010_ConstructorsAndThrows {
    public static void main(String[] args) {

    }
}
