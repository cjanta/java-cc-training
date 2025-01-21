package _900_990;

import java.util.ArrayList;

public class _980_lambdaAndScope {
    public static void main(String[] args) {

        ArrayList<String> texte = new ArrayList<>();
        texte.add("Hello");
        texte.add("");
        texte.add("World");
        System.out.println(texte);  // [Hello, , World]

        // Die Variablen aus dem lambda sind nur im lambda gültig:
        texte.removeIf(t -> t.isEmpty());
        // System.out.println(t);  // java: cannot find variable t
        System.out.println(texte);  // [Hello, World]

        // Variablen von ausserhalb sind im lambda gültig:
        int e = 23;
        // texte.removeIf(e -> e.contains("Hell"));
        // java: variable e is already defined in method main(java.lang.String[])

    }
}
