package com.java.practice.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumHashMap {
        public static void main(String[] args) {
            HashMap<Integer, String> map=new HashMap<>();
            map.put(1,"Naresh");
            map.put(2,"Navya");
            Set<Integer> keys=  map.keySet();
            Collection<String> values= map.values();
            for(String val:values){
                System.out.println(val);
            }
            for(Integer key:keys){
                System.out.println(map.get(key));
            }

        }
}

