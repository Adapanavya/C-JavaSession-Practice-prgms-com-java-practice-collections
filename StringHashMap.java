package com.java.practice.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class StringHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> names=new HashMap<>();
        names.put("adapa",1);
        names.put("abc",2);
        names.put("adapa",3);
        names.put("xyz",4);
        System.out.println(names.get("abc"));

    }

}
