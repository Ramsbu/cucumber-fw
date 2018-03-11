package com.sample.cucumber.dtos.sample;

public class Student {
    int id;
    String name;
    void display( int i,String n){
        id=i;
        name=n;
        System.out.println("id is" + i);
        System.out.println("name is "+n);


    }

        public static void main(String[] args) {
        Student s1=new Student();
        Student s2= new Student();
       s1.display(1,"ere");
       s2.display(3,"asa");



    }
    }




