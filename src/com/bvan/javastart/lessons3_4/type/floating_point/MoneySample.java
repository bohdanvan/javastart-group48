package com.bvan.javastart.lessons3_4.type.floating_point;

/**
 * @author bvanchuhov
 */
public class MoneySample {

    public static void main(String[] args) {
        long money = 271076172;
        double moneyForOutput = (double)money / 10_000_000;

        System.out.println(moneyForOutput); // 27.1076172
    }
}
