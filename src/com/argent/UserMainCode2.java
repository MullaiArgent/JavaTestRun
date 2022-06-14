package com.argent;

public class UserMainCode2 {
    public int minD(int a){
        int temp = 99999999;
        while(a != 0){
            if (temp > a%10){
                temp = a % 10;
            }
            a /= 10;
        }
        return temp;
    }
    public int maxD(int a){
        int temp = -99999999;
        while(a != 0){
            if (temp < a%10){
                temp = a % 10;
            }
            a /= 10;
        }
        return temp;
    }
    public int findPin(int input1, int input2, int input3, int input4){
        return ((maxD(input1) * minD(input1)) +
                (maxD(input2) * minD(input2)) +
                (maxD(input3) * minD(input3) - input4));
    }
}
