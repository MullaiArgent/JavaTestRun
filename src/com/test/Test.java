package com.test;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        factOfBigInt(new BigInteger("7777"));
    }
    public static  void factOfBigInt(BigInteger val){
        BigInteger answer = new BigInteger("1");
        BigInteger i ;
        for(i = new BigInteger("1"); i.intValue() <= val.intValue(); i = i.add(new BigInteger("1"))){
            answer = answer.multiply(i);
        }
        System.out.println(answer);
    }
}
