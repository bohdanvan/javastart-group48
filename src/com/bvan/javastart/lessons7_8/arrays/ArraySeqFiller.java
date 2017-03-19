package com.bvan.javastart.lessons7_8.arrays;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySeqFiller {

    public static void main(String[] args) {
        int[] array = new int[10];
        seqFill(array);
        System.out.println(Arrays.toString(array));
    }

    private static void seqFill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
