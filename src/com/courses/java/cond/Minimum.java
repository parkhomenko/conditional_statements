package com.courses.java.cond;

public class Minimum {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 5;
        int num3 = 3;

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println("Minimum is num3: " + num3);
            } else {
                System.out.println("Minimum is num2: " + num2);
            }
        } else {
            if (num1 > num3) {
                System.out.println("Minimum is num3: " + num3);
            } else {
                System.out.println("Minimum is num1: " + num1);
            }
        }
    }
}
