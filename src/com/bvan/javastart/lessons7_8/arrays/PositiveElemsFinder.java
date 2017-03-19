package com.bvan.javastart.lessons7_8.arrays;

/**
 * @author bvanchuhov
 */
public class PositiveElemsFinder {

    public static void main(String[] args) {
        int[] array = {-1, 0, 10, -5, 20};
        System.out.println(findFirstPositiveElem(array));
        System.out.println(findLastPositiveElem(array));
        System.out.println(findFirstPositiveIndex(array));
        System.out.println(findLastPositiveIndex(array));
    }

    public static int findFirstPositiveElem(int[] array) {
        for (int elem : array) {
            if (elem > 0) {
                return elem;
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int findLastPositiveElem(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] > 0) {
                return array[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    public static int findFirstPositiveIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    private static int findLastPositiveIndex(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
