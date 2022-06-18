package com.oops;

class Ballon {

    static class ChinnaBallon{
        int a =12;

        ChinnaBallon(){
            System.out.println("Im constructor of the inner class");
        }

        public void show(){
            System.out.println("Ill show");
        }
    }

    int capacity;

    public Ballon(int capacity){
        this.capacity = capacity;
        System.out.println("Constructor is being Called" +
                "and the capacity is "+ this.capacity);
    }

    void show(){
        System.out.println(capacity);
    }
}
