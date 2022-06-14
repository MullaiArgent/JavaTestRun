package com.oops;

public class SamsungS9Plus {

    int ram = 12;
    int rom = 128;
    String androidVersion = "JellyBean";
    int batteryMaH = 3400;
    static String CEO = "Virumandii";

    public void dialer(long number){
        System.out.println("I can dail to " + number);
        System.out.println("dialing... to " + number);
    }

    public void photograph(){
        System.out.println("I can take photo");
    }
}
