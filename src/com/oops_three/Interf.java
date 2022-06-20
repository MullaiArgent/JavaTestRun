package com.oops_three;
class Mom{
    public void speak(){
        System.out.println("i speak native");
    }
    public void eat(){
        System.out.println("eat Junk");
    }
}

interface Rules{
    void eat();
    void groom();
}
interface Rules1{
    String accent();
}

class Son extends Mom implements Rules, Rules1{

    @Override
    public void eat() {
        System.out.println("eat green");
    }
    @Override
    public void groom() {
        System.out.println("groom  well");
    }
    @Override
    public String accent(){
        return "Native Accent";
    }
}
public class Interf {
    public static void main(String[] args) {

    }
}
