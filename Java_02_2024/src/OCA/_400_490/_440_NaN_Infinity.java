package _400_490;

public class _440_NaN_Infinity {

    public static void main(String[] args) {

        // NaN - Not a Number
        // System.out.println(0 / 0);     // ArithmeticException
        System.out.println(0.0 / 0.0);    // NaN
        System.out.println(0.0F / 0.0F);  // NaN
        System.out.println(Float.NaN);    // NaN
        System.out.println(Double.NaN);   // NaN
        // System.out.println(NaN + 7);   // JavaScript
        System.out.println(Double.NaN + 7);   // NaN
        // Wenn irgendwo in einem Ausdruck NaN entsteht, ist das Endergebnis NaN
        System.out.println((0.0 / 0.0) + 7 * 9 - 3);  // NaN

        // Inifinty
        // System.out.println(7 / 0);        // ArithmeticException
        System.out.println(7 / 0.0);         // Infinity
        System.out.println((7 / 0.0) + 40);  // Infinity
        System.out.println(7 / 0.0F);        // Infinity
        System.out.println(-7 / 0.0);        // -Infinity
        System.out.println(-7 / 0.0F);       // -Infinity

        System.out.println(Float.POSITIVE_INFINITY);        // Infinity
        System.out.println(Float.POSITIVE_INFINITY + 40);   // Infinity
        System.out.println(Float.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);

        int x = 7;
        x = x + 1;
    }
}
