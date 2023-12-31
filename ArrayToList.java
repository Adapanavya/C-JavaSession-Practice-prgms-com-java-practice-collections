package com.java.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args){
        List<Integer> arrayConvertsToList=new ArrayList<>();
        arrayConvertsToList.add(1);
        arrayConvertsToList.add(2);
        arrayConvertsToList.add(3);
        arrayConvertsToList.add(4);
        arrayConvertsToList.add(5);
        for (int list: arrayConvertsToList.reversed()){
            System.out.println(list);
        }
    }
}

