package com.java.practice.collections;

import java.util.HashSet;

public class StringHashSet {
    public static void main(String[] args){
        HashSet<String> numbers=new HashSet<>();
        numbers.add("Navya");
        numbers.add("Adapa");
        numbers.add("abc");
        numbers.add("xyz");
        numbers.add("abc");
        numbers.remove("abc");
        System.out.println(numbers.contains("xyz"));
        for (String s:numbers) {
            System.out.println(s);
        }
    }
}
