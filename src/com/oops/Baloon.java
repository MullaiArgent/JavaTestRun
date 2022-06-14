package com.oops;

public class Baloon {

    int capacity;

    Baloon(int capacity){
        this.capacity = capacity;
        System.out.println("Constructor is being Called" +
                "and the capacity is "+ this.capacity);
    }

    void show(){
        System.out.println(capacity);
    }
}
