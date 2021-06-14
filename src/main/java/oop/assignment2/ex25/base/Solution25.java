/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */

package oop.assignment2.ex25.base;

import java.util.Scanner;

public class Solution25 {
    private static String input;
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        promptUserInput();
        passwordDetector application = new passwordDetector();
        application.passwordValidator(input);

    }

    private static void promptUserInput() {
        System.out.print("Enter your password: ");
         input = in.nextLine();
    }
}


