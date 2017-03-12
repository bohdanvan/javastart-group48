package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        int from = 10;
        int to = 15;

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n; // sum = sum + n
        }

        System.out.println("sum = " + sum);
    }
}
