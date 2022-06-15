package com.asgmnt;

public class Main {
    public static int biggestOfThree(int a,  int b, int c){
       if((a > b) && (a > c)){
           return a;
       }else{
           return Math.max(b, c);
       }
    }
    public static int smalletOfThree(int a, int b, int c){
        if((a < b) && (a < c)){
            return a;
        }else{
            if (b < c){
                return b;
            }else{
                return c;
            }
        }
    }
    public static boolean primeOrNot(int a){
        if (a == 1) return true;

        for(int i = 2; i < a/2; i++){
            if (a % i == 0){
                return false;  // break
            }
        }
        return true;
    }
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 1
        System.out.println(biggestOfThree(1,2,3));
        System.out.println(smalletOfThree(1,2,3));
        // 2
        for (int i = 1; i <= 100; i++){
            if (primeOrNot(i)) {
                continue;
            }
            System.out.println(i);
        }
        //3
        Human Bob = new Human(161, 78, "Bob", "Austrian");

        //4
        pattern(5);
    }
}
class Human{
    int height;
    int weighht;
    String name;
    String nationality;
    static String species = "Homo Sapiens";

    Human(int height, int weighht,  String name, String nationality){
        this.height = height;
        this.weighht = weighht;
        this.nationality = nationality;
        this.name = name;
    }

    public void speak(){
        System.out.println("I speak in the  accent based on my nationality, in my case it is " + nationality);
    }

    public void speed(){
        System.out.println("My running speed is co related with my height which is "+ weighht);
    }

    public void attitude(){
        System.out.println("kinda unsatisfying");
    }
}
