package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader
        Random rand = new Random(); // Create random class

        String[] name = new String[10];
        String nameX;
        boolean flag = true;
        int i = 0;

        while(flag) {
            System.out.printf("Enter a name: ");
            nameX = reader.nextLine();

            if(nameX == "") {  // if blank space turn flag to false to break loop
                flag = false;
                break;
            }

            name[i] = nameX;
            i++; // Also a counter
        }

        int randomNum = (rand.nextInt(i)); // gets random number

        System.out.printf("\nThe winner is... %s. ", name[randomNum]);

    }
}