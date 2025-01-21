package _500_590._570_Rekursion;

import java.util.ArrayList;

public class _040_ListenSumme {

    static int listenSumme(ArrayList<Integer> liste) {
        if (liste.isEmpty()) return 0;
        return liste.remove(0) + listenSumme(liste);
    }

    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);

        System.out.println(listenSumme(liste));  // 15
    }
}
