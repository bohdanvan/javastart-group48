package com.bvan.javastart.lessons5_6.loop.triangle_printer;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        // Print triangle
        for (int row = 1; row <= size; row++) {
            // Print row
            for (int n = 1; n <= row; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output
*
**
***
****
*****
******
*******
********
*********
**********
 */