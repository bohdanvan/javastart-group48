package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class TypeCastingSample {

    public static void main(String[] args) {
        int x = 200; // 4B
        byte b = (byte)x; // 1B

        System.out.println("x = " + x); // 200
        System.out.println("b = " + b); // -56
    }
}
