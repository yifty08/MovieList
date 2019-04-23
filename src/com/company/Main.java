package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        String answer = "";

//        do {
//            System.out.print("Enter your favorite movie: ");
//            String movieName = scanner.nextLine();
//            System.out.println("Your fav movie is " + movieName);
//            System.out.println("Enter another movie? (enter \"q\" to quit.)");
//            answer = scanner.nextLine();
//        } while(!answer.equalsIgnoreCase("q"));

        System.out.print("Would you like to share your favorite movie with the world? ");
        answer = scanner.nextLine();

        while (!(answer.equalsIgnoreCase("q") || answer.equalsIgnoreCase("no"))) {

            System.out.print("Enter your favorite movie: ");
//            Movie movie = new Movie();
//            movie.setMovie(scanner.nextLine());
            String movieName = scanner.nextLine();
            movies.add(movieName);

            System.out.println("Your fav movie is " + '\"' + movieName + '\"' + ".");
            System.out.print("Enter another movie? ");
            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("q") || answer.equalsIgnoreCase("no")) {
                Collections.sort(movies);
                for ( String movie : movies) {
                    System.out.println(movie);
                }

            }
        }


    }
}
