package _200_290;

public class _280_Math {

    public static void main(String[] args) {

        // https://www.w3schools.com/java/java_ref_math.asp

        // Runden siehe Datein Runden
        // Math.random() in Datei Zufallszahlen

        // min() & max()
        System.out.println(Math.min(3, 4));               // 3
        System.out.println(Math.min(6, Math.min(4, 5)));  // 4
        System.out.println(Math.max(7, 8));               // 8

        // pow() & sqrt()
        System.out.println(Math.pow(2, 24));        // 1.6777216E7 -> 16777216 -> 16.777.216 -> 16_777_216
        System.out.println((int) Math.pow(2, 24));  // 16777216
        System.out.println(16_777_216);             // 16777216
        System.out.println(Math.sqrt(64));    // 8.0

        // abs() - Betrag (der Wert ohne Vorzeichen)
        // abs steht für absolute
        System.out.println(Math.abs(-7));  // 7

        // Math.PI
        System.out.println(Math.PI);

    }
}
