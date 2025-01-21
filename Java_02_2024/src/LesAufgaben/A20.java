package LesAufgaben;

public class A20 {

    //        Was ist der erwartete Output von folgendem Code?
    void x(int i) {
        System.out.println("one");
    }

    void x(String s) {
        System.out.println("two");
    }

    void x(double d) {
        System.out.println("three");
    }

    public static void main(String[] args) {
        new A20().x(4.0);
    }
}
//
//        A) two
//
//        B) three
//
//        C) one
//
//        D) Compilation error
