package com.sujin.stackinterface.model;

/**
 * Created by Sujin on 3/7/2017.
 */
public class StackFullException extends Exception {

    public StackFullException(){
        super();
    }

    public StackFullException(String msg){
        super(msg);
    }
}
