package com.oops;

public class Main {
    
    public static void main(String[] args) {

        SamsungS9Plus phoneOne = new SamsungS9Plus();
        SamsungS9Plus phoneTwo = new SamsungS9Plus();

        phoneOne.dialer(67676767);
        phoneOne.photograph();

        System.out.println(phoneOne.androidVersion);

        phoneTwo.dialer(349087);
        phoneTwo.batteryMaH -= 100;

        System.out.println("Battery One ooda mah"  + phoneOne.batteryMaH);
        System.out.println("Battery Two ooda mah"  + phoneTwo.batteryMaH);

        System.out.println(SamsungS9Plus.CEO);
        System.out.println(SamsungS9Plus.CEO);

        SamsungS9Plus.CEO = "Meenu";

        System.out.println(SamsungS9Plus.CEO);
        System.out.println(SamsungS9Plus.CEO);

/*

        Baloon baloonOne = new Baloon(12);
        Baloon baloonTwo  = new Baloon(34);

        baloonOne.capacity  -= 5;

        baloonOne.show();
        baloonTwo.show();

*/
    }
}
