package _300_390;

public class _340_ShortCircuitEvaluation {

    static boolean test() {
        System.out.println("Test");
        return true;
    }

    public static void main(String[] args) {

        // Short-circuit evaluation bei &&, ||

        if (true && test()) {         // Test
            System.out.println("1");  // 1
        }

        if (false && test()) {        // NO OUTPUT
            System.out.println("2");  // NO OUTPUT
        }

        if (true || test()) {         // NO OUTPUT
            System.out.println("3");  // 3
        }

        if (false || test()) {        // Test
            System.out.println("4");  // 4
        }

        // Hier wird immer der ganze Ausdruck abgearbeitet: &, |
        if (true & test()) {          // Test
            System.out.println("5");  // 5
        }

        if (false & test()) {         // Test
            System.out.println("6");  // NO OUTPUT
        }

        if (true | test()) {          // Test
            System.out.println("7");  // 7
        }

        if (false | test()) {         // Test
            System.out.println("8");  // 8
        }


        // OR und AND
        System.out.println(test1() || test2() && test3());  // Test 1: true

    }

    static boolean test1() {
        System.out.print("Test 1: ");
        return true;
    }

    static boolean test2() {
        System.out.print("Test 2: ");
        return true;
    }

    static boolean test3() {
        System.out.print("Test 3: ");
        return true;
    }

}
