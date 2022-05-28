package com.vav.java.LearningJava.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCh4 {
    public static void main(String[] args) {
        Value value = Value.MEDIUM;
        String size = switch(value) {
            case MINISCULE, TEENYWEENIE, SMALL -> "Small";
            case MEDIUM -> "Medium";
            case LARGE, EXTRALARGE -> "Large";
        };
        System.out.println("Your size is: " + size);

        // For each loop
        int [] arrayOfInts = new int[] {1, 2, 4, 5, 7};
        for (int i : arrayOfInts) {
            System.out.println(i);
        }

        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("bar");

        for (String s : list) {
            System.out.println(s);
        }

        // learning unreachable statements
//        if (1 < 2) {
//            System.out.println("1 is less than 2");
//            return;
//        } else {
//            System.out.println("Unreachalbe statement");
//        }

        char [] alphabet = new char [26];
        int alphaLen = alphabet.length;
        System.out.println(alphaLen);

        String [] musketeers = {"one", "two", "three"};
        int muskLen = musketeers.length;
        System.out.println(muskLen);

        // Learning Arrays
        byte [] bar = new byte[] {1,2,3,4};
        byte [] barCopy = Arrays.copyOf(bar, bar.length);
        byte [] expanded = Arrays.copyOf(bar, bar.length+3);
        byte [] firstThree = Arrays.copyOfRange(bar, 0, 3);
        byte [] lastThree = Arrays.copyOfRange(bar, 2, bar.length);
        byte [] lastThreePlusTwo = Arrays.copyOfRange(bar, 2, bar.length+2);

        // create and initialize a triangular array
        int [][] triangle = new int[5][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i; j++){
                triangle[i][j] = i + j;
            }
        }


    }
}
