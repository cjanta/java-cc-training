package _400_490;

import java.util.Locale;

public class _470_varargs {

    // Varargs - variable arguments
    // Übernimmt jede beliebige Anzahl von Parametern oder EIN Array
    // und erzeugt daraus ein Array

    static void func(String... texte) {
        for (String text : texte) {
            System.out.print(text);
        }
        System.out.println();
    }

    // Varargs (dürfen nur einmal enthalten sein und) müssen zuletzt stehen
    // static void func(String... texte, int test) {}

    static void func(int[] zahl, String... texte) {
        for (String text : texte) {
            System.out.print(text);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        func("Peter");  // Peter
        func("Peter", "Paul");  // Peter Paul
        String[] namen = {"Peter", "Paul", "Mary"};
        func(namen);  // Peter Paul Mary
        // func({"Peter", "Paul", "Mary"});  // java: illegal start of expression
        func(new String[3]);  // null null null

        // Python: [1, 2, 3].func()
        System.out.println("HELLO".toLowerCase());  // hello
    }

}
