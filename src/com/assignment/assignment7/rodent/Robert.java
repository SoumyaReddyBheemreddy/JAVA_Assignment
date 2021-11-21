package com.assignment.assignment7.rodent;

/*public class Robert {
    Robert(){
        System.out.println("In Robert");
    }
    public void call(){
        System.out.println("Robert is called");
    }
}*/
abstract class Robert{
    Robert(){
        System.out.println("In Robert");
    }
    abstract public void call();
}
class Mouse extends Robert{
    Mouse(){
        System.out.println("In mouse");
    }
    @Override
    public void call(){
        System.out.println("Mouse is called");
    }
    public void run(){
        System.out.println("Mouse Running");
    }
}
class Gerbil extends Robert{
    Gerbil(){
        System.out.println("In Gerbil");
    }
    @Override
    public void call(){
        System.out.println("Gerbil is called");
    }
    public void eat(){
        System.out.println("Gerbil is eating");
    }
}
class Hamster extends Robert{
    Hamster(){
        System.out.println("In Hamster");
    }
    @Override
    public void call(){
        System.out.println("Hamster is called");
    }
    public void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
class Main{
    public static void main(String[] args){
        Robert[] all = new Robert[3];
        all[0] = new Mouse();
        all[1] = new Gerbil();
        all[2] = new Hamster();
        all[0].call();
        all[1].call();
        all[2].call();
    }
}