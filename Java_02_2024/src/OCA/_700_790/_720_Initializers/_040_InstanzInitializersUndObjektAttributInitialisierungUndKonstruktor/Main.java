package _700_790._720_Initializers._040_InstanzInitializersUndObjektAttributInitialisierungUndKonstruktor;

// Instanz-Initializers & Objekt-Attribut-Initialisierung & Konstruktor
// Der Konstruktor wird in jedem Fall zuletzt ausgeführt.

class Iltis {

    Iltis(String name) {
        this.name = name;
    }

    {
        this.name = "Ini";
    }

    String name = "Objekti";

}

public class Main {

    public static void main(String[] args) {

        System.out.println(new Iltis("Consti").name);  // Consti
    }
}
