package com.bvan.javastart.lessons5_6.loop.interesting_triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        // Print triangle
        for (int i = size; i >= 1; i--) {
            // Print row
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
10 9 8 7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */