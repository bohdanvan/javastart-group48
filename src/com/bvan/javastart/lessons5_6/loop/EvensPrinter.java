package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class EvensPrinter {

    public static void main(String[] args) {
        int from = 11;
        int to = 20;

        if (from % 2 != 0) {
            from++;
        }

        for (int n = from; n <= to; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
