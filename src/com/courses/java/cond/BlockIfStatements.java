package com.courses.java.cond;

public class BlockIfStatements {

    public static void main(String[] args) {

        int v1 = 3, v2 = 5, diff;

        if (v1 < v2) {
            System.out.println("v2 is bigger");
            diff = v2 - v1;
            System.out.println("Difference: " + diff);
        }
        else {
            System.out.println("v1 is bigger");
            diff = v1 - v2;
            System.out.println("Difference: " + diff);
        }
    }
}
