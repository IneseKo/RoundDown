package com.company;

import java.util.Scanner;
import java.util.Random;

public class RoundDown {

    public static void method2(String[] args) {
        //named this method2 for it not to run, while doing a new task - making a program for converting g to kg
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number with comma");
        double number = input.nextDouble();
        double digit = number;
        System.out.println("Number:" + digit);
    }

    public static void method3(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value in grams");
        double grams = input.nextDouble();
        System.out.println("the value in kilograms is: " + grams / 1000 + " kg");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a random number");
        int a = input.nextInt();
        Random digits = new Random();
        int number = digits.nextInt (a);
        System.out.println("a random number from 0 to " + a + " is " + number);

    }


}