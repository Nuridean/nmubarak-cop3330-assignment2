package oop.practice.ex23.base;

import java.util.Scanner;

public class solution24 {
    private static final Scanner in = new Scanner(System.in);
    public static String word1;
    public static String word2;

    public static void main(String[] args){

        readUserInput();
        //read in two strings
        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, "word2");

        String output = generateOutput(result);

        System.out.println(output);
    }

    public static void readUserInput(){
        System.out.print("Enter word one");
        word1 = in.next();

        System.out.print("Enter word two");
        word2 = in.next();
    }

    public static String generateOutput(boolean isAnagram) {
        if(isAnagram){
            return  "is anagram";
        }
        else {
            return  "is NOT anagram";
        }
    }
}
