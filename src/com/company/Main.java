package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        String anwser = "";

//        do {
//            System.out.print("Enter your favorite movie: ");
//            String movieName = scanner.nextLine();
//            System.out.println("Your fav movie is " + movieName);
//            System.out.println("Enter another movie? (enter \"q\" to quit.)");
//            anwser = scanner.nextLine();
//        } while(!anwser.equalsIgnoreCase("q"));

        System.out.print("Would you like to share your favorite movie with the world? ");
        anwser = scanner.nextLine();

        while (!(anwser.equalsIgnoreCase("q") || anwser.equalsIgnoreCase("no"))) {

            System.out.print("Enter your favorite movie: ");
            String movieName = scanner.nextLine();
            System.out.println("Your fav movie is " + '\"' + movieName + '\"' + ".");
            System.out.print("Enter another movie?");
            anwser = scanner.nextLine();

        }
    }
}
