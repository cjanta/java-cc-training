package _200_290;

public class _220_PrefixPostfix {

    public static void main(String[] args) {

        // Prefix Increment Operator
        // Postfix Increment Operator
        // Prefix Decrement Operator
        // Postfix Decrement Operator

        int zahl = 3;
        zahl++;
        ++zahl;
        System.out.println(zahl);  // 5

        // Prefix findet VOR der Verwendung in dem Ausdruck statt
        System.out.println(++zahl);  // 6

        // Postfix findet NACH der Verwendung in dem Ausdruck statt
        System.out.println(zahl++);  // 6  // Problemchenstelle
        System.out.println(zahl);    // 7

        zahl = 10 + --zahl;
        System.out.println(zahl);  // 16

        zahl = 10 + zahl--;                  // Problemstelle
        System.out.println(zahl);  // 26

        int nummer = 7;
        nummer = nummer++;
        System.out.println(nummer);  // 7

        int nummer2 = 7;
        nummer2 = ++nummer2;
        System.out.println(nummer2);  // 8

        int nummer3 = 7;
        ++nummer3;
        System.out.println(nummer3);  // 8


    }
}
