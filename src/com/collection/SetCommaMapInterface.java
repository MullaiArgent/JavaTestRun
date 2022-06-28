package com.collection;

import java.util.*;

public class SetCommaMapInterface {

    public static void main(String[] args) {

        String a = " 34   ";
        int b = Integer.parseInt(a.trim());

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(27);
        integerSet.add(23);
        integerSet.add(24);
        integerSet.add(25);
        integerSet.add(26);
        //System.out.println(integerSet.add(28));
        //System.out.println(integerSet.add(24)); // No Duplicates
        //System.out.println(integerSet);


        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("MUllai", 70112);
        hashMap.put("Rajan",851365);
        hashMap.put("abc",3);
        hashMap.put("abcd",4);
        hashMap.put("a",2);
        hashMap.putIfAbsent("MUllai", 24353545);


        System.out.println(hashMap.get("MUllai"));
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap);
    }
}
