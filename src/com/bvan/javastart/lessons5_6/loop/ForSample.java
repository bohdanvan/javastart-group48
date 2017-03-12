package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForSample {

    public static void main(String[] args) {
        // n = 1..5
        for (int n = 1; n <= 5; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 5..1
        for (int n = 5; n >= 1; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 1..10, evens
        for (int n = 2; n <= 10; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 99..1, odds
        for (int n = 99; n >= 1; n -= 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
