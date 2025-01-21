package _600_690._620_DefaultKonstruktor;

class A {

    A() {
        System.out.println("A");
    }
}

class B extends A {

    // B() { super(); }
    // In Kindklassen wird automatisch der no-argument default constructor MIT
    // einem leeren super()-Aufruf erzeugt.

    // B(String text) {} // Verhindert den default constructor

    // B() {}  // Geht auch, da im Konstruktor automatisch ein leerer super()-Aufruf erzeugt wird.

}

public class _030_super {

    public static void main(String[] args) {

        B b = new B();  // A
    }
}
