package _300_390._360_OOP._050_Konstruktor;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();

        p1.beschreibPizza();  // Ich bin eine Pizza: Margherita: 28 cm

        Pizza p2 = new Pizza();
        p2.typ = "Salami";
        p2.durchmesser = 30;

        p2.beschreibPizza();  // Ich bin eine Pizza: Salami: 30 cm

    }
}
