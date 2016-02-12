package com.courses.java.cond;

public class ConditionalAssignment {

    public static void main(String[] args) {

        int v1 = 5;
        int v2 = 3;

        //result = condition ? true_value : false_value
        int min = v1 < v2 ? v1 : v2;

        System.out.println("Minimum is " + min);

        //nested conditions example
        min = v1 < v2 ? v1 : (v1 > v2) ? v2 : -1;

        System.out.println("Minimum is " + min);
    }
}
