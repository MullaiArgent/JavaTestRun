package com.abs;

class Abs1{
   public void printer(Number val){
       System.out.println(val);
   }
}

public class AbsTwo {
    public static void main(String[] args) {

        Number varName0 = new Integer(3);
        Number varName1 = new Double(5);

        //Number varName2 = new Number(5);

        Abs1 abs = new Abs1();
        abs.printer(varName0);
        abs.printer(varName1);

    }
}
