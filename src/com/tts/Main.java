package com.tts;

//instance variables, fields declared without static keyword
//class variables, tells compiler that there is exactly one copy in existence
//local variable, there is no special keyword the variable is only accessible to methods they are declared in.
//parameters ie, public static void main(String[] args) these are variables not fields
//Primitive data types byte, short, int, long, float, double, boolean, char, String

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //below will try out \n and % as well as println and printf
        //System.out.printf("Hello World!\n");
        //System.out.printf("Today is awesome!\n");
        System.out.println("What is your name?");
        //below nextLine is a method that reads the input as a String
        String firstName = input.nextLine();
        //printf will allow us to say hello to whatever variable input firstName is
        System.out.printf("Hello %s!\n", firstName);
        //%s formats strings
        //%d formats decimal integers
        //%f formats floating-point numbers
        //%t formats date/time values
        System.out.printf("Lets learn some java %s!\n", firstName);

        //below is % modulus ; true
        System.out.print(15 % 6 == 3);
        //the remainder of the division of 15 by 6 is 3

    }
}

