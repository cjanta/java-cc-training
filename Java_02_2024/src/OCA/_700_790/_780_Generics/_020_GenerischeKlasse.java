package _700_790._780_Generics;

class Allesfresser<T> {
    public T essen;
    public T trinken;
}

// Generische Klasse - generic class
// Eine Klasse parametrisieren - parameterize a class
// Einer Klasse den Umgang mit generischen Typen ermöglichen.
// T ist Programmier-Richtlinie und steht für type (Typ - Datentyp)

public class _020_GenerischeKlasse {

    public static void main(String[] args) {

        Allesfresser<String> fressi1 = new Allesfresser<>();
        fressi1.essen = "Hunde";

        Allesfresser<Integer> fressi2 = new Allesfresser<>();
        fressi2.essen = 123456789;
        // fressi2.essen = "Katze";  // java: incompatible types: java.lang.String cannot be converted to java.lang.Integer

        Allesfresser<Object> fressi3 = new Allesfresser<>();
        fressi3.essen = new Object();
        fressi3.essen = fressi2;
        fressi3.essen = "Möhre";
        fressi3.essen = 42.23;  // Double
        fressi3.trinken = "Mio Mio Ginger";

    }
}
