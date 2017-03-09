package com.sujin.stackinterface.model;

/**
 * Created by Sujin on 3/7/2017.
 */
public class StackEmptyException extends Exception {

    public StackEmptyException(){
        super();
    }

    public StackEmptyException(String msg){
        super(msg);
    }
}
