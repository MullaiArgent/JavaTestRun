package com.oops_two;

class PolymorphismA{
    @Override
    public String toString(){
        return getClass().getName();
    }
    public void show(){
        System.out.println("i belog to AAAAAA");
    }
}
class PolymorphismB extends PolymorphismA{
    @Override
    public String toString(){
        return getClass().getName();
    }
    public void show(){
        System.out.println("I belog to BBBBB");
    }
}
public class MainThree {
    public static void main(String[] args) {

        PolymorphismA polymorphismA = new PolymorphismA();
        System.out.println(polymorphismA);
        PolymorphismB polymorphismB = new PolymorphismB();
        System.out.println(polymorphismB);

        PolymorphismA obj = new PolymorphismB();

        obj.show();
        System.out.println(obj);
        System.out.println(obj.hashCode());

        obj = new PolymorphismA();

        obj.show();
        System.out.println(obj);
        System.out.println(obj.hashCode());

    }
}
