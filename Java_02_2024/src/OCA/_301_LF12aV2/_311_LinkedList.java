package _301_LF12aV2;

import java.util.LinkedList;

public class _311_LinkedList {
    public static void main(String[] args) {

        // LinkedList
        // wird im BigData-Bereich bzw. dort wo sehr viele Daten sind eingesetzt
        LinkedList<Integer> list = new LinkedList<>();

        // Elemente hinzufügen
        list.add(1);
        list.add(2);
        list.add(3);

        // Ausgabe der Liste
        System.out.println("Ursprüngliche Liste: " + list);

        // Element an spezifischer Position hinzufügen
        list.add(1, 4);
        System.out.println("Liste nach Hinzufügung an Index 1: " + list);

        // Erstes und letztes Element abrufen
        int first = list.getFirst();
        int last = list.getLast();
        System.out.println("Erstes Element: " + first);
        System.out.println("Letztes Element: " + last);

        // Element entfernen
        list.remove(2);
        System.out.println("Liste nach Entfernung des Elements an Index 2: " + list);

        // Liste durchlaufen
        System.out.println("Liste durchlaufen:");
        for (int item : list) {
            System.out.println(item);
        }
    }
}
