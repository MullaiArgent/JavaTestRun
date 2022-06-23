package com.oops_three;

interface DemoOne{

    int a = 12;
    default void show(){
        System.out.println("from DemoOne");
    }
}
interface DemoTwo{

    default void show(){
        System.out.println("from DemoTwo");
    }

}

class Dummy implements DemoOne, DemoTwo{

    @Override
    public void show(){
        DemoTwo.super.show();
        DemoOne.super.show();
    }
}
public class MulnherwithIntfce {
    public static void main(String[] args) {

    }
}
