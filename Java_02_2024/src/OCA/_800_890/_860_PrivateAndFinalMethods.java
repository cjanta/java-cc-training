package _800_890;

class Tier2 {

    private void atmen() {
        System.out.println("Das Tier atmet!");
    }

    final void laufen() {
        System.out.println("Das Tier läuft");
    }

    private final void springen() {
        System.out.println("Das Tier springt");
    }

}

class Wolf extends Tier2 {

    // Die Methode atmen() aus Tier wird NICHT überschrieben.
    // Sie ist private und kann daher vom Wolf nicht gesehen werden.
    // Der Wolf hat seine komplett eigene Methode atmen.
    // @Override
    void atmen() {
        System.out.println("Der Wolf atmet!");
    }

    // Geht nicht, da die Methode in Tier final ist.
    // void laufen() { System.out.println("Der Wolf läuft"); }

    // Geht wiederum, da durch das private das final egal ist.
    // @Override
    void springen() {
        System.out.println("Das Tier springt");
    }
}

public class _860_PrivateAndFinalMethods {

    public static void main(String[] args) {

        Tier2 tier = new Tier2();
        Wolf wolf = new Wolf();

        wolf.atmen();  // Der Wolf atmet!
        // tier.atmen();  // java: atmen() has private access in Tier2
    }
}
