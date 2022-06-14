package com.argent;

public class UserMainCode {
    public int sumOdd(int a){
        int s = 0;
        while(a != 0){
            if ((a % 10)%2 != 0){
                s += a%10;
            }
            a /= 10;
        }
        return s;
    }
    public int sumEven(int a){
        int s = 0;
        while(a != 0){
            if ((a % 10)%2 == 0){   // 34576 % 10  = 6  % 2 ==  0,
                s += a%10;          // 34576 / 10  = 3457 % 10 = 7
            }
            a /= 10;
        }
        return s;
    }
    public int findPin(int input1, int input2, int input3, int input4){
        int sum1 = 0;
        int sum2 = 0;

        sum1 += sumEven(input1) +  sumEven(input2) + sumEven(input3);

        sum2 += sumOdd(input1) + sumOdd(input2) + sumOdd(input3);


        if (input4 % 2 == 0){
            return sum1 - sum2;
        }else{
            return sum2 - sum1;
        }
    }

}

/*
    if input 4 is even, input1, input2  and input3 even ooda Sum - odd sum.
    if inpu4 is odd, i1, i2, and i3 ooda odd sum - even sum.

    ex : inpt 1 = 23456
         input2 = 34568
         input3 = 12975
         input4 = 24
 */
