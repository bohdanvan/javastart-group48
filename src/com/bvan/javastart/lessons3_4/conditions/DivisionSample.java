package com.bvan.javastart.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class DivisionSample {

    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        if (b != 0 && a / b == 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
