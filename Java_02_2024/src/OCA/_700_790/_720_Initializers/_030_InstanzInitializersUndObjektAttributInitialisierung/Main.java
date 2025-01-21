package _700_790._720_Initializers._030_InstanzInitializersUndObjektAttributInitialisierung;

// Instanz-Initializers & Objekt-Attribut-Initialisierung
// Die Reihenfolge im Quellcode ist entscheidend.

class Iltis {

    // String name = "Objekti";

    {
        // System.out.println("I am an initializer!");
        this.name = "Ini";
    }

    String name = "Objekti";
}

public class Main {

    public static void main(String[] args) {

        System.out.println(new Iltis().name);  // Ini ODER Objekti
    }
}
