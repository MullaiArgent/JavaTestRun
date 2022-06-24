package com.ExceptionHandling;

import java.io.IOException;

class hannamheeException extends Exception{
    hannamheeException(){
        super("My new Exception");
    }
}
public class UserDefinedException {
    public static void main(String[] args) throws IOException {
        int a = 5/6;
        System.out.println(a);
        try {
            if (a == 0) {
                throw new hannamheeException();
            }
        }catch (hannamheeException e){
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }
}
