/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */

package oop.assignment2.ex29.base;

import java.util.Scanner;

public class Solution29 {
    private static final Scanner in = new Scanner(System.in);
    private static String input;

    public static void main(String[] args){
        promptUserInput();
        inputLoop application = new inputLoop();
        application.badInputLoop(input);
    }



    public static void promptUserInput() {
        input = readUserString("What is the rate of return?: ");
    }

    public static String readUserString(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
}
