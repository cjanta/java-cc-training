package _600_690._660_Interface._050_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Bruch> brueche = new ArrayList<>();

        brueche.add(new Bruch(3, 4));
        System.out.println(brueche);  // [3/4]
        brueche.add(new Bruch(7, 4));
        brueche.add(new Bruch(1, 2));
        brueche.add(new Bruch(5, 4));
        brueche.add(new Bruch(1, 4));
        System.out.println(brueche);  // [3/4, 7/4, 1/2, 5/4, 1/4]

        // Collections.sort() braucht Objekte, deren Klassen Comparable implementieren.
        // Collections.sort() braucht eine Instance vom Interface Comparable.
        Collections.sort(brueche);
        System.out.println(brueche);  // [1/4, 1/2, 3/4, 5/4, 7/4]

        // Array
        // Arrays.sort() verlangt auch das Interface Comparable.
        Bruch[] bruchArr = {new Bruch(3, 4), new Bruch(7, 4), new Bruch(1, 2),
                new Bruch(5, 4), new Bruch(1, 4),};
        System.out.println(Arrays.toString(bruchArr));  // [3/4, 7/4, 1/2, 5/4, 1/4]
        Arrays.sort(bruchArr);
        System.out.println(Arrays.toString(bruchArr));  // [1/4, 1/2, 3/4, 5/4, 7/4]
    }
}
