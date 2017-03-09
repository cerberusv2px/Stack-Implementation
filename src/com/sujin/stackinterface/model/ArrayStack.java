package com.sujin.stackinterface.model;

/**
 * Created by Sujin on 3/7/2017.
 */
public class ArrayStack implements Stack {

    private int arr[];
    private int top = 0;
    private int n;

    public ArrayStack(int n) {
        arr = new int[n];
        this.n = n;
    }


    @Override
    public void push(int num) throws StackFullException {
        if (top == n)
            throw new StackFullException("Stack is Full");
        arr[top++] = num;

    }

    @Override
    public int pop() throws StackEmptyException {
        if (top <= 0) {
            throw new StackEmptyException("Stack is empty");
        }
        int num = arr[--top];
        return num;
    }

    @Override
    public int size() {
        return top;
    }
}
