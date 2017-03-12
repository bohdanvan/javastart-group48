package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class QuantumFactorization {

    public static void main(String[] args) {
        int a = readFromFile("a.txt");
        int b = readFromFile("b.txt");

        int x = quantumFactorization(a, b);

        writeIntoFile("x.out", x);
    }

    private static int quantumFactorization(int a, int b) {
        return 0; // TODO
    }

    private static void writeIntoFile(String fileName, int x) {
        // TODO
    }

    private static int readFromFile(String fileName) {
        return 0; // TODO
    }
}
