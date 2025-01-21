package _900_990;

class Student {
    String name = "Peter";
}

public class _910_null {

    public static void main(String[] args) {

        Student student = null;

        // null wird als Wert wieder ausgegeben:
        System.out.println(student);  // null

        // Member-Benutzung eines Object, das null ist -> NullPointerException
        // System.out.println(student.name);  // NullPointerException

        // null und der Konkatenations-Operator
        String str1 = null;
        System.out.println(str1 + "Hello");  // nullHello
        System.out.println("Hello" + str1);  // nullHello
        System.out.println("Hello" + true);  // Hellotrue
        System.out.println(true + "Hello");  // trueHello
        // System.out.println(true + null + "Hello");  // trueHello

        // Das geht NICHT mit concat()
        // System.out.println("Hello".concat(str1));  // NullPointerException
        // System.out.println(str1.concat("Hello"));  // NullPointerException

        // Was alles NICHT geht
        // System.out.println(null + null);   // java: bad operand types for binary operator '+'
        // System.out.println(23 + null);     // java: bad operand types for binary operator '+'
        // System.out.println(null + true);   // java: bad operand types for binary operator '+'
        // System.out.println(false + null);  // java: bad operand types for binary operator '+'
        // System.out.println(true + true);   // java: bad operand types for binary operator '+'
        // System.out.println(23 + true);   // java: bad operand types for binary operator '+'


        // The most specific method is called:
        method(null);  // Z


        // throw null -> NullPointerException
        RuntimeException re = null;
        // throw re;  // NullPointerException

    }

    // The most specific method is called:
    static void method(X x) {
        System.out.println("X");
    }

    static void method(Y y) {
        System.out.println("Y");
    }

    static void method(Z z) {
        System.out.println("Z");
    }
}

class X {
}

class Y extends X {
}

class Z extends Y {
}
