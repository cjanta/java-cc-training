package _010_090;

public class _070_ComparisonOperators {

    public static void main(String[] args) {

        // Vergleichsoperatoren
        // == != < > <= >=
        // Ein Ausdruck mit einem Vergleichsoperator evaluiert immer zu einem Boolean.

        System.out.println(3 == 4);  // false
        System.out.println(2 != 7);  // true

        // Any two numeric primitives can be compared using == operator.

        // Der Integer wird impliziet zum Float gecastet:
        System.out.println(3 == 3.0);  // true

    }
}
