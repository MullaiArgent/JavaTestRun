package com.oops;

public class Phone {
    int ram;
    int rom;
    int batteryMaH;
    String brand;

    Phone(int ram, int rom, String brand, int batteryMaH){
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
        this.batteryMaH = batteryMaH;
    }
    Phone(int ram, int rom){
        this.ram = ram;
        this.rom = rom;
        System.out.println("the brand and  battery is not your concern");
    }
    Phone(int ram, int rom, String brand){
        this.ram = ram;
        this.rom = rom;
        this.brand = brand;
    }
    Phone(){}

    public long calcAdd(long a, long b){
        return a + b;
    }
    /*
    public int calcAdd(int a, int b){
        return a + b;
    }
    public int calcAdd(int a, int b, int c){
        return a+b+c;
    }
    public int calcAdd(int a, int b, int c, int d){
        return a+b+c+d;
    }
    */

    public int calcAdd(int ... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum +=  a[i];
        }
        return sum;
    }
}
