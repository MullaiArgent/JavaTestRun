package com.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.util.Scanner;

class A{
    int GlobalVariable = 12;
    public void test(){
        System.out.println(GlobalVariable);
        int localVariable = 12;
        System.out.println(localVariable);
    }
    public void test2(){
        System.out.println(GlobalVariable);
    }
}

public class UserInput {
    public static void main(String[] args) throws Exception{
/*
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        BigInteger c = scanner.nextBigInteger();
        System.out.println(a + "\n" + b + "\n" + c);
        scanner.close();
*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String aa = "";
        try {
            aa = bufferedReader.readLine();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Exception while reading the data");
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                System.out.println("Unable to close th3e bufferedReader");
            }finally {
                bufferedReader.close();
            }
        }
        System.out.println("Excpeted : " + aa);
        // try with resource. 1.7
        try(BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in))) {
            bufferedReader1.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(aa);



    }
}
