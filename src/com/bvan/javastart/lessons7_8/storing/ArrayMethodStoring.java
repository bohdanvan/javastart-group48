package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = createEmptyArray();
        System.out.println(Arrays.toString(a)); // []
    }

    public static int[] createEmptyArray() {
        return new int[0];
    }

    public static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }
}
