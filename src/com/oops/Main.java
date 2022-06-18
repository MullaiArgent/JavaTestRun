package com.oops;

public class Main {
    
    public static void main(String[] args) {
/*
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

        Baloon baloonOne = new Baloon(12);
        Baloon baloonTwo  = new Baloon(34);

        baloonOne.capacity  -= 5;

        baloonOne.show();
        baloonTwo.show();
*/

        Phone samsung =
                new Phone(12,128, "Samsung", 2500);
        Phone goodPhone =
                new Phone(16, 256);
        Phone goodConfig =
                new Phone(12, 100, "Vivo");
        Phone None =
                new Phone();

        long a = 777777777;
        long b = 777777777;
        System.out.println(goodPhone.calcAdd(a, b));
        System.out.println(goodPhone.calcAdd(4, 5));
        System.out.println(goodPhone.calcAdd(4, 5, 5));
        System.out.println(goodPhone.calcAdd(4, 5, 5, 6));
        System.out.println(goodConfig.calcAdd(2,2,2,2,2,2,2,2,2,2));

        Ballon.ChinnaBallon naVechaName = new Ballon.ChinnaBallon();
        Ballon ballon = new Ballon(23); // Outer Class

        ballon.show();
        naVechaName.show();
    }
}
