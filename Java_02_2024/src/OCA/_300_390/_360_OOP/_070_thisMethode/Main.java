package _300_390._360_OOP._070_thisMethode;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        p1.beschreibPizza();  // Ich bin eine Pizza: Margherita: 28 cm

        Pizza p2 = new Pizza("Salami");
        p2.beschreibPizza();  // Ich bin eine Pizza: Salami: 28 cm

        Pizza p3 = new Pizza(30);
        p3.beschreibPizza();  // Ich bin eine Pizza: Margherita: 30 cm

        Pizza p4 = new Pizza("Hawaii", 32);
        p4.beschreibPizza();  // Ich bin eine Pizza: Hawaii: 32 cm

    }
}
