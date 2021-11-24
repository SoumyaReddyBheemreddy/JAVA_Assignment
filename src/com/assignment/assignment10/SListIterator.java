package com.assignment.assignment10;

public class SListIterator<T> {
    private Node<T> head;
    private  Node<T> tail;
    private Node<T> current;
    SListIterator(Node<T> list){
         head  = list;
    }
    public boolean hasNext(){
        return current!=null;
    }
    public T next(){
        T value = current.value;
        current = current.next;
        return value;
    }
    public void insert(T value){
       Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            current = head;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }
    public void remove(){
        if(head.next == null){
            head = null;
            current = null;
        }
        else {
            head = head.next;
            current = current.next;
        }

    }
    public void display(){
        Node<T> node = head;
        while (node.next!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }
}
