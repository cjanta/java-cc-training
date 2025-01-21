package _300_390._360_OOP._030_ObjektMethoden;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        System.out.println(p1.typ + ": " + p1.durchmesser + " cm");  // Margherita: 28 cm

        p1.beschreibPizza();  // Ich bin eine Pizza!

        Pizza p2 = new Pizza();
        p2.typ = "Salami";
        p2.durchmesser = 30;
        System.out.println(p2.typ + ": " + p2.durchmesser + " cm");  // Salami: 30 cm

        p2.beschreibPizza();  // Ich bin eine Pizza!

    }
}
