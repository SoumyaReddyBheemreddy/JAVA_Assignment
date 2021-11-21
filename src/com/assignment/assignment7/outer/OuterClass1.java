package com.assignment.assignment7.outer;

public class OuterClass1 {
    class InnerClass1{
         InnerClass1(String message){  //inner class is stored as OuterClass1$InnerClass1
            System.out.println("In Inner class");
            System.out.println(message);
        }
    }
}
