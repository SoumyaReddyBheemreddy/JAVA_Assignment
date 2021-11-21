package com.assignment.assignment7.three;

public class Combined extends Concrete implements NewInterface{

    @Override
    public void methodNewInterface() {
        System.out.println("in method new interface");
    }

    @Override
    public void methodOne1() {
        System.out.println("in method methodOne1");
    }

    @Override
    public void methodOne2() {
        System.out.println("in method methodOne2");
    }

    @Override
    public void methodThree1() {
        System.out.println("in method methodThree1");
    }

    @Override
    public void methodThree2() {
        System.out.println("in method methoThree2");
    }

    @Override
    public void methodTwo1() {
        System.out.println("in method methodTwo1");

    }

    @Override
    public void methodTwo2() {
        System.out.println("in method methodTwo2");
    }
}
