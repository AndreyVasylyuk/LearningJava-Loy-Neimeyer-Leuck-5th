package com.vav.java.LearningJava.chapter5;

import java.util.ArrayList;
import java.util.List;

/** Objects in Java

 */

public class MainCh5 {
    public static void main(String [] args) {

//        Float pi = new Float(3.14);
//        Float pi2 = new Float("3.14"); // the same output.

//        Double size = new Double(32.76);

        //"casting" the primitive double value to the various types.
//        double d = size.doubleValue();
//        float f = size.floatValue();
//        long l = size.longValue();
//        int i = size.intValue();

        List myNumbers = new ArrayList<>();
        Integer thirtyThree = new Integer(33);
        myNumbers.add(thirtyThree);

        Integer theNumber = (Integer) myNumbers.get(0);
        int n = theNumber.intValue();

        myNumbers.add(35);
        int m = ((Integer) myNumbers.get(1)).intValue();


        Cat simon = new Cat();
        Animal creature = simon;
        creature.eat();
        simon.eat();

        Automobile auto = new Automobile();
        Lawnmower mower = new Lawnmower();
        Driveable vehicle;

        vehicle = auto;
        vehicle.startEngine();
        vehicle.stopEngine();

        vehicle = mower;
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
