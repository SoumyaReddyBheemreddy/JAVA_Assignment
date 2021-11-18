package soumya.assignment.main;

import soumya.assignment.data.Initialization;
import soumya.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args){
        Initialization initialization = new Initialization();
        initialization.print();
        initialization.printLocal();

        Singleton singleton = Singleton.print("abc");
        singleton.printString();
    }
}
