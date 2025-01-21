package _200_290;

public class _250_DefaultParameter {

    static int addiere(int x, int y) {
        return x + y;
    }

    static int addiere(int x) {
        // return x + 1;
        return addiere(x, 1);  // Default-Parameter ist hier die 1
    }

    static double addiere(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        // Default Parameter durch Überladung
        // Default Parameter kann man benutzen oder weglassen und dann gibt es einen Default-Wert
        // PYTHON: def f(x, y=1): pass

        // Überladung
        // Gleichnamige Methoden mit unterschiedlicher Parameterliste
        // Müssen sich in Typ und/oder Anzahl unterscheiden

        System.out.println(addiere(3, 4)); // 7
        System.out.println(addiere(3));       // 4

        // Überladung mit anderen Datentypen:
        System.out.println(addiere(3.6, 4.4)); // 8.0

    }
}
