package com.abs;

abstract class Writer{
    abstract public void whoAreYou();

    public void testMethod(){
        System.out.println("im a test method call");
    }
}

class Pen extends Writer{
    Pen(){
        System.out.println("i'm  pen, from constructor");
    }

    @Override
    public void whoAreYou() {
        System.out.println("im pen");
    }
}
class Pencil extends Writer{
    Pencil(){
        System.out.println("i'm pencil, from constructor");
    }

    @Override
    public void whoAreYou() {
        System.out.println("im pencil");
    }
}
class Hand{
    public void write(Writer writerObject){
        System.out.println("I can write");
        writerObject.whoAreYou();
    }
}
class AbsMethod {
    public static void main(String[] args) {

        Writer pen = new Pencil();
        pen.testMethod();

        Hand hand = new Hand();
        hand.write(pen);
    }
}
