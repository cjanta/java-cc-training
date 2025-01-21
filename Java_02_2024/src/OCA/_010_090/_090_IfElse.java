package _010_090;

public class _090_IfElse {

    public static void main(String[] args) {

        // if else
        // Kontrollstruktur
        // else darf es nur einmal geben
        // else if kann es beliebig oft geben

        int x = 7;

        // if
        if (x == 7) {
            System.out.println("In x ist eine sieben!");
        }

        // if else
        if (x == 7) {
            System.out.println("In x ist eine sieben!");
        } else {
            System.out.println("In x ist keine sieben!");
        }

        // if else if
        x = 11;
        if (x == 7) {
            System.out.println("In x ist eine sieben!");
        } else if (x == 11) {
            System.out.println("In x ist eine elf!");
        }

        // if else if else
        x = 11;
        if (x == 7) {  // WENN
            System.out.println("In x ist eine sieben!");
        } else if (x == 11) {  // SONST WENN
            System.out.println("In x ist eine elf!");
        } else if (x == 17) {  // SONST WENN
            System.out.println("In x ist eine elf!");
        } else {  // SONST
            System.out.println("In x ist keine sieben oder elf oder siebzehn!");
        }

        // Verschachteln
        if (x != 7) {
            if (x != 11) {
                if (x != 17) {
                    System.out.println("In x ist keine sieben oder elf oder siebzehn!");
                }
            }
        }

        // Die Bedingung muss ein Boolean sein
        int a = 7;
        // if (a) {  // incompatible types: int cannot be converted to boolean
        if (a != 0) {
            System.out.println("a ist nicht 0");
        }

        // else gehört zu dem if, dass am nächsten dran ist

        // Man schreibt es so:
        int wt = 6;
        if (wt >= 6)
            if (wt < 6)
                System.out.println("Ausgabe 2a");
            else
                System.out.println("Ausgabe 3a");  // Ausgabe 3a

        // Man könnte denken, man hat dies geschreiben
        if (wt >= 6) {
            if (wt < 6) {
                System.out.println("Ausgabe 2b");
            }
        } else {
            System.out.println("Ausgabe 3b");
        }

        // Man hat dieses geschrieben:
        if (wt >= 6) {
            if (wt < 6) {
                System.out.println("Ausgabe 2c");
            } else {
                System.out.println("Ausgabe 3c"); //  // Ausgabe 3c
            }
        }


    }
}
