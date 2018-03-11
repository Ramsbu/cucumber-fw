package com.sample.cucumber.dtos.sample;

public class SampleTest {

/*    public static void main(String[] args) {
        Rbi icici = new Icici();
        icici.homeLoans();

    }*/


    public SampleTest() {
        System.out.println("Default constructor is called");
    }

    public SampleTest(String temp) {
        System.out.println("Parameterized constructor is called " + temp);
    }

    public static void main(String[] args) {
        SampleTest sampleTest = new SampleTest("Abhilash");
        System.out.println(sampleTest.square(10));
    }


    public int square(int i) {
        return i * i;

    }

    public int square(int i, int z) {
        return i * i;

    }
}
