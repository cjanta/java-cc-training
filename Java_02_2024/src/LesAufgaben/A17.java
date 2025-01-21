package LesAufgaben;

public class A17 {
    public static void main(String[] args) {

//        Was ist der erwartete Output von folgendem Code?
//
        String[] table = {"aa", "bb", "cc", "dd"};

        for (String s : table) {
            if ("bb".equals(s)) {
                continue;
            }
            System.out.println(s + " ");
            if ("cc".equals(s)) {
                break;
            }
        }
//
//        A)
//        aa
//        bb
//        cc
//
//        B)
//        aa
//        cc
//
//        C)
//        Compilation error
//
//        D)
//        cc
//        dd
//
//        E)
//        cc


    }
}
