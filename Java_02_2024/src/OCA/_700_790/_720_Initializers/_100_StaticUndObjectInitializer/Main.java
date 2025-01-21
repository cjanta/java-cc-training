package _700_790._720_Initializers._100_StaticUndObjectInitializer;

// Initializer & exceptions
// If you try to throw a checked exception from a static block to the outside, the code will not compile.
// An instance block is allowed to throw a checked excention but only if that exception is derlared
// in the throws clause of all the constructors of the class.

class Ex {
    static int int1 = 12;

    static {
        int1 /= 0;
        // ExceptionInInitializerError
        // Caused by: java.lang.ArithmeticException
    }
}

// Every unchecked exception will raise an ExceptionInInitializerError exception.

public class Main {
    public static void main(String[] args) {

        Ex ex = new Ex();
    }
}
