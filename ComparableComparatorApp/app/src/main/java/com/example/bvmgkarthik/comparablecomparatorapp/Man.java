package com.example.bvmgkarthik.comparablecomparatorapp;

import java.util.Comparator;

/**
 * Created by bvmgkarthik on 14/10/15.
 */
public class Man implements Comparable<Man> {


    int age;
    String name;
    String address;

    Man(int ag,String nam,String addres ){
        age = ag;
        name = nam;
        address = addres;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Man man) {
        return (this.age - man.age);
    }

    public static Comparator<Man> ageCompar = new Comparator<Man>() {
        @Override
        public int compare(Man man1, Man man2) {
            return man1.getAge()-man2.getAge();
        }
    };

    public static Comparator<Man> nameCompar = new Comparator<Man>() {
        @Override
        public int compare(Man man1, Man man2) {
            return man1.getName().compareTo(man2.getName());
        }
    };

    public  static Comparator<Man> addressCompar = new Comparator<Man>() {
        @Override
        public int compare(Man man1, Man man2) {
            return man1.getAddress().compareTo(man2.getAddress());
        }
    };
}
