package com.vav.java.LearningJava.chapter5;

public class Automobile implements Driveable {
    public boolean startEngine() {
        System.out.println("start Automobile engine");
        return true;
    }
    public void stopEngine() {

    }
    public float accelerate(float f) {
        return 1.0f;
    }
//    public boolean turn() {
//        return true;
//    }


}