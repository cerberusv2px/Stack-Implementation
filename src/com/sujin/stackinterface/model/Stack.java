package com.sujin.stackinterface.model;

/**
 * Created by Sujin on 3/7/2017.
 */
public interface Stack {

    public void push(int num) throws StackFullException;
    public int pop() throws StackEmptyException;
}
