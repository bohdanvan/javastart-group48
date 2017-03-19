package com.bvan.javastart.lessons7_8.arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMaxCalculator {

    public static void main(String[] args) {
        System.out.println(max(new int[]{10, 5, 20, 15})); // 20
        System.out.println(max(new int[]{30})); // 30
        System.out.println(max(new int[]{})); // IllegalArgumentException
    }

    public static int max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int max = array[0];
        for (int elem : array) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }
}
