package com.argent1;

public class Main {

    public static void main(String[] args) {
        whileOperation();
        forOperations();
        patternPrinting();
        breakAndContinue();
    }

    public static void whileOperation(){
        // when you don't know the limit (run till you the 4Km board)
        boolean board = false;
        int km = 0;
        while(!board){
            km++;
            if(km == 4){
                board  = true;
            }
        }
    }

    public static void forOperations(){
        // when you know the limit (Run for 4 Kilometers)
        for(int km = 0; km < 4; km++){

        }
    }

    public static void patternPrinting(){
        /*
             * * * *
             * * * *
             * * * *
             * * * *
         */

        for(int i = 1; i <= 4;i++){
            for(int j = 1; j <= 4; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        /*
###*
##* *
#* * *
* * * *
         */
        int flag = 3;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(j <= flag){
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            flag--;
            System.out.println();
        }
    }
    public static void breakAndContinue(){
        // break = terminate the loop and get out.
        // continue = skip the current iteration,
        for(int i = 1; i <= 20; i++){
            System.out.print("in to the loop. the iteration val is " + i + "  ");
            if(i % 2 != 0){
                System.out.println("    <- being skipped by 'Continue'");
                continue;
            }
            if(i == 16){
                System.out.println("   <- Broken here");
                break;

            }
            System.out.println(i);
        }
    }

}
