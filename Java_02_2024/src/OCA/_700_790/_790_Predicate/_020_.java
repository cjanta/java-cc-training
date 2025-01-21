package _700_790._790_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

// class Gerade<Integer> implements Predicate<Integer> {  // Geht in Java 13
class Gerade<T> implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}

public class _020_ {

    public static void main(String[] args) {

        ArrayList<Integer> zahlen = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(sortiereAus(zahlen, new Gerade<>()));
    }

    static ArrayList<Integer> sortiereAus(ArrayList<Integer> liste, Predicate<Integer> pre) {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer zahl : liste) {
            if (pre.test(zahl)) {
                res.add(zahl);
            }
        }
        return res;
    }
}
