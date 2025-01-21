package _300_390;

public class _350_Zahlensysteme {

    public static void main(String[] args) {

        // Oktal
        // Andere Sprachen: 0o10
        int okta = 010;
        System.out.println(okta);  // 8
        System.out.println(023);   // 2 * 8 + 3 -> 19
        // System.out.println(08);    // integer number too large

        // Hexadezimal 0 1 2 3 4 5 6 7 8 9 A B C D E F
        // x | X
        int hexa = 0xFF;  // 255
        System.out.println(hexa);  // 255
        System.out.println(0x10);  // 16
        System.out.println(0x23);  // 2 * 16 + 3 -> 35

        // Binär
        // b | B
        int bina = 0b10;
        System.out.println(bina); // 2

        // Integer.valueOf()
        Integer x = Integer.valueOf("32");
        System.out.println(x);              // 32
        System.out.println(x.getClass());   // class java.lang.Integer
        System.out.println(Integer.valueOf("32", 16)); // 16 * 3 + 2 -> 50
        System.out.println(Integer.valueOf("32", 8));  // 8 * 3 + 2  -> 26

        System.out.println(Integer.toBinaryString(9));  // 1001
        System.out.println(Integer.toOctalString(26));  // 32
        System.out.println(Integer.toHexString(50));    // 32

        System.out.println(Integer.valueOf("32", 3));  // 8 * 3 + 2  -> 26

        // Suffixe
        long lon = 0b0101010101L;
        // double dou = 0b1010101010D;  // java: ';' expected
        // float flo = 0b101010F;  // java: ';' expected
    }
}
