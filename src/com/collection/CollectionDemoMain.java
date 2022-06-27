package com.collection;

import java.sql.ResultSet;
import java.util.*;

class Test{

}

public class CollectionDemoMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr = new int[]{2,3,4,5};
        System.out.println(arr[1]);

        Collection arr0 = new ArrayList();

        arr0.add(2);
        arr0.add(3);
        arr0.add(4);
        arr0.add("thundfre4");
        arr0.add(2.3);
        arr0.add(new Test());

        for (Object a : arr0){
            System.out.println(a);
        }


        List<Float> arr1 = new ArrayList<>(5);

        arr1.add(new Float(2.0f));
        arr1.add(3.0f); // AutoBoxing
        arr1.add(4f);
        arr1.add(2f);
        arr1.add(3f);
        arr1.add(5f);
        System.out.println(arr1.contains(4f));
        arr1.remove(5f);
        arr1.remove(2);
        // arr1.add("");

        System.out.println(arr1.get(1));



        List<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(1);
        arr2.add(6);
        arr2.add(7);
        arr2.add(6);

        System.out.println(arr2);
        Collections.sort(arr2);

        System.out.println(arr2);
        Collections.reverse(arr2);

        System.out.println(arr2);
        Collections.shuffle(arr2);

        System.out.println(arr2);
    }
}
