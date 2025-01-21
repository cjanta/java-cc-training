package _900_990;

import java.io.IOException;

class A {

    void method1() {
    }

    void method2() throws Exception {
    }

    void method3() throws Exception {
    }

    void method4() throws Exception {
    }

    void method5() throws Exception {
    }
}

class B extends A {

    // Die überschreibende Methode darf keine checked Exception im throws haben, die im Original nicht ist
    // void method1() throws Exception {}
    // void method1() throws IOException {}

    // Unchecked Exceptions sind erlaubt. (Das wird gar nicht gecheckt).
    void method1() throws RuntimeException {
    }


    // Es geht jede Exception, die auch eine IS-A von Exception ist.
    // Keine Exception geht auch.
    void method2() throws Exception {
    }

    void method3() throws RuntimeException {
    }

    void method4() throws IOException {
    }

    void method5() {
    }

}

public class _900_OverridingAndThrows {
    public static void main(String[] args) {
        A a = new B();
        a.method1();
        // a.method2();  // braucht throws Exception in main()
        // a.method3();  // braucht throws Exception in main()
        // a.method4();  // braucht throws Exception in main()
        // a.method5();  // braucht throws Exception in main()
        B b = new B();
        b.method1();
        // b.method2();  // braucht throws Exception in main()
        b.method3();
        // b.method4();  // braucht throws IOException in main()
        b.method5();

        // Wenn die Methode des Referenz-Typs eine checked exception wirft,
        // muss auch die main() diese checked exception werfen.

    }
}
