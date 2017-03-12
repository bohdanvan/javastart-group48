package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printRow(-1);
    }

    private static void printTriangle(int size) {
        checkSize(size);

        for (int row = 1; row <= size; row++) {
            printRow(row);
        }
    }

    private static void printRow(int size) {
        checkSize(size);

        for (int n = 1; n <= size; n++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void checkSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("not positive size: " + size);
        }
    }
}
