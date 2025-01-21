package _500_590;

// Von finalen Klassen kann nicht geerbt werden.
// class Test extends _550_final {}
// cannot inherit from final _500_590._550_final

class Tier {
    final void essen() {
    }
}

class Hund extends Tier {
    // Finale Methoden können nicht überschrieben werden.
    // void essen() {}
}

public final class _550_final {

    // Final
    // Konstanten immer groß schreiben: SCREAMING_SNAKE_CASE

    // Statische (finale) Variablen müssen direkt initialisiert werden.
    static final int MWST1 = 7;

    // (Finale) Objekt-Variablen können auch erst im Konstruktor ihren Wert zugewisen bekommen.
    final int MWST2 = 19;
    final int MWST3;

    _550_final() {
        MWST3 = 16;
    }

    public static void main(String[] args) {

        System.out.println(_550_final.MWST1);  // 7

        final int XXX = 42;
        System.out.println(XXX);  // 42
        // XXX = 77;  // cannot assign a value to final variable XXX

        final int YYY;
        // System.out.println(YYY);  // variable YYY might not have been initialized
        // int z = YYY;  // variable YYY might not have been initialized
        YYY = 23;
        System.out.println(YYY);  // 23


    }
}
