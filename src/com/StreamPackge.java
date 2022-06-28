package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPackge {
    public static Integer fact(Integer a){ // Map signature
        int temp = 1;
        for(int i = 2; i <= a;i++){
            temp *= i;
        }
        return temp;
    }
    public static Integer redc(Integer i1, Integer i2){ //reduce signature
        return 1;
    }
    public static boolean filt(Integer a){ // filter signature
        return true;
    }

    public static void main(String[] args) {
        // map()
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(5);

        Stream<Integer> myStream = list.stream();

        Stream<Integer> newMyStream = myStream.map(i -> fact(i));

        List<Integer> finaList = newMyStream.toList();

        //List<Integer> finaList = list.stream().map(i  ->  fact(i)).toList();

        System.out.println(finaList);

        Integer a = finaList.stream().reduce(0, (i,j)-> i+j);
        System.out.println(a);

        List<String> list1 = new ArrayList<>();
        list1.add("Army");
        list1.add("Of");
        list1.add("The");
        list1.add("Dead");

        String b = list1.stream().reduce("", (i,j) -> i+j);

        System.out.println(b);

        List<Integer> filterdList = list.stream().filter(i -> i%2==0).toList();

        System.out.println(filterdList);
    }
}
