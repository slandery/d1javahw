package com.tts;

import java.util.Scanner;

public class Animals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //ask fav animal
        System.out.println("What is your favorite animal?");
        //make input field
        String animalName = input.nextLine();
        //make some if else statements for a couple of basic animals

/*      below doesnt work because it has incompatible types string cant be converted to boolean.
        if (animalName) {
            animalName = "dog";
            System.out.println("woof, woof!");
        }else{
            System.out.println("I like cats");
        }*/
        //now make list of animals and sounds
        if (animalName.equals("dog")){
            System.out.println("Woof!");
        }else if (animalName.equals("cat")){
            System.out.println("Meow");
        }else if (animalName.equals("bird")){
            System.out.println("tweet, tweet!");
        }else if (animalName.equals("lion")){
            System.out.println("Roaaar!");
        }else{
            System.out.println("Sorry, I dont know what noise that animal makes.");
        }
        //below is going to use printf and %s to recall nextline input.
        //originally was having an error due to using println
        System.out.printf("Thanks for telling me your favorite animal,the %s!\n", animalName);
    }
}

