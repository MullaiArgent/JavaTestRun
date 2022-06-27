package com.TheadingPackage;

class Task{
    static int var = 0;

    public static synchronized void increament(){
        var++;
    }
    public void showTheVar(){
        System.out.println(var);
    }
}

public class LambdaThreadTestClass {
    public static void main(String[] args) throws InterruptedException {

        Thread threadObj = new Thread(()-> {
            for(int i = 1; i <= 1000; i++) {
                Task.increament();
            }
        });
        Thread threadObj1 = new Thread(()->{
            for(int i = 1; i <= 1000; i++){
                Task.increament();
            }
        });

        threadObj.start();
        threadObj1.start();

        threadObj1.join();
        threadObj.join();

        Task task = new Task();
        task.showTheVar();
    }
}
