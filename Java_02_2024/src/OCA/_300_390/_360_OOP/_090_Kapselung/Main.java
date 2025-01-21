package _300_390._360_OOP._090_Kapselung;

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

        System.out.println("Anzahl der Pizzen: " + Pizza.getCounter());
        // Anzahl der Pizzen: 4

        // p1.typ = "Funghi";
        p1.setTyp("Funghi");
        p1.setDurchmesser(34);
        p1.beschreibPizza();  // Ich bin eine Pizza: Funghi: 34 cm
        System.out.println(p1.getTyp());  // Funghi
        System.out.println(p1.getDurchmesser());  // 34
    }
}
