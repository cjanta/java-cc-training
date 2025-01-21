package _800_890;

interface Watchable {
    void eat();

    static void watchMe() {
        System.out.println("I can be watched!");
    }
}

class Crocodile implements Watchable {
    @Override
    public void eat() {
        System.out.println("I like to eat chicken!");
    }
}

public class _830_StaticInterfaceMethods {

    // Statische Methoden müssen einen Body haben.
    // Sie werden nicht vererbt.

    public static void main(String[] args) {

        Crocodile croco = new Crocodile();
        croco.eat();  // I like to eat chicken!
        // croco.watchMe();  // java: cannot find symbol method watchMe()

        Watchable.watchMe();  // I can be watched!
        Watchable croco2 = new Crocodile();
        // croco2.watchMe();  // java: illegal static interface method call
    }
}
