package _700_790;

// Unreachable statement
// Erzeugt einen COMPILE_ERROR !!!

public class _760_UnreachableStatement {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Hello");
            break;
            // System.out.println("World");  // java: unreachable statement
        }


    }

    int test() {
        System.out.println("Hello");
        return 0;
        // System.out.println("World");  // java: unreachable statement
    }
}
