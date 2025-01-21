package _300_390._360_OOP._010_KlasseUndObjektAttribute;

import java.util.Arrays;

public class Main {

    // new

    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        System.out.println(p1);  // .. Pizza@378bf509

        // Attribute haben automatisch ihren Default-Wert
        System.out.println(p1.typ);          // null
        System.out.println(p1.durchmesser);  // 0

        int x;
        // System.out.println(x);  // variable x might not have been initialized

        int[] y = new int[1];
        System.out.println(Arrays.toString(y));  // [0]

        p1.typ = "Margherita";
        p1.durchmesser = 28;
        System.out.println(p1.typ + ": " + p1.durchmesser + " cm");  // Margherita: 28 cm

        Pizza p2 = new Pizza();
        p2.typ = "Salami";
        p2.durchmesser = 30;
        System.out.println(p2.typ + ": " + p2.durchmesser + " cm");  // Salami: 30 cm

    }
}
