package _400_490;

public class _420_Bitwise {

    public static void main(String[] args) {

        // Bitweise Operatoren - Bitwise operators

        // XOR ^
        // Entweder oder
        System.out.println(true ^ true);    // false   !!!
        System.out.println(false ^ true);   // true
        System.out.println(true ^ false);   // true
        System.out.println(false ^ false);  // false

        System.out.println(1 ^ 1);  // 0  !!!
        System.out.println(0 ^ 1);  // 1
        System.out.println(1 ^ 0);  // 1
        System.out.println(0 ^ 0);  // 0

        // Komme entweder Dienstag oder Mittwoch
        System.out.println(25 ^ 5);  // 28
        System.out.println(Integer.toBinaryString(25));  // 11001
        System.out.println(Integer.toBinaryString(5));  //  00101
        System.out.println(Integer.toBinaryString(28));  // 11100

        // & - Bitweises UND
        System.out.println(27 & 7);  // 3
        //   11011
        System.out.println(Integer.toBinaryString(27));  // 11011
        System.out.println(0b11011);  // 27
        // 00111
        System.out.println(Integer.toBinaryString(7));  // 111
        System.out.println(0b111);  // 7

        /*
               11011 -> 27
               &&&&&
               00111 ->  7
               00011 ->  3
         */

        // | - Bitweises ODER (und/oder)
        System.out.println(27 | 7);  // 31
        System.out.println(0b11111);  // 31
        /*
               11011 -> 27
               |||||
               00111 ->  7
               11111 -> 31
         */
        System.out.println(27 | 16);  //

        System.out.println("Bitverschiebung");
        // Bitverschiebung
        // Nach links verschieben: <<
        // Linker Operand mal 2 ** rechter Operand
        System.out.println(2 << 1);  // 4 (2 * 2**1 = 2 * 2)
        // 00010 << 1 -> 00100
        System.out.println(2 << 2);  // 8 (2 * 2**2 = 2 * 4)
        // 00010 << 2 -> 01000
        System.out.println(2 << 3);  // 16 (2 * 2**3 = 2 * 8)
        // 00010 << 3 -> 10000
        System.out.println(2 << 4);  // 32 (2 * 2**4 = 2 * 16)
        // 00010 << 4 -> 100000
        System.out.println(3 << 4);  // 48 (3 * 2**4 = 3 * 16)
        // 00011 << 4 -> 110000

        System.out.println(17 * 2);  // 34
        System.out.println(17 << 1);  // 34

        // Nach rechts verschieben: >>
        // Linker Operand geteilt durch 2 ** rechten Operand
        System.out.println(64 >> 1);  // 32
        System.out.println(64 >> 2);  // 16
        System.out.println(64 >> 3);  //  8
        System.out.println(64 >> 4);  //  4
        // Ganzzahldivision (Integerdivision)
        System.out.println(0b1011011);  // 91
        System.out.println(91 >> 1);  // 45
        System.out.println(91 >> 2);  // 22
        System.out.println(91 / 2);  // 45

        // Integerdivision verhindern
        // Einen der Operanden zu einer Fließkommazahl machen
        System.out.println(91 / 2.0);      // 45.5
        System.out.println(91 / 2f);       // 45.5
        System.out.println(91 / 2d);       // 45.5
        System.out.println(91.0 / 2);      // 45.5
        System.out.println(91 * 1.0 / 2);  // 45.5
        System.out.println(1.0 * 91 / 2);  // 45.5
        // System.out.println(91 / 2 * 1.0);  // 45.0
        System.out.println((double) 91 / 2);      // 45.5


    }
}
