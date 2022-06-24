package com.TheadingPackage;

class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Something in loop");
    }
}
public class RunnableInterfaceThreadClass {
    public static void main(String[] args) {

        RunnableTest runnable = new RunnableTest();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        // lambda
        new Thread(()->System.out.println("Something in loop")).start();

    }
}
