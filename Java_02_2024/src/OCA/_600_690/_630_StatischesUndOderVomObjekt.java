package _600_690;

class Klasse {

    static int counter;

    static void test() {
        System.out.println("Test");
    }

    // Es kann keine gleichnamigen Objekt-Attribute geben
    // int counter;  // variable counter is already defined
    // double counter;

    // Es kann keine gleichnamigen (bei auch gleicher Parameter-Liste) Objekt-Methoden geben
    // void test() {};  // method test() is already defined

    void test(String text) {
    }

    ;  // Überladung geht genau wie sonst.

    void callMe() {
        Klasse.test();
        test();
    }
}

public class _630_StatischesUndOderVomObjekt {

    // Via this zum static member
    static String str = "Hello";

    void doIt() {
        System.out.println(this.str);

        // this kann man nicht ändern
        // this = new _630_StatischesUndOderVomObjekt();  // java: cannot assign a value to final variable this
    }


    public static void main(String[] args) {

        Klasse k1 = new Klasse();

        // Man kan statische Attribute/Methoden auch über ein Objekt der Klasse aufrufen.
        k1.counter = 1;
        System.out.println(k1.counter);  // 1
        k1.test();                       // Test

        Klasse.counter = 2;
        System.out.println(Klasse.counter);  // 2
        Klasse.test();                       // Test

        // null
        // Selbst wenn die Variable vom Referenz-Typ Klasse noch null ist,
        // kann man schon über diese Variable auf die statischen Sachen der Klasse zugreifen.
        Klasse k2 = null;
        k2.test();  // Test


        // Via this zum static member
        new _630_StatischesUndOderVomObjekt().doIt();  // Hello


    }
}
