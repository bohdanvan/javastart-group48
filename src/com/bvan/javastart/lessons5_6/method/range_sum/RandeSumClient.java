package com.bvan.javastart.lessons5_6.method.range_sum;

/**
 * @author bvanchuhov
 */
public class RandeSumClient {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(MaxFromRangeSum.rangeSum(MaxFromRangeSum.min(x, y), MaxFromRangeSum.max(x, y)));
    }
}
