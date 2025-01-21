package _800_890;

public class _810_switchMitKonstantenUndVariablen {

    // switch geht im case mit Konstanten, aber NICHT mit Variablen
    // weil Java zur Compile-Zeit den switch prüft.

    // Dies gilt nicht für finale Wrapper-Objekte.
    // Diese werden vom switch nicht als Konstanten akzeptiert.

    public static void main(String[] args) {

        int zahl = 9;
        final int numCon = 9;
        int numVar = 11;
        final Integer wrap = 23;
        // wrap = 42;  // java: cannot assign a value to final variable wrap

        Integer wrap2 = wrap;
        wrap2 += 111;
        System.out.println(wrap);

        switch (zahl) {
            case 7:
                System.out.println("7");
                break;
            case numCon:
                System.out.println("Konstante");
                // case numVar: System.out.println("Variable");
                // java: constant expression required
                // case wrap2: System.out.println("final Wrapper");
                // java: constant expression required
        }

        int doppelt = 23;
        switch (doppelt) {
            case 23:
                System.out.println(23);
                // case 23:  // java: duplicate case label
        }
    }
}
