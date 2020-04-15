package arrays;

import java.util.Arrays;

public class Array_ {
    public static void main(String[] args) {
        // Declare
        int[] intArray;
        byte[] byteArray;
        short[] shortsArray;
        boolean[] booleanArray;
        long[] longArray;
        float[] floatArray;
        double[] doubleArray;
        char[] charArray;

        // Initialize
        intArray = new int[10];
        byteArray = new byte[]{'a', 98, 'c'};

        // Iterate 1
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray));

        // Iterate 2
        for (int b : byteArray) {
            System.out.print(b + " ");
            System.out.println();
        }

        // Multidimensional Arrays (Jagged Arrays)
        int[][] int2DArray = new int[10][20];
        int[][][] int3DArray = new int[10][20][10];

        int2DArray = new int[][]{{2, 8, 9}, {1, 3, 5}};
        System.out.println(Arrays.deepToString(int2DArray));
    }
}