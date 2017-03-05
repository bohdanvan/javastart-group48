package com.bvan.javastart.lessons3_4.type.floating_point;

/**
 * @author bvanchuhov
 */
public class DoubleStrangeSumSample {

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        System.out.println(0.3 - 0.1); // 0.19999999999999998

        String s = String.format("%.5f", 0.1 + 0.2);
        System.out.println(s); // 0,30000
    }
}
