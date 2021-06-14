/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */
package oop.assignment2.ex31.base;

import oop.assignment2.ex24.base.Detector;

import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static int heartRate;
    private static int age;
    public static void main(String[] args){

        readUserInput();
        KarvonenCalc application = new KarvonenCalc();
        String calculation = application.calculation(age, heartRate);


    }


    private static void readUserInput(){

        while(true) {
            try{
                System.out.print("What is your age?");
                age =  Integer.parseInt(in.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        while(true) {
            try{
                System.out.print("What is your resting heart rate?");
                heartRate =  Integer.parseInt(in.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

    }
}
