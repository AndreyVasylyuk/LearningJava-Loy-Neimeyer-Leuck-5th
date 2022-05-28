package com.vav.java.LearningJava.chapter6_ErrorHandlingAndLogging;

public class Euclid2 {
    public static void main(String [] args) {
        int a = 2701;
        int b = 222;

        if (args.length == 2) {
            try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException e){
                System.err.println("Arguments were not both numbers. Using defaults.");
            }
        } else {
            System.err.println("Wrong number of arguments (expected 2)." +
                    "Using defaults.");
        }
        System.out.print("The GCD of " + a + " and " + b + " is ");
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }

}
