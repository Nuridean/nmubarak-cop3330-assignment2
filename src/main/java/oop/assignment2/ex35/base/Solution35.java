/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */
package oop.assignment2.ex35.base;

import java.lang.reflect.Array;
import java.util.Scanner;


public class Solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        in.useDelimiter("\n");
        int i;

        System.out.print("Enter the number of players.");
        int amount = in.nextInt();
        String[] array = new String[amount];

        for(i = 0; i < amount; i++){
            System.out.print("Enter a name ");
            while(!in.hasNextLine())
            {
                in.next();
                System.out.println("Enter a valid input");
            }
            array[i] = in.nextLine();


        }
    }
}
