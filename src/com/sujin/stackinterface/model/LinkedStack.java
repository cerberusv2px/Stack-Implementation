package com.sujin.stackinterface.model;

/**
 * Created by Sujin on 3/8/2017.
 */
public class LinkedStack implements Stack {

    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node top=null;
    private int counter=0;

    @Override
    public void push(int num) throws StackFullException {
        Node n =new Node(num);
        n.next=top;
        top=n;
        counter++;
    }

    @Override
    public int pop() throws StackEmptyException {
        if(top==null)
            throw new StackEmptyException();

        Node n =top;
        top=n.next;
        n.next=null;
        counter--;
        return n.data;
    }

    @Override
    public int size() {
        return counter;
    }
}
