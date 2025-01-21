package LesAufgaben;

public class A12 {
    public static void main(String[] args) {

//        Was ist der erwartete Output von folgendem Code?
//
        String color = "green";

        switch (color) {
            case "Red":
                System.out.println("Found Red");
            case "Blue":
                System.out.println("Found Blue");
                break;
            case "Teal":
                System.out.println("Found Green");
                break;
            default:
                System.out.println("Found Default");
        }
//
//        A)
//        Found Red
//        Found Blue
//        Found Green
//        Found Default
//
//        B)
//        Found Red
//        Found Blue
//        Found Green
//
//        C)
//        Found Red
//        Found Default
//
//        D)
//        Found Green
//
//        E)
//        Found Default


    }
}
