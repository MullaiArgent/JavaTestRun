package com.oops_three;


interface DemoTwo{
    default void show(){
        System.out.println("from DemoTwo");
    }
}

class Dummy implements DemoOne, DemoTwo{

    @Override
    public void doSomething() {

    }

    @Override
    public void show(){
        DemoTwo.super.show();
        DemoOne.super.show();
    }
}
interface DemoOne{

    int a = 12; // be default it is Final or constant
    void doSomething();
    default void show(){
        System.out.println("from DemoOne");
    }
    static void doStaticMethod(){
        System.out.println("From interface's Static method");
    }
}
class TestA{
   static int var = 23;
}
public class MulnherwithIntfce {
    public static void main(String[] args) {

        DemoOne demoOne =() -> System.out.println("do something method");

        demoOne.doSomething();

        DemoOne.doStaticMethod();
        System.out.println(TestA.var);
    }
}
