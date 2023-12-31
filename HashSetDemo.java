package com.java.practice.collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet h=new HashSet();
        h.add(1);
        h.add("navya");
        h.add(null);
        h.add(2);
        h.add(1);
        System.out.println(h);
    }
}
