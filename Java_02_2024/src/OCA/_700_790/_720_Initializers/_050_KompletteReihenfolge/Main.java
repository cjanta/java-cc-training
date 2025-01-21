package _700_790._720_Initializers._050_KompletteReihenfolge;

// Komplette Reihenfolge
// 1. Objekt-Attribut deklarieren
// 2. Initializer
// 3. Objekt-Attribut Wert zuweisen
// 4. Konstruktor

class Iltis {

    Iltis(String name) {
        System.out.println(this.name);  // Objekti
        this.name = name;
    }

    {
        System.out.println(this.name);  // null
        this.name = "Ini";
        System.out.println(this.name);  // Ini
    }

    String name = "Objekti";

}

public class Main {

    public static void main(String[] args) {

        System.out.println(new Iltis("Consti").name);  // Consti
    }
}
