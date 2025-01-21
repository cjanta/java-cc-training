package _600_690;

// Abstrakte Methoden
// Sobald es eine abstrakte Methode in einer Klasse gibt, muss auch die Klasse abstrakt sein.
// Abstrakte Methoden haben keinen Rumpf/Anweisungsblock.
// Sind Programmiervorschriften: Die erbenden Klassen müssen diese Fähigkeiten haben.
// In einer abstrakten Klasse können auch normale/fertig implementierte Methoden sein,
// die dann vollständigt an die Kindklassen vererbt werden.

abstract class Form {
    abstract double flaeche();

    abstract String zeichnen();

    String test() {
        return "Test";
    }
}

class Rechteck extends Form {
    double breite;
    double hoehe;

    @Override
    double flaeche() {
        return breite * hoehe;
    }

    @Override
    String zeichnen() {
        return "Zeichnung eines Rechtecks";
    }
}

public class _610_AbstractMethods {

    public static void main(String[] args) {

        Rechteck rechteck = new Rechteck();
        rechteck.breite = 23;
        rechteck.hoehe = 42;
        System.out.println(rechteck.flaeche());   // 966.0
        System.out.println(rechteck.zeichnen());  // Zeichnung eines Rechtecks
        System.out.println(rechteck.test());  // Test

    }
}
