package com.java.practice.collections;

import java.util.Collections;
import java.util.LinkedList;

public class StringArray {
    public static void main(String[] args){
        LinkedList<String> names=new LinkedList<String>();
        names.add("bcd");
        names.add("xyz");
        names.add("abc");
        Collections.sort(names);
        System.out.println(names);
    }
}
