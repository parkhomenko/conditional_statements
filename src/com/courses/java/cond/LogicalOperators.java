package com.courses.java.cond;

public class LogicalOperators {

    public static void main(String[] args) {

        int v1 = 3;
        int v2 = 5;

        System.out.println("Or operator:");
        if (v1 == 1 | v2 == 2) {
            System.out.println("Correct numbers");
        } else {
            System.out.println("Something is wrong");
        }

        System.out.println();

        System.out.println("And operator:");
        if (v1 == 3 & v2 == 5) {
            System.out.println("Correct numbers");
        } else {
            System.out.println("Something is wrong");
        }

        System.out.println();

        System.out.println("! operator");
        if (v1 != 3) {
            System.out.println("Wrong number");
        }
    }
}
