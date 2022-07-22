package com.asgmnt;

import java.util.ArrayList;
import java.util.List;

public class LargestTwo {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        intArray.add(2);
        intArray.add(2);
        intArray.add(3);
        intArray.add(3);
        intArray.add(5);
        intArray.add(6);
        intArray.add(6);

        int largest = 0;
        int secondLargest = 0;
        for(Integer a : intArray){
            if (a > largest){
                secondLargest = largest;
                largest = a;
            }
        }
        System.out.println(largest + " " +  secondLargest);
    }
}
