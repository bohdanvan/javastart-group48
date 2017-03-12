package com.bvan.javastart.lessons5_6.method.range_sum;

/**
 * @author bvanchuhov
 */
public class MaxFromRangeSum {

    // Client
    public static void main(String[] args) {
        int sum1 = rangeSum(100, 300);
        int sum2 = rangeSum(300, 400);
        int max = max(sum1, sum2);
        int min = min(sum1, sum2);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    // Creator
    public static int rangeSum(int from, int to) {
        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }
    // Creator
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
