package com.asgmnt;

class A{
    A(int dummy){
        System.out.println("i'm from constructor A");
    }
    A(int a, int b){}
    A(int a, int b, int c){}
    A(String c, int a, int b){}
    A(int a, int b, String c){}

    private int testVar;
    private int testVar1;
    private int testVar2;
    private int testVar3;

    @Override
    public String toString(){
        return  "" + this.testVar  + "\n" +
                "" + this.testVar1 + "\n" +
                "" + this.testVar2 + "\n" +
                "" + this.testVar3 ;
    }

    private int getTestVar(){
        return this.testVar;
    }
    private void setTestVar(int val){
        this.testVar = val;
    }

    public int getTestVar1() {
        return testVar1;
    }

    public void setTestVar1(int testVar1) {
        this.testVar1 = testVar1;
    }

    public int getTestVar2() {
        return testVar2;
    }

    public void setTestVar2(int testVar2) {
        this.testVar2 = testVar2;
    }

    public int getTestVar3() {
        return testVar3;
    }

    public void setTestVar3(int testVar3) {
        this.testVar3 = testVar3;
    }
}
class B extends A{
    B(){
        super(21);
    }
    B(int a){
        super(21);
    }
}
class C extends A{
    C(){
        super(21);
    }
}
class D extends A{
    D(){
        super(21);
    }
}
class E extends A{
    E(){
        super(21);
    }
}

public class OopsAsgmt {
    public static void main(String[] args) {

    }

}
