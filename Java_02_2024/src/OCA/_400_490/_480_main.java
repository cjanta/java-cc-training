package _400_490;

public class _480_main {

    // Die Rückgabe-Wert muss direkt vor dem Methodennamen stehen.

    // Die Reihenfolge der Modifier ist frei wählbar.

    // public static void main(String[] args) { System.out.println("Hello"); }
    // static public void main(String[] args) { System.out.println("Hello"); }

    // Die main() darf final sein
    // public static final void main(String[] args) { System.out.println("Hello"); }
    // public final static void main(String[] args) { System.out.println("Hello"); }
    // final public static void main(String[] args) { System.out.println("Hello"); }
    // final static public void main(String[] args) { System.out.println("Hello"); }

    // varargs sind erlaubt
    // public static void main(String... args) { System.out.println("Hello"); }

    // C-style geht in der main() (und überall sonst auch)
    // Die Array-Klammern stehen hinter dem Bezeichner.
    public static void main(String args[]) {
        System.out.println("Hello");

        // Ohne Konsolen-Argumente wird args ein Array ohne Elemente (mit der Länge 0):
        System.out.println(args.length);  // 0

    }

    int x[];

}
