package com.finalpackage;

abstract public class Test {

    abstract public void test1(int val);
    abstract public void test2(double val);
    abstract public void test3(String  val);
    abstract public void test4(int val);
    abstract public void test5(Integer val);

    public void definition(){
        System.out.println("def 1");
        System.out.println("def 2");
    }
}

interface test{
    void test1(int val);
    void test2(double val);
    void test3(String  val);
    void test4(int val);
    void test5(Integer val);
}

class Jnior extends Test{

    @Override
    public void test1(int val) {

    }

    @Override
    public void test2(double val) {
    }

    @Override
    public void test3(String val) {

    }

    @Override
    public void test4(int val) {

    }

    @Override
    public void test5(Integer val) {

    }
}