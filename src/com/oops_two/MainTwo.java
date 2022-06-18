package com.oops_two;

import java.util.HashMap;

class A extends Object{
    A(){
        System.out.println("Im from Class A Constructor");
    }
}
class B extends A{
    int val;
    B(){
        //super();
        System.out.println("Im from Class B Constructor");
    }

    B(int val){
        //super();
        this.val = val;
        System.out.println("Im from B, i need a int to construct");
    }

    @Override
    public String toString(){
        return "enw";
    }
}
class C extends B{
    C(){
       // super();
        System.out.println("Im from Class C Constructor");
    }
    C(int val){
        super(val); // simple call the constructor of the  super class
        System.out.println("Im from C, I need a int to construct");
    }
    C(int val, int val2){
        super(val); // simple call the constructor of the  super class
        System.out.println("Im from C, I need a int to construct");
    }
    C(int val, String val2){
        super(val); // simple call the constructor of the  super class
        System.out.println("Im from C, I need a int to construct");
    }
    C(String val, int val2){
        super(val2); // simple call the constructor of the  super class
        System.out.println("Im from C, I need a int to construct");
    }
}

public class MainTwo {
    public static void main(String[] args) {

       C c1 = new C(23);
       C c2 = c1;
       B b = new B();
       System.out.println(b.toString() + " from to str4ing call");
       System.out.println(b.hashCode() + " from the hash code");
       System.out.println();

       System.out.println(c1.equals(c2));

       String name1 = "Name1";
       String name = new String("Name0");
       Integer intName = new Integer(12);
       String name2 = "Name1";

       System.out.println(name1.equals(name2));

       System.out.println(name1 == name2);

       B b1 = new B(12);

       B b2 = b1;

       System.out.println(b1.hashCode());
       System.out.println(b2.hashCode());

       System.out.println(name1.hashCode());
       System.out.println(name2.hashCode());
    }
}
