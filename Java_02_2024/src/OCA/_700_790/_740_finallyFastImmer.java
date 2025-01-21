package _700_790;

public class _740_finallyFastImmer {

    // finally wird vor der Exception noch schnell ausgeführt
    // Ausnahme: System.exit()

    public static void main(String[] args) {

        // System.out.println(test());

        // Nur System.exit(0); verhindert finally {}
        try {
            System.exit(0);
            throw new ArithmeticException();
        } finally {
            System.out.println("Finally!");
        }


    }


    // Bei return im finally darf kein Code mehr folgen -> sonst unreachable statement
    static int test() {

        try {
            System.out.println("Hello");
        } finally {
            return 23;
        }

        // return  42;  // unreachable statement

    }
}
