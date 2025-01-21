package _900_990;

public class _960_Inkrementoperator {
    public static void main(String[] args) {

        // Geht mit char
        char c = 65;
        c++;
        System.out.println(c);  // B

        // Die Erhöhung erfolgt erst nach dem switch
        int int1 = 0;
        switch (int1++) {
            case 0:
                System.out.println("0");  // 0
                break;
            case 1:
                System.out.println("1");
        }
        System.out.println(int1);  // 1
    }
}
