package _300_390._360_OOP._120_ObjekteDirektBenutzen;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Pizza(32).berechneFlaeche());  // 804

        int flaeche = new Pizza(34).berechneFlaeche();
        System.out.println(flaeche);  // 908

        Pizza p1 = new Pizza(48);
        System.out.println(p1.berechneFlaeche());  // 1810

        System.out.println(3 + 4 * 5);

        int x = 4 * 5;

    }
}
