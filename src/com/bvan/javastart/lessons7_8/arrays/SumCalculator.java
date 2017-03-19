package com.bvan.javastart.lessons7_8.arrays;

/**
 * @author bvanchuhov
 */
public class SumCalculator {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{10, 5, 20, 15})); // 50
        System.out.println(sum(new int[]{})); // 0
        System.out.println(sum(new int[]{-10})); // -10
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static int oldSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] elem = array;
            sum += elem[i];
        }
        return sum;
    }
}
