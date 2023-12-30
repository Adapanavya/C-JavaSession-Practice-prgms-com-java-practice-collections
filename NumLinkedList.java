package com.java.practice.collections;


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class NumLinkedList<I extends Number> {
    public static void main(String[] arg){
        LinkedList<Integer> numbers=new LinkedList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        numbers.addFirst(2);
        numbers.addLast(15);
        //numbers.removeFirst();
        numbers.removeLast();
        Collections.sort(numbers);
        System.out.println(numbers);


    }
}
