package com.argent;

import java.math.BigDecimal;
import java.math.BigInteger;

class Main{

    public static void main(String[] args) {

        System.out.println(new UserMainCode().findPin(2344,34345,45665,24));

        int variableInteger = 12;
        long x = 1200000000;
        float a = 2.3454545454545454545454545454544444444444444444444455f;
        double b = 2.3454545454545454545454545454544444444444444444444455;
        char v = 'w';
        char[] str = {'a','w'};
        boolean bool = true;
        boolean bool2 = false;

        String f = "aw";
        Integer newInt = 23;
        Long newLong = 34444L;
        Double newD = 2.333;
        Character newChar = 's';
        Float ju = 2.33F;

        BigInteger bigInt = new BigInteger("23232222222222222222222222222222222222222222222222222222222");
        BigDecimal bigDec = new BigDecimal("2.3454545454545454545454545454544444444444444444444455");

        System.out.println(a);
        System.out.println(bigInt);
        System.out.println(f);

        /*
        "CamelCasing"
        "snake_casing"
        */
        arithmeticOperations();
        ifElseStatement();
        ternaryOperations();
        switchOperations();
    }

    public static void arithmeticOperations(){

        int a = 4;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        int res = a + b;

        System.out.println(res);
    }

    public static void ifElseStatement(){
        int val1 = 4;
        int val2 = 3;
        if (val1 % 2 == 0){
            System.out.println("it is in First if check");
            System.out.println("It is Even");
            if (val2 % 2 ==  0){
                System.out.println("Val2 is also Even");
            }else{
                System.out.println("but Val2 is Odd");
            }
        }
        else if(val1 == val2){
            System.out.println("it is in second if check");
            System.out.println("Both are Equal");
        }



        if(val1 != val2){
            System.out.println("it is in third if check");
            System.out.println("Both are not Equal");
        }
        else{
            System.out.println("it is in final check");
            System.out.println("it is Odd");
            if (val2 % 2 ==  1){
                System.out.println("Val2 is also Odd");
            }else{
                System.out.println("but Val2 is Even");
            }
        }

        System.out.println("it is out of the If Statement hierarchy");

    }

    public static void ternaryOperations(){

        int a = 23;
        int b = 34;
        int c;

        if (a == b){
            c =  1;
        }
        else{
            c = 0;
        }

        System.out.println(c);

        // (condition) ? experssion1 : exeperssion2
        c = (a == b) ? ternaryTestCallForTrue() : ternaryTestCallForFalse();

        System.out.println(c);


    }
    public static int ternaryTestCallForTrue(){
        System.out.println("I ve been called from ternary operations, and im True");
        return 3434343;
    }
    public static int ternaryTestCallForFalse(){
        System.out.println("I ve been called from ternary operations, and im False");
        return 3456;
    }

    public static void switchOperations(){

        if (switchTestMethod() == 1){
            System.out.println("it is one");
        }
        else if(switchTestMethod() == 2){
            System.out.println("it is two");
        }
        else if(switchTestMethod() == 3){
            System.out.println("it is three");
        }
        else if(switchTestMethod() == 4){
            System.out.println("it is four");
        }
        else{
            System.out.println("None of the above");
        }

        switch (switchTestMethod()){
            case 1 :
                System.out.println("it is one");
                break;
            case 2 :
                System.out.println("it is two");
                break;
            case 3 :
                System.out.println("it is three");
                System.out.println("blah");
                break;
            case 4 :
                System.out.println("it is four");
                break;
        }
    }
    public static int switchTestMethod() {
        return 3;
    }

}