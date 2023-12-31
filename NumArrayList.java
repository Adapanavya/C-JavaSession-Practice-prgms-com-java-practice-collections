package com.java.practice.collections;

import java.util.ArrayList;
import java.util.Collections;

public class NumArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> numbers=new ArrayList<>();
            numbers.add(23);
            numbers.add(20);
            numbers.add(30);
            numbers.add(10);
            numbers.add(40);
            numbers.set(2,200);
            numbers.remove(3);
            numbers.set(3,100);
          //  Collections.sort(numbers);
           // numbers.clear();
           /* for(int i=0;i<numbers.size();i++){
                System.out.println(numbers.get(i));

            }*/


            for(Integer eachVal:numbers){
                System.out.println(eachVal);
            }

        }
}

