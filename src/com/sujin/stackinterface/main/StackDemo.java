package com.sujin.stackinterface.main;

import com.sujin.stackinterface.model.ArrayStack;

/**
 * Created by Sujin on 3/7/2017.
 */
public class StackDemo {

    public static void main(String[] args) {

        ArrayStack a1=new ArrayStack(5);
        try{
            //a1.push(5);
            //a1.push(4);
            System.out.println(a1.pop());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
