package com.assignment.assignment7.three;


public class Main {
    public static void one(One one){
            one.methodOne1();
            one.methodOne2();
    }
    public static void two(Two two){
            two.methodTwo1();
            two.methodTwo2();
    }
    public static void three(Three three){
                three.methodThree1();
                three.methodThree2();
    }
    public static void four(NewInterface newInterface){
                newInterface.methodNewInterface();
    }
    public static void main(String[] args){
        Combined combined = new Combined();
        one(combined);
        two(combined);
        three(combined);
        four(combined);
    }
}
