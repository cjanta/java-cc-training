package _500_590;

import java.util.ArrayList;

public class _590_length_size {

    public static void main(String[] args) {

        // length, size(), length()

        // String -> length()
        System.out.println("Hello".length());  // 5
        StringBuilder name = new StringBuilder("Paul");
        System.out.println(name.length());     // 4

        // Array -> length
        int[] zahlen = {1, 2, 3};
        System.out.println(zahlen.length);  // 3

        // Collections -> size()
        ArrayList<Integer> listi = new ArrayList<>();
        System.out.println(listi.size());  // 0
    }
}
