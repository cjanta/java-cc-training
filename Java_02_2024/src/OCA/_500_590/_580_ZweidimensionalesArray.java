package _500_590;

import java.util.Arrays;

public class _580_ZweidimensionalesArray {

    // Zweidimensionales Array

    public static void main(String[] args) {

        int[][] zahlen = new int[2][3];

        System.out.println(zahlen[1][1]);  // 0

        zahlen[0][0] = 1;
        zahlen[0][1] = 2;
        zahlen[0][2] = 3;
        zahlen[1][0] = 4;
        zahlen[1][1] = 5;
        zahlen[1][2] = 6;
        System.out.println("[" + Arrays.toString(zahlen[0]) + ", " + Arrays.toString(zahlen[1]) + "]");  // [1, 2, 3], [4, 5, 6]

        // Array-Literal
        int[][] zahlen2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("[" + Arrays.toString(zahlen2[0]) + ", " + Arrays.toString(zahlen2[1]) + "]");  // [[1, 2, 3], [4, 5, 6]]

        // Ab der zweiten Ebene darf die Array-Länge unterschiedlich sein
        int[][] zahlen3 = new int[3][];
        zahlen3[0] = new int[3];
        zahlen3[1] = new int[1];
        zahlen3[2] = new int[2];
        zahlen3[0][0] = 1;
        zahlen3[0][1] = 2;
        zahlen3[0][2] = 3;
        zahlen3[1][0] = 4;
        zahlen3[2][0] = 5;
        zahlen3[2][1] = 6;

        for (int[] zahl : zahlen3) {
            for (int z : zahl) {
                System.out.print(z + " ");
            }
        }
        System.out.println();  // 1 2 3 4 5 6

        int[][] zahlen4 = {
                {1, 2, 3},
                {4},
                {5, 6}
        };
        System.out.println("[" + Arrays.toString(zahlen4[0]) + ", " +
                Arrays.toString(zahlen4[1]) + ", " +
                Arrays.toString(zahlen4[2]) + "]");
        // [[1, 2, 3], [4], [5, 6]]

        // Klammern dürfen auch an unterschiedlichen Stellen stehen
        int zahlen5[][] = new int[2][];
        int[] zahlen6[] = new int[2][2];
        int[] zahlen7[] = {{1}, {2}};

        // Dimensionen von linke nach rechts
        int[][] zahlen8 = new int[2][];
        // int[][] zahlen9 = new int[][2];  // java: ']' expected

        // Arrays im Array-Literal
        int[] x = new int[3];
        int[][] y = {x};
        System.out.println(Arrays.deepToString(y));  // [[0, 0, 0]]


        // Eine Dimension zuviel anzuspechend endet in einem Compile-Error
        int[] x2 = new int[3];
        // System.out.println(x2[0][0]);  // java: array required, but int found


    }
}
