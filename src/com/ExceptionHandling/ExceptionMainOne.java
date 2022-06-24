package com.ExceptionHandling;

public class ExceptionMainOne {
    public static void main(String[] args) {
        try {
            int var = 10 / 0;
        }catch (ArithmeticException a){
            System.out.println();
        }catch (Exception exception){
            System.out.println("Something went wrong");
            exception.printStackTrace();
        }

        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        int var1 = 344;
        System.out.println(var1);
    }
}
