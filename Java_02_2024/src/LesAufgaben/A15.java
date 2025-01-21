package LesAufgaben;

public class A15 {
    public static void main(String[] args) {

//        Was ist der erwartete Output von folgendem Code?
//
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 3; j > 0; j--) {
                if (i == j) {
                    count++;
                    break;
                }
            }
            System.out.print(count);
            continue;
        }
//
//        A) 011
//
//        B) 123
//
//        C) 000
//
//        D) 012


    }
}
