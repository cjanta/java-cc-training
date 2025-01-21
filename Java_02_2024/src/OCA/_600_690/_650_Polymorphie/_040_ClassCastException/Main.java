package _600_690._650_Polymorphie._040_ClassCastException;

class Tier {
}

class Hund extends Tier {
}

class Katze extends Tier {
}

public class Main {
    public static void main(String[] args) {

        // Den Objekt-Typ kann Man nicht downcasten.
        // KEIN Compile-Error, sondern NUR eine CLassCastException.
        Tier tier = new Tier();
        // Hund hund = new Tier();  // java: incompatible types: ...
        // int x = "Hello";         // java: incompatible types: ...

        // Man kann NICHT zu einer Geschwister-Klasse casten.
        Tier katze = new Katze();

        try {

            // Hund hund = (Hund) tier;  // java.lang.ClassCastException: ...Tier cannot be cast to ...Hund

            Hund hund2 = (Hund) katze;  // java.lang.ClassCastException: ...Katze cannot be cast to ...Hund

        } catch (ClassCastException e) {
            System.out.println(e);
        }

        // Das geht beides:
        Katze katze2 = new Katze();
        Tier katze3 = katze2;
        Tier katze4 = new Katze();

    }
}
