package com.bvan.javastart.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class ComplicatedWorkingWeekConditions {

    public static void main(String[] args) {
        int day = 7; // 1..7

        boolean isWorkingDay = day >= 2 && day <= 5;
        boolean isFriendsDay = !isWorkingDay && day != 7;
        boolean isJavaDay = !isFriendsDay && day != 1;

        if (isWorkingDay) {
            System.out.println("Work");
        }
        if (isFriendsDay) {
            System.out.println("Friends");
        }
        if (isJavaDay) {
            System.out.println("Java Course");
        }
    }
}
