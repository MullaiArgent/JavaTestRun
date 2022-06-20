package com.oops_three;

abstract class A{
    public void show(){
        System.out.println("i'm in show");
    }

   abstract public void newShow();
}
class B{

    public void printer(){
        System.out.println("old definition");
    }

}

public class AnonClass {
    public static void main(String[] args) {

        A obj = new A(){
            @Override
            public void newShow() {
                System.out.println("from show");
            }
        };
        
        obj.show();

        B b1 = new B(){
            @Override
            public void printer(){
                System.out.println("new definition");
            }
        };

        B b2 = new B();
        B b3 = b1;

        b1.printer();
        b2.printer();
        b3.printer();
        
        //A obj2 = new A();
        //obj2.show();
    }
}
