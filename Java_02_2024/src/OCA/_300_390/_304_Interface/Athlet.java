package _300_390._304_Interface;

// Interface 1
interface Laeufer {
    int nummer = 1;

    void laufen();
}

// Interface 2
interface Schwimmer {
    // Interfaces können nur abtrakte Methoden haben
    // void schwimmen(){
    //     System.out.println("schwimmt");
    // }
}

// Klasse, die von beiden Interfaces erbt
public class Athlet implements Laeufer, Schwimmer {

    // Implementierung der Methode aus Laeufer
    public void laufen() {
        System.out.println("Der Athlet läuft.");
    }

    // Implementierung der Methode aus Schwimmer
    public void schwimmen() {
        System.out.println("Der Athlet schwimmt.");
    }

    // Hauptklasse
    public static void main(String[] args) {
        Athlet athlet = new Athlet();

        System.out.println(athlet.nummer);

        athlet.laufen();   // Ausgabe: Der Athlet läuft.
        athlet.schwimmen(); // Ausgabe: Der Athlet schwimmt.
    }
}