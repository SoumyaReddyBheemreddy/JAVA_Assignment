package com.assignment.assignment7.outer;

public class OuterClass2 extends OuterClass1 {
    //if it is non static inner class we can't inherit it because it not instance as it created as
    //OuterClass1$InnerClass1 as it only available for outerclass1
    class InnerClass2 extends InnerClass1{
        InnerClass2(String message) {
            super(message);
            System.out.println("In Inner class2 ");
        }
    }
}
