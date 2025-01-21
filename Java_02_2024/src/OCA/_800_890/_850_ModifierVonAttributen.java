package _800_890;

// final bei Attributen hat nichts mit Vererbung zu tun,
// sondern nur damit, ob es sich um eine Konstante handelt.
// Daher siehe Datei zu Konstanten.

// Die Access-Modifier von Attributen dürfen in der Subklasse strenger sein.

class Affe {
    public String name = "Affe";
}

class Schimpanse extends Affe {

    private String name = "Schimpanse";

    public static void main(String[] args) {

        Schimpanse schimpanse = new Schimpanse();
        System.out.println(schimpanse.name);  // Schimpanse
    }
}

public class _850_ModifierVonAttributen {
}
