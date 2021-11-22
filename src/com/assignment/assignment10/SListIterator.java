package com.assignment.assignment10;

public class SListIterator<T> {
    private Node<T> head;
    private  Node<T> tail;

    SListIterator(Node<T> list){
         head  = list;

    }
    public void insert(T value){
       Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;

        }
        else {
            tail.next = node;
            tail = node;
        }
    }
    public void remove(){
        if (head==null)
            return;
      else {
          if(head!=tail){
              Node<T> current = head;
              while(current.next != tail) {
                  current = current.next;
              }
              tail = current;
              tail.next = null;
          }
          else {
              head = tail = null;
          }
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
