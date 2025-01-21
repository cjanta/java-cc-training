package _010_090;

public class _020_PrimitiveDataTypes {

    public static void main(String[] args) {

        // Primitive data types
        // Werden klein geschrieben

        // Ganzzahlen

        // Byte - 8-Bit (-128 bis 127)
        byte b1 = 127;
        System.out.println(b1);  // 127

        // Short - 16-Bit (-32768 bis 32767)
        short sh1 = -32768;
        System.out.println(sh1);                    // -32768
        System.out.println(Math.pow(2, 16));        // 65536.0
        System.out.println(-(Math.pow(2, 16) / 2));   // -32768.0
        System.out.println((Math.pow(2, 16) / 2) - 1);  // 32767.0

        // Integer - 32-Bit
        // Standard Ganzzahl
        System.out.println(Math.pow(2, 32));        // 4.294967296E9
        System.out.println(-(Math.pow(2, 32) / 2));   // -2.147483648E9
        System.out.println((Math.pow(2, 32) / 2) - 1);  // 2.147483647E9

        // Long - 64-Bit
        // Abschließende L (l)
        long lo1 = 5_000_000_000L;
        System.out.println(lo1);  // 5000000000
        System.out.println(Math.pow(2, 64));        // 1.8446744073709552E19
        System.out.println(-(Math.pow(2, 64) / 2));   // -9.223372036854776E18
        System.out.println((Math.pow(2, 64) / 2) - 1);  //  9.223372036854776E18

        // Fließkommazahlen

        // Float - 32-Bit
        // Abschließende F (f)
        float f1 = 1234.567F;
        System.out.println(f1);  // 1234.567

        // Double - 64-Bit
        // Das D am Ende ist optional
        double d1 = 1234567.1234567;
        System.out.println(d1);  // 1234567.1234567

        // Boolean - 8-Bit
        boolean boo1 = true;
        System.out.println(boo1);  // true
        boolean boo2 = false;
        System.out.println(boo2);  // false

        // Character - 16-Bit
        // Einfache Anführungsstriche
        char c1 = 'A';
        System.out.println(c1);

        // Char als ASCII-Wert dezimal angeben
        // https://www.chip.de/downloads/webapp-ASCII-Tabelle_164031736.html
        char c2 = 65;
        System.out.println(c2);  // A
        char c3 = 97;
        System.out.println(c3);  // a

        // Unicode
        char c4 = '\u0024';
        System.out.println(c4);  // $

        // Unterstrich
        // Muss sinnvoll benutzt werden
        System.out.println(1_000_000_000);  // 1000000000
        System.out.println(0.123_456_789);  // 0.123456789
        System.out.println(1___________0);  // 10

        // System.out.println(_10);      // java: cannot find symbol
        // System.out.println(10_);      // java: illegal underscore
        // System.out.println(10_.123);  // java: illegal underscore
        // System.out.println(10._123);  // java: illegal underscore

        // Initialisierung
        // Deklaration und gleichzeitige Zuweisung des ersten Wertes
        int z1 = 23;  // Initialisierung

        int z2;  // Deklaration
        z2 = 7;  // Zuweisung des ersten Wertes

    }
}
