package _800_890;

// Interface EXTENDS Interface !!!
// Klasse extends Klasse
// Klasse implements Interface

interface I1 {
}

interface I2 {
}

interface I3 extends I1, I2 {
}        // Interface extends Interface !!!

class A {
}

class B extends A implements I1, I2 {
}

interface Animal {
}

interface Canine extends Animal {
}    // Interface extends Interface !!!

class Newfoundlander implements Canine {
}

// Ein erweiterndes Interface kann eine default-Methode überschreiben
// Und ein Klasse kann beide Interfaces implementieren.
// Wobei das Implementieren des Super-Interfaces redundant ist.
interface House {
    default void print() {
        System.out.println("House");
    }
}

interface Bungalow extends House {
    default void print() {
        System.out.println("Bungalow");
    }
}

// class MyHouse implements Bungalow, House {}
class MyHouse implements Bungalow {
}

public class _890_InterfaceExtendsInterface {
    public static void main(String[] args) {
        House h1 = new MyHouse();
        h1.print();  // Bungalow
    }
}
