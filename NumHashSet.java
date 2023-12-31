package com.java.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class NumHashSet {
        public static void main(String[] args) {
            HashSet<Integer> numbers=new HashSet<>();
            numbers.add(23);
            numbers.add(23);
            numbers.add(30);
            numbers.add(10);
            numbers.add(40);
            System.out.println(numbers);

        }
}

