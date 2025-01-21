package _900_990;

public class _930_OverloadingWideningBoxing {

    // 1. Widening (größerer primärer Datentyp)
    // 2. Boxing/Unboxing
    // 3. Varargs

    static void method1(int i) {
        System.out.println("method1(int i)");
    }

    static void method1(double i) {
        System.out.println("method1(double i)");
    }

    static void method1(Integer i) {
        System.out.println("method1(Integer i)");
    }

    static void method2(double i) {
        System.out.println("method2(double i): " + i);
    }

    static void method2(Integer i) {
        System.out.println("method2(Integer i)");
    }

    static void method3(Integer i) {
        System.out.println("method3(Integer i)");
    }

    static void method4(Double i) {
        System.out.println("method4(Double i)");
    }


    // char works with int, but prefers char
    static void method5(char i) {
        System.out.println("method5(char i)");
    }

    static void method5(int i) {
        System.out.println("method5(int i)");
    }

    static void method6(int i) {
        System.out.println("method6(int i)");
    }


    public static void main(String[] args) {

        method1(23);  // method1(int i)
        // Widening before boxing
        method2(23);  // method2(double i): 23.0
        method3(23);  // method3(Integer i)
        // method4(23);  // java: incompatible types: int cannot be converted to java.lang.Double

        char c = 65;
        method5(c);  // method5(char i)
        method6(c);  // method6(int i)

    }
}
