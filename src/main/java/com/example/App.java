package com.example;

public class App {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Number must not be negative");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        App obj = new App();

        int number = 5;

        System.out.println("Number: " + number);
        System.out.println("Factorial: " + obj.factorial(number));
    }
}