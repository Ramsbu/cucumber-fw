package com.sample.cucumber.dtos.sample;

public class Student1 {
    int id;
    String name;
    Student1(int i,String s){
        id=i;
        name=s;
        System.out.println(i+"" + s);

    }

    public static void main(String[] args) {
        Student1 stu=new Student1(1,"ram");


    }

    }
