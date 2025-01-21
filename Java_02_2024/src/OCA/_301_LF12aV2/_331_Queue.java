package _301_LF12aV2;

import java.util.LinkedList;
import java.util.Queue;

public class _331_Queue {
    public static void main(String[] args) {
        // Queue
        // wird häufig in Webservern eingesetzt
        Queue<String> warteschlange = new LinkedList<>();

        // Elemente zur Queue hinzufügen.
        warteschlange.offer("Anfrage1");
        warteschlange.offer("Anfrage2");
        warteschlange.offer("Anfrage3");

        // Das vorderste Element anzeigen ohne es zu entfernen.
        System.out.println("Erstes Element (peek): " + warteschlange.peek());

        // Das vorderste Element entfernen und anzeigen.
        System.out.println("Erstes Element (poll): " + warteschlange.poll());

        // Die verbleibenden Elemente in der Queue anzeigen.
        System.out.println("Verbleibende Elemente in der Queue: " + warteschlange);

        // Überprüfen, ob die Queue ein bestimmtes Element enthält.
        boolean enthaeltAnfrage2 = warteschlange.contains("Element2");
        System.out.println("Enthält die Queue 'Element2'? " + enthaeltAnfrage2);

        // Die Größe der Queue anzeigen.
        int groesse = warteschlange.size();
        System.out.println("Größe der Queue: " + groesse);
    }
}
