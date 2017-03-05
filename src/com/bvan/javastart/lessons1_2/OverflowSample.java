package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class OverflowSample {

    public static void main(String[] args) {
        byte b = 127;
        b += 2;
        System.out.println(b);
    }
}
