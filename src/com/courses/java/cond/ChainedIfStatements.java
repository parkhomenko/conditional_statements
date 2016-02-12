package com.courses.java.cond;

public class ChainedIfStatements {

    public static void main(String[] args) {

        int v1 = 5, v2 = 5;

        if (v1 < v2)
            System.out.println("v2 is bigger");
        else if (v2 < v1)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is equal v2");
    }
}
