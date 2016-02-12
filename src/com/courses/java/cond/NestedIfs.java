package com.courses.java.cond;

public class NestedIfs {

    public static void main(String[] args) {
        int people = 30;
        int rooms = 0;

        System.out.println("Nested If Example 1: ");

        //"nothing" is not printed here
        //because else is the part of the second "if"
	    if (rooms > 0)
            if (people > 0)
                System.out.println(people / rooms);
        else
            System.out.println("nothing");

        System.out.println();

        blockIf();
    }

    public static void blockIf() {
        int people = 30;
        int rooms = 0;

        System.out.println("Nested If Example 2: ");

        //here else is the part of the first "if"
        //because we have curly brackets withing the first "if"
        if (rooms > 0) {
            if (people > 0)
                System.out.println(people / rooms);
        }
        else
            System.out.println("nothing");
    }
}
