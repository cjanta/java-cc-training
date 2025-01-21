package _500_590._570_Rekursion;

import java.util.ArrayList;

public class _030_ListenLaenge {

    static int listenLaenge(ArrayList<Integer> liste) {

        if (liste.isEmpty()) return 0; // Der Wert, der das Ergebnis nicht verändert
        else {
            liste.remove(0);
            return 1 + listenLaenge(liste);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        liste.add(1);
        System.out.println(liste.size());         // 7

        System.out.println(listenLaenge(liste));  // 7
    }
}
