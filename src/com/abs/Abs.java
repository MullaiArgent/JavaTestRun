package com.abs;

abstract class Kitchen{

    public void stove(){
        System.out.println("I used to cOOK");
    }

    public void fridge(){
        System.out.println("I contain food");
    }
}

class House extends Kitchen{

}

class Apartment extends Kitchen{

}

public class Abs {
    public static void main(String[] args) {

        House house = new House();
        house.fridge();
        house.stove();

    }

}
