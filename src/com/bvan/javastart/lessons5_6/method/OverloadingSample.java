package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class OverloadingSample {

    public static void main(String[] args) {
        int x = sum(10, 20, 5);
        System.out.println(x);
    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
