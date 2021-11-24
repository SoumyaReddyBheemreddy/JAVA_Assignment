package com.assignment.assignment10;

public class Main {
    public static void main(String[] args){
        SList<Integer> list = new SList<>();
        SListIterator listIterator = list.iterator();
        listIterator.insert(10);
        listIterator.insert(20);
        listIterator.insert(30);
        listIterator.insert(40);
        listIterator.insert(50);
        listIterator.insert(60);
        listIterator.remove();
        listIterator.remove();
        listIterator.insert(70);
        listIterator.insert(80);
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

}
