package com.bvan.javastart.lessons3_4.type.floating_point;

/**
 * @author bvanchuhov
 */
public class InfinitySample {

    public static void main(String[] args) {
        System.out.println(1.0 / 0); // Infinity
        System.out.println(-1.0 / 0); // -Infinity
        System.out.println(0.0 / 0); // NaN
    }
}
