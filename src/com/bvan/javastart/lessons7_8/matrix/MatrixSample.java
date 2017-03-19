package com.bvan.javastart.lessons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixSample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        int elem = matrix[0][2];
        System.out.println(elem);

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] row) {
        for (int elem : row) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
