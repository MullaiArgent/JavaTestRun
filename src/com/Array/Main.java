package com.Array;


public class Main {
    public static void main(String[] args) {

        int[] nameArr = new int[6];
        nameArr[0] = 2;
        nameArr[1] = 3;
        nameArr[2] = 2;
        nameArr[3] = 3;
        nameArr[4] = 2;
        nameArr[5] = 3;

        int[] nameArr1 = new int[3];
        nameArr1[0] = 2;
        nameArr1[1] = 3;
        nameArr1[2] = 2;

        int[] nameArr2 =  {1,2,3,4,5,6};

        String[] strings = new String[3];
        strings[0] = "I";
        strings[1] = "love";
        strings[2] = "u";

        myNewStringPrinter(strings);

        myPrinter(nameArr);
        myPrinter(nameArr1);
        myPrinter(nameArr2);

        myNewPrinter(nameArr);
        myNewPrinter(nameArr1);
        myNewPrinter(nameArr2);


        int[][] twoDArray = new int[3][4];

        int[] arr0 = {1,2,3,4};
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        twoDArray[0] = arr0;
        twoDArray[1] = arr1;
        twoDArray[2] = arr2;

        int[][] twoDArray1 = {
                              {1,2,3,4},
                              {1,2,3,4},
                              {1,2,3,4}
                             };

        my2DPrinter(twoDArray);
        my2DPrinter(twoDArray1);

        int[][] jaggedArray = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3,4,5,6},
                {1,2}
        };

        my2DPrinter(jaggedArray);

    }
    public static void my2DPrinter(int[][] twoDArr){
        for(int[] i : twoDArr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        for(int[] i : twoDArr){
            myNewPrinter(i);
        }
        System.out.println();
        */
    }

    public static void myNewPrinter(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void myNewStringPrinter(String[] arr){
        for(String i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void myPrinter(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
