package com.sujin.stackinterface.main;

import com.sujin.stackinterface.model.*;

import java.util.Arrays;

/**
 * Created by Sujin on 3/7/2017.
 */
public class StackDemo {

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Stack s1 = new ArrayStack(5);
        Stack s2 = new LinkedStack();

        int[] arr = {1, 2, 3, 5, 6};

        for (int item : arr) {
            s1.push(item);
            s2.push(item);
        }

        int[] reverse1 = reverse(s1);
        int[] reverse2 = reverse(s2);

        System.out.println("Array Stack:");
        System.out.println(Arrays.toString(reverse1));

        System.out.println("Linked Stack:");
        System.out.println(Arrays.toString(reverse2));

    }

    public static int[] reverse(Stack stack) throws StackEmptyException {
        int size = stack.size();
        int[] data = new int[size];
        for (int i = 0; i < size; i++)
            data[i] = stack.pop();
        return data;
    }
}
