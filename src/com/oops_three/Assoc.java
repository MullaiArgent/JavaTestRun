package com.oops_three;

class Heart{
    Heart(){
        System.out.println("I'm Heart, i'm alive");
    }
    public void blood(){
        System.out.println("Heart do pump the blood");
    }
}
class Human{

    Human(Heart heart){
        System.out.println("I do have heart,im alive");
    }

}
public class Assoc {
    public static void main(String[] args) {
        Heart heart = new Heart();

        Human human = new Human(heart);

        //Human human1 = new Human();
    }
}
