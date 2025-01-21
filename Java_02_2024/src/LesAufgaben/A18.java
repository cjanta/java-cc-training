package LesAufgaben;

//        Was ist der erwartete Output von folgendem Code?
//
public class A18 {
    private int i;

    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5; ) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        new A18().disp();
    }
}
//
//        A) Printed einmal 1 2 3 4 5
//
//        B) Printed fünfmal 1 2 3 4 5
//
//        C) Printed sechsmal 1 2 3 4 5
//
//        D) Printed einmal 1 3 5
