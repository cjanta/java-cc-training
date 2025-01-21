package _800_890;

class Tier {
    void print() {
        System.out.println("Ich Tier!");
    }
}

class Raubtier extends Tier {
    void print() {
        System.out.println("Ich Raubtier!");
    }
}

class Panther extends Raubtier {
    void print() {
        System.out.println("Ich Panther!");
    }
}

public class _820_WildeCasting {

    public static void main(String[] args) {

        // Groß geht nicht klein

        // Bei der Zuweisung gibt es einen Compile-Error
        // Raubtier raubtier1 = (Tier) new Raubtier();  // java: incompatible types: ier cannot be converted to Raubtier
        // Raubtier raubtier2 = new Tier();             // java: incompatible types: ier cannot be converted to Raubtier

        // Im Ausdruck gibt es eine ClassCastException
        // Tier tier1 = (Raubtier) new Tier();        // ClassCastException
        // Raubtier raubtier3 =  (Raubtier) new Tier();  // ClassCastException

        // Diese gehen sind aber redundant:
        Tier tier2 = (Tier) new Raubtier();
        Tier tier3 = (Tier) (Raubtier) new Panther();

        // new entscheidet über den Objekt-Typ
        Tier tier10 = new Panther();
        tier10.print();  // Ich Panther!

        Tier tier11 = (Raubtier) new Panther();
        tier11.print();  //  Ich Panther!

        Tier tier12 = (Tier) new Panther();
        tier12.print();  //  Ich Panther!

        Tier tier13 = (Tier) (Raubtier) new Panther();
        tier13.print();  //  Ich Panther!


    }
}
