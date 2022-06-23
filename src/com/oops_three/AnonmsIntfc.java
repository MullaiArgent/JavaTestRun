package com.oops_three;


/*
    Normal Interface,
    Single Abstract Methode(SAM) Interface = Functional Interface
    Marker Interface (ex: Serializable).
*/

interface Demo{
    void testMethode();
    void testMethode2();
    default void defaultMethode(){
        System.out.println("from interface's default Methode");
    }
}

@FunctionalInterface
interface Demo2{
    void testMethode();
}

interface Demo3{
}

public class AnonmsIntfc  {
    public static void main(String[] args) {

        Demo demo = new Demo() {
            @Override
            public void testMethode() {

            }

            @Override
            public void testMethode2() {

            }
            @Override
            public void defaultMethode(){
                System.out.println("overridden default methode");
            }
        };

        demo.defaultMethode();


        Demo2 demo2 = () -> System.out.println("Functional Interface");

        /*

        Demo2 demo2 = new Demo2() {
            @Override
            public void testMethode() {
                System.out.println("giving");
            }
        };

         */

        demo2.testMethode();
    }
}
