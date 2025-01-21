package _010_090;

public class _050_ArithmeticOperators {

    public static void main(String[] args) {

        // Rechenoperatoren
        System.out.println(3 + 7);   // 10
        System.out.println("3" + "7");   // 37
        System.out.println(13 - 7);  // 6
        System.out.println(3 * 7);   // 21
        System.out.println(21 / 7);  // 3


        // Bei zwei Integern wird ein Integer zurück gegeben (Integer-Division)
        System.out.println(11 / 2);  // 5
        // Wenn mindestens eine Fließkommazahl dabei ist, wird ein Double zurück gegeben
        System.out.println(11.0 / 2);    // 5.5
        System.out.println(11 / 2.0);    // 5.5
        System.out.println(11.0 / 2.0);  // 5.5
        System.out.println((double) 11 / 2);    // 5.5
        System.out.println((double) (11 / 2));  // 5.0


        // Modulo - Restwert-Division
        System.out.println(37 % 7);  // 2
        System.out.println(7 % 7);   // 0
        System.out.println(4 % 7);   // 4 (die erste Zahl)

        // Inkrement- & Dekrementoperator
        int x = 7;
        x++;
        System.out.println(x);  // 8
        x--;
        --x;
        System.out.println(x);  // 6

        // Die meisten arithmetischen Operatoren geben Integer zurück
        byte b1 = 10;
        byte b2 = 12;
        // byte b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);  // 22

    }
}
