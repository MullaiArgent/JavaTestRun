package com.oops_two;

public class Encapsule {
    private int age;
    private String name;
    private int salary;
    private String gender;
    private String address;
    // Getters and Setters;
    public int getAge(String password){
        if (password.equals("pass")) {
            System.out.println("Someone is getting the Age");
            return this.age;
        }else{
            System.out.println("Password is Wrong");
            return 0;
        }
    }
    public void setAge(int newAge, String password){
        if (password.equals("pass")) {
            System.out.println("the age is being manupulated from " + this.age + " to " + newAge);
            this.age = newAge;
        }else{
            System.out.println("password is wrong, so the data remains same");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Encapsule(int age, String name, int salary, String gender, String address) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
    }

    public Encapsule(String name, int salary, String gender, String address) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
    }

    public Encapsule() {
    }

    @Override
    public String toString() {
        return "Encapsule{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
class MainFour{
    public static void main(String[] args) {
        Encapsule encapsule = new Encapsule(20,"Roger",2000, "m", "World");
        System.out.println(encapsule);
        /*
        System.out.println(encapsule.salary); // Getting
        encapsule.salary = 2300; // Setting
        */

        System.out.println(encapsule.getAge("pass"));
        encapsule.setAge(22, "pass");
        System.out.println();

        System.out.println(encapsule);
    }
}
