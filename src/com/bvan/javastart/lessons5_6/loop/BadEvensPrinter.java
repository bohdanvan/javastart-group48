package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class BadEvensPrinter {

    public static void main(String[] args) {
        int from = 2; // from < to
        int to = 10;

        // Your code
        if (from % 2 == 0) {
            for (int n = from; n <= to; n += 2) {
                System.out.print(n + " ");
            }
            System.out.println();
        } else {
            for (int n = from + 1; n <= to; n += 2) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
