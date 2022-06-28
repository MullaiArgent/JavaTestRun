package com.oops.classes;
class StaticOuter{
    static class StaticInner {       //only inner classes are static

    }
}
final class FinalClass{
    // can be instantiated but not be inherited or extended
}
abstract class AbstractClass{
    // can hav abs method, can be extended, cannot be instantiated but with anonymous class
}
class POJOExample{

    private int rollNo;
    private int No;
    private String Name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
abstract class Geomentry{
    abstract public void area();
    public void testMethode(){
        System.out.println("Something abtracted");
    }
}

class DummyClass extends Geomentry{
// Concrete Class, which only posses the implementation
    @Override
    public void area() {

    }

}
class SingleTonDemoClass{
    int a = 0;

    static SingleTonDemoClass FLAG = null;

    private SingleTonDemoClass(){}

    public static SingleTonDemoClass instanceKodupavar(){
        if (FLAG == null){
            System.out.println("New Object Created");
            FLAG = new SingleTonDemoClass();
            return FLAG;
        }
        System.out.println("Old object returned");
        return FLAG;
    }
}

public class ClaasesTestRun {
    public static void main(String[] args){

        SingleTonDemoClass singleTonDemoClass0 = SingleTonDemoClass.instanceKodupavar();
        singleTonDemoClass0.a++;
        SingleTonDemoClass singleTonDemoClass1 = SingleTonDemoClass.instanceKodupavar();
        System.out.println(singleTonDemoClass1.a);

        System.out.println(singleTonDemoClass0);
        System.out.println(singleTonDemoClass1);

        StaticOuter a = new StaticOuter();

        StaticOuter.StaticInner aa = new StaticOuter.StaticInner();

        FinalClass finalClass = new FinalClass();

        DummyClass dummyClass =  new DummyClass();
        dummyClass.testMethode();
        dummyClass.area();

        AbstractClass abstractClass = new AbstractClass() {
            // Anonymous Class
        };
        Integer i  =  12; // Wrapper Class
    }
}
