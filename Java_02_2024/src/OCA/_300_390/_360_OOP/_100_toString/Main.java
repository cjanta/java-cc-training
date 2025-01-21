package _300_390._360_OOP._100_toString;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        System.out.println(p1);   // Ich bin eine Pizza: Margherita: 28 cm

        Pizza p2 = new Pizza("Salami");
        System.out.println(p2);   // Ich bin eine Pizza: Salami: 28 cm

        Pizza p3 = new Pizza(30);
        System.out.println(p3);   // Ich bin eine Pizza: Margherita: 30 cm

        Pizza p4 = new Pizza("Hawaii", 32);
        System.out.println(p4);   // Ich bin eine Pizza: Hawaii: 32 cm

        System.out.println("Anzahl der Pizzen: " + Pizza.getCounter());
        // Anzahl der Pizzen: 4

        System.out.println(p1);             // Ich bin eine Pizza: Margherita: 28 cm
        System.out.println(p1.toString());  // Ich bin eine Pizza: Margherita: 28 cm

        Integer x = 47;
        Integer y = 11;
        Integer z = x + y;
        System.out.println(z);             // 58
        System.out.println(x.toString() + y);  // 4711


    }
}
