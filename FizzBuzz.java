package com.example.demo;

public class FizzBuzz {

    public static void main(String[] args) {
        testFizzBuzz();
    }

    public static void fizzBuzz(int total) {
        for (int i = 0; i <= total; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    static void testFizzBuzz() {
        fizzBuzz(50);
    }

}
