package _800_890;

import java.util.Arrays;

public class _800_MehrdimensionaleArrays {

    // Mehrdimensionales Array

    public static void main(String[] args) {

        // Tailing Komma ist in Java erlaubt.

        int[][][] matrix = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}},
                {{13, 14, 15}, {16, 17, 18}},
        };

        System.out.println(matrix[1][1][1]);  // 11
        System.out.println(matrix[0][1][2]);  // 6

        // deepToString()
        System.out.println(Arrays.deepToString(matrix));
        // [[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]], [[13, 14, 15], [16, 17, 18]]]
        System.out.println(Arrays.toString(matrix));
        // [[[I@74a14482, [[I@1540e19d, [[I@677327b6]

        // int[][][] matrix2 = new int[][][];  // java: array dimension missing
        int[][][] matrix2 = new int[3][][];
        // matrix2[0] = new int[][];  // java: array dimension missing
        matrix2[0] = new int[2][];
        matrix2[0][0] = new int[1];
        System.out.println(Arrays.deepToString(matrix2));  // [[[0], null], null, null]

        // Array-Literal in Langform und in Kurzform
        int[] x = new int[]{1, 2, 3};
        int[] y = {1, 2, 3};

        // Welche Ebene passt wo rein?
        int[][] i1 = new int[4][4];
        int[][] i2 = new int[2][2];
        int i3 = 23;
        int[][][][] i4 = new int[2][3][2][2];
        i4[1][1] = i2;
        i1[1][0] = i3;
        i4[1][1][0][1] = i1[1][0];
        i4[1][1] = i1;

        // Unterschiedliche Dimensionen zusammen deklarieren
        int[] int1, int2[];
        int1 = new int[1];
        System.out.println(Arrays.toString(int1));      // [0]
        int2 = new int[2][2];
        System.out.println(Arrays.deepToString(int2));  // [[0, 0], [0, 0]]
        int int3, int4[];
        int3 = 23;
        System.out.println(int3);                       // 23
        int4 = new int[4];
        System.out.println(Arrays.toString(int4));      // [0, 0, 0, 0]


    }
}
