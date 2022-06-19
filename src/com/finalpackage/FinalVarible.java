package com.finalpackage;

final class Area{

    final float pi = 3.14f;

    public double areaOfCircle(int radius){
        return pi * (Math.pow(radius, 2));
    }

    public double areaOfSemiCircle(int radius){
        //return areaOfCircle(radius)/2;
        return 0.5 * pi * (Math.pow(radius, 2));
    }
}

// class TestClass extends Area{  }

public class FinalVarible {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.areaOfCircle(3));
        System.out.println(area.areaOfSemiCircle(3));
        // area.pi = 4.12f; // this should not happen

        // TestClass testClass = new TestClass();
        // testClass.areaOfCircle(3);
    }
}
