/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */
 package oop.assignment2.ex24.base;

import java.util.Scanner;



public class Solution24 {
    private static final Scanner in = new Scanner(System.in);
    public static String input1;
     public static String input2;

    public static void main(String[] args) {
        promptUserInput();

        Detector application = new Detector();
        boolean result = application.isAnagram(input1,input2);

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void promptUserInput() {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\n");
         input1 = readUserString("Enter the first string: ");
         input2 = readUserString("Enter the second string: ");
    }


    public static String readUserString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public static String generateOutput(boolean isAnagram) {
        if(isAnagram) {
            return "Is anagram";
        } else {
            return "is not anagram";
        }
    }

}

