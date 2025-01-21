package _700_790;

import java.util.ArrayList;

public class _700_lambda {

    // lambda
    // Anonyme Funktionen
    // Funktionale Programmierung

    static void dupliziere(int zahl) {
        System.out.println(zahl + zahl);
    }

    public static void main(String[] args) {

        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);

        // forEach() Methode
        // Higher Order Funktion, die eine andere Funktion als Parameter erwartet.

        // Funktionsaufruf
        zahlen.forEach(e -> dupliziere(e));
        zahlen.forEach(z -> dupliziere(z));
        zahlen.forEach(zahl -> dupliziere(zahl));

        for (int zahl : zahlen) {
            dupliziere(zahl);
        }

        // Ein einzelner Ausdruck
        zahlen.forEach(z -> System.out.println(z + z));

        // Mehrere Ausdrücke
        zahlen.forEach(z -> {
            z = z + z;
            System.out.println(z);
        });

        // Methodenreferenz über die Klasse mit :: (und am Ende vom Methodename ohne runde Klammern)
        zahlen.forEach(_700_lambda::dupliziere);

        // removeIf()
        // Braucht eine Methode, die einen Boolean zurück gibt.
        ArrayList<String> texte = new ArrayList<>();
        texte.add("Hello");
        texte.add("");
        texte.add("World");
        System.out.println(texte);  // [Hello, , World]

        texte.removeIf(t -> t.isEmpty());
        System.out.println(texte);  // [Hello, World]

        // Methodenreferenz
        texte.removeIf(String::isEmpty);
        System.out.println(texte);  // [Hello, World]

        texte.removeIf(t -> {
            if (t.contains("H")) return true;
            return false;
        });
        System.out.println(texte);  // [World]

        texte.removeIf(t -> {
            return t.contains("H");
        });
        System.out.println(texte);  // [World]

        // return ist inklusive bei einer Anweisung
        texte.removeIf(t -> t.contains("H"));
        System.out.println(texte);  // [World]

        // Bei geschweiften Klammern für mehrere Anweisungen, muss return vorhanden sein.


    }
}
