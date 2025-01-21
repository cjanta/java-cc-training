package _130_160.Aufgaben;

public class _050_Quadratzahlen {

    public static void main(String[] args) {

        /*
         * Quadratzahlen
         *
         * Schreibe ein Programm, das alle Quadratzahlen von natürlichen
         * Zahlen (1, 2, 3, ...) ausgibt, die kleiner als 100 sind.
         * (Die Quadratzahlen sollen kleiner 100 sein!)
         *
         *  Zusatz: Gib auch die Anzahl der gefunden Quadratzahlen aus
         */
        int count = 0;
        int result = 0;
        while (result < 100){
            count++;
            result = count * count;
            if (result < 100){
                System.out.println("Zahl: " + count + " hat die Quadratzahl: " + result);
            }
        }
    }
}
