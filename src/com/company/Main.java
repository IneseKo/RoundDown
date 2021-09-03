package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //System.out.println("please enter number with comma");
        //double number = input.nextDouble();
        //double digit = number;
        //System.out.println("Number:" + digit);


        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value in grams");
        double grams = input.nextDouble();
        System.out.println(grams/1000 + "kg");

    }

}
