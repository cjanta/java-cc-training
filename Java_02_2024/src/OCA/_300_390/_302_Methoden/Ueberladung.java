package _300_390._302_Methoden;

public class Ueberladung {

    // Methode für Addition von zwei int-Werten
    public int addieren(int a, int b) {
        return a + b;
    }

    // Methode für Addition von drei int-Werten (Überladen)
    public int addieren(int a, int b, int c) {
        return a + b + c;
    }

    // Methode für Addition von zwei double-Werten (Überladen)
    public double addieren(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Ueberladung rechner = new Ueberladung();

        System.out.println(rechner.addieren(1, 2));    // Ausgabe: 3
        System.out.println(rechner.addieren(1, 2, 3)); // Ausgabe: 6
        System.out.println(rechner.addieren(1.5, 2.5)); // Ausgabe: 4

    }
}
