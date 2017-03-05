package com.bvan.javastart.lessons3_4.type.object;

/**
 * @author bvanchuhov
 */
public class StringSample {

    public static void main(String[] args) {
        String s = "Hello, Java";

        int length = s.length();
        System.out.println("length = " + length); // 11

        char c = s.charAt(1);
        System.out.println("c = " + c); // e

        int javaIndex = s.indexOf("Java");
        System.out.println("javaIndex = " + javaIndex); // 7

        String substring = s.substring(1, 4);
        System.out.println("substring = " + substring); // ell

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase); // HELLO, JAVA

        boolean startsWithHello = s.startsWith("Java");
        System.out.println("startsWithHello = " + startsWithHello); // false

        boolean equals = s.equals("Hello, Java");
        System.out.println("equals = " + equals); // true

        String reversedString = new StringBuilder(s).reverse().toString();
        System.out.println("reversedString = " + reversedString); // avaJ ,olleH
    }
}
