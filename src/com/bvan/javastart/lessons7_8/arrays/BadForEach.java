package com.bvan.javastart.lessons7_8.arrays;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class BadForEach {

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            elem = 3;
        }

        // for-each is READ-ONLY
        for (int elem : array) {
            elem = 3; // doesn't work
        }

        System.out.println(Arrays.toString(array));
    }
}
