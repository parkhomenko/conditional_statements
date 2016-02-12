package com.courses.java.cond;

public class LowCircuit {

    public static void main(String[] args) {

        /*if (firstFunction() || secondFunction()) {
            System.out.println("In main");
        }*/

        if (firstFunction() && secondFunction()) {
            System.out.println("In main");
        }

        //no need to write "== true"
        if (firstFunction() == true) {
            System.out.println("true way");
        }

        if (!firstFunction()) { // firstFunction returns "false"
            System.out.println("! sign makes condition true");
        }
    }

    public static boolean firstFunction() {
        System.out.println("In First Function");
        return false;
    }

    public static boolean secondFunction() {
        System.out.println("In Second Function");
        return true;
    }
}
