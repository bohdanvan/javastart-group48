package com.bvan.javastart.lessons3_4.type.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanType {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        System.out.println(10 < 20); // T
        System.out.println(15 > 20); // F
        System.out.println(5 == 6); // F
        System.out.println(5 != 6); // T
    }
}
