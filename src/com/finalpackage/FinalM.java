package com.finalpackage;

class ClassA{
    public final void show(){
        System.out.println("Important data");
    }
}
class ClassB extends ClassA{

    /*

    @Override // cannot be overridden
    public void show() {
        System.out.println("Not Important");
    }
     */
}

public class FinalM {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.show();
    }
}
