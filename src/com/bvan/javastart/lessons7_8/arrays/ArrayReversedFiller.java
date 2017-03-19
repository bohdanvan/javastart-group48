package com.bvan.javastart.lessons7_8.arrays;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayReversedFiller {

    public static void main(String[] args) {
        int[] array = new int[4];
        reversedSeqFill(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reversedSeqFill(int[] array) {
        int filler = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }
    }
}
