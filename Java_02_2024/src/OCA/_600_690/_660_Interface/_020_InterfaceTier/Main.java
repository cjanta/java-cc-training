package _600_690._660_Interface._020_InterfaceTier;

// Dieses Interface KANN  von einer abstrakten Klasse ersetzt werden.

interface Tier {
    void bewegen();

    void essen();
}

class Hund implements Tier {
    @Override
    public void bewegen() {
        System.out.println("Bewegt sich wie ein Hund!");
    }

    @Override
    public void essen() {
        System.out.println("Isst sich wie ein Hund!");
    }
}

class Katze implements Tier {
    @Override
    public void bewegen() {
        System.out.println("Bewegt sich wie ein Katze!");
    }

    @Override
    public void essen() {
        System.out.println("Isst sich wie ein Katze!");
    }
}

public class Main {
    public static void main(String[] args) {
        Tier hund1 = new Hund();
        hund1.bewegen();   // Bewegt sich wie ein Hund!
        hund1.essen();     // Isst sich wie ein Hund!
        Katze katze1 = new Katze();
        katze1.bewegen();  // Bewegt sich wie ein Katze!
        katze1.essen();    // Isst sich wie ein Katze!
    }
}
