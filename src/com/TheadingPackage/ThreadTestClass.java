package com.TheadingPackage;

class TaskOne extends Thread{
    @Override
    public void run() {
        System.out.println("Task One is Initiated");
        for(int i = 0; i < 5; i++){
            System.out.println("Task One is being performed..." + i);
            try{Thread.sleep(100);}catch (InterruptedException interruptedException){}
        }
        System.out.println("Task One is Terminated");
    }
    public void myJoin() throws InterruptedException {
        while(this.isAlive()){
            Thread.sleep(100);
        }
    }
}
class TaskTwo extends Thread{
    @Override
    public void run() {
        System.out.println("Task Two is Initiated");
        for(int i = 0; i < 5; i++){
            System.out.println("Task Two is being performed..." + i);
            try{Thread.sleep(200);}catch (InterruptedException interruptedException){}
        }
        System.out.println("Task Two is Terminated");
    }
    public void myJoin() throws InterruptedException { // custom Join()
        while(this.isAlive()){
            Thread.sleep(100);
        }
    }
}
public class ThreadTestClass {
    public static void main(String[] args) throws InterruptedException{
        TaskOne taskOne = new TaskOne();
        TaskTwo taskTwo = new TaskTwo();

        taskTwo.setPriority(Thread.MAX_PRIORITY);
        taskOne.setPriority(Thread.MIN_PRIORITY);
        System.out.println(taskOne.isAlive() + "            Line number 30");

        taskOne.start();

        System.out.println(taskOne.isAlive() + "            Line number 34");

        taskTwo.start();

        taskOne.myJoin(); // join() do exist, this is custom join
        taskTwo.myJoin();

        System.out.println(taskOne.isAlive() + "            Line number 38");

        System.out.println("                                Completed.");

        System.out.println(taskOne.getName());
        System.out.println(taskTwo.getName());

        taskOne.setName("Thread-1");
        taskTwo.setName("Thread-2");

        System.out.println(taskOne.getName());
        System.out.println(taskTwo.getName());

        System.out.println(taskOne.getPriority());
        System.out.println(taskTwo.getPriority());





    }
}
