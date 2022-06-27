package com.testCodes;

import java.math.BigInteger;

public class TestCodes {
    public static void main(String[] args) {
        factOfBigInt(new BigInteger("7777"));
        bothPrimeAndUnitIsNine(5, 100);
        System.out.println(duplicatesDoesExistsOrNot(new int[]{2,3,4,5,2,7,9}));
        System.out.println(duplicatesDoesExistsOrNot(new int[]{2,3,4,5,7,9}));
        biggerAndSmallerInArray(new int[]{-2,-3,-4,-5,-6,-7,-9});

    }
    public static void biggerAndSmallerInArray(int[] arr){
        System.out.println("Bigger Int :" + biggerInArray(arr));
        System.out.println("Smaller Int :" + smallerInArray(arr));
    }
    public static int biggerInArray(int[] arr){
        int temp = Integer.MIN_VALUE;
        for (int i : arr) {
            if (temp < i) temp = i;
        }
        return temp;
    }
    public static int smallerInArray(int[] arr){
        int temp = Integer.MAX_VALUE;
        for(int i : arr){
            if(temp > i) temp = i;
        }
        return temp;
    }
    public static  void factOfBigInt(BigInteger val){
        BigInteger answer = new BigInteger("1");
        BigInteger i ;
        for(i = new BigInteger("1"); i.intValue() <= val.intValue(); i = i.add(new BigInteger("1"))){
            answer = answer.multiply(i);
        }
        System.out.println(answer);
    }
    public static boolean primeOrNot(int a){
        for (int i = 2; i <= a/2 ; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void bothPrimeAndUnitIsNine(int a, int b){
        if (a >= b){
            System.out.println("Invalid input");
            return;
        }
        for (; a <= b;a++){
            if (primeOrNot(a) && a%10 == 9){
                System.out.println(a);
            }
        }
    }
    public static boolean duplicatesDoesExistsOrNot(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}
