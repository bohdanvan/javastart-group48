package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySample {

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        System.out.println("length = " + array.length);

        fill(array, 1);

        System.out.println(Arrays.toString(array));
    }

    private static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
