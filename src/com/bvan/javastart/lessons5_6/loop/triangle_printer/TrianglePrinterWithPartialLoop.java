package com.bvan.javastart.lessons5_6.loop.triangle_printer;

/**
 * @author bvanchuhov
 */
public class TrianglePrinterWithPartialLoop {

    public static void main(String[] args) {
        int size = 3;

        // * (row = 1)
        for (int n = 1; n <= 1; n++) {
            System.out.print("*");
        }
        System.out.println();

        // ** (row = 2)
        for (int n = 1; n <= 2; n++) {
            System.out.print("*");
        }
        System.out.println();

        // *** (row = 3)
        for (int n = 1; n <= 3; n++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
