package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Show 20 numbers is prime: ");

        int count = 0;
        for (int number = 2; count < 20; number++) {
            if (number == 2) {
                System.out.println(number);
                count++;
            } else {
                boolean isPrime = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number);
                    count++;
                }
            }
        }
    }
}
