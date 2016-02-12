package com.courses.java.cond;

public class VariableScope {

    static int classVariable = 10;

    public static void main(String[] args) {

        int num = 5;

        if (num > 0) {
            int v1 = 3;
            System.out.println("More than zero");
            System.out.println(v1);
        }

        //scope of the "num" variable is the "main" method
        System.out.println(num);

        //scope of the "v1" variable is the "if" block
        //can't do that way
        //System.out.println(v1);

        System.out.println("Class variable: " + classVariable);

        someFunction();
    }

    public static void someFunction() {
        //int someVariable = 0;

        System.out.println("Class variable: " + classVariable);
    }
}
