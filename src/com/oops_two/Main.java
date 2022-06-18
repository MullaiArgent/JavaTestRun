package com.oops_two;
class GrandMa{
    public void phone(){
        System.out.println("I own a Basic Phone");
    }
    public void storyTelling(){
        System.out.println("I can tell a Story");
    }
}
class Mom extends GrandMa{
    public void speak(){
        System.out.println("i speak native accent");
    }

    public void speak(int val){
        System.out.println("i speak native accent");
    }
    public void phone(){
        System.out.println("I own a classic Phone");
    }
}

class Father{
    public void speak(){
        System.out.println("i speak British accent");
    }
}

class Son extends Mom{

    @Override
    public void speak(int name){
        System.out.println("I speak urban");
    }

    public void laptop(){
        System.out.println("I own a higher end machine");
    }
}
class Daughter extends Mom{
    public void makeUp(){
        System.out.println("I do makeUp");
    }
}
public class Main {
    public static void main(String[] args) {
        GrandMa grandMa = new GrandMa();
        Mom mom = new Mom();
        Son son = new Son();
        Daughter daughter = new Daughter();

        grandMa.phone();
        grandMa.storyTelling();

        mom.speak();
        mom.phone();
        mom.storyTelling();

        son.speak();
        son.phone();
        son.laptop();
        son.storyTelling();

        daughter.makeUp();
        daughter.phone();
        daughter.speak();
        daughter.storyTelling();

    }
}
