package _400_490;

public class _410_enum {

    // Enum - enumerated list
    // enumerated - durchnummeriert, aufgezählt
    // Die möglichen Werte unterliegen beim Benennen den Regln wie andere Bezeichner:
    // Generell erlaubt sind Buchstaben, Ziffern, Unterstrich, Dollar-Zeichen.
    // Das erste Zeichen darf allerdings keine Ziffer sein.

    // https://www.geeksforgeeks.org/enum-in-java/

    enum Belag {Margherita, Salami, Funghi, Hawaii}

    ;

    public static void main(String[] args) {

        Belag belag1 = Belag.Margherita;
        System.out.println(belag1);  // Margherita

        switch (belag1) {
            case Margherita:
                // TODO
                break;
            case Salami:
                // TODO
                break;
            case Funghi:
                // TODO
                break;
            case Hawaii:
                // TODO
        }


    }
}
