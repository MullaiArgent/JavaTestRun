package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{

    String name;
    int age;
    int mark;

    Student(String name, int age, int mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    @Override
    public int compareTo(Student object) {
        if(this.mark < object.mark){
            return -1; // not to swap
        }
        return 1; // to swap
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                "}\n";
    }
}
public class ComparatorTestClass {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(6);
        arr.add(7);
        arr.add(6);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sekar", 17, 70));
        students.add(new Student("Rajan", 17, 50));
        students.add(new Student("Kumar", 18, 90));
        students.add(new Student("Sankar", 17, 56));
        students.add(new Student("Lilly", 17, 35));

        Collections.sort(arr);
        Collections.sort(students);

        System.out.println(students);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(3345);
        arr2.add(4349);
        arr2.add(1341);
        arr2.add(6343);
        arr2.add(7342);
        arr2.add(6349);



        Collections.sort(arr2);
        System.out.println(arr2);

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 < o2 % 10) {
                    return -1; // do not to swap
                }else{
                    return 1;  // to swap
                }
            }
        };

        Collections.sort(arr2, (Integer o1, Integer o2) -> (o1 % 10 < o2 % 10) ? -1 : 1);

        System.out.println(arr2);
    }

    public static int[] manualSort(int[] arr){
        int temp;
        for (int i = 0;i< arr.length-1;i++){
            for (int j = i + 1; j < arr.length; j ++){
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
