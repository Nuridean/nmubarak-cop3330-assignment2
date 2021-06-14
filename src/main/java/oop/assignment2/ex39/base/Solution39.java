/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nuridean Mubarak
 */

package oop.assignment2.ex39.base;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class Solution39 {

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> empONEID = new LinkedHashMap<>();
        empONEID.put(1, " John, Johnson");
        empONEID.put(2, " Manager");
        empONEID.put(3, " Separation Date:2016-12-31");

        LinkedHashMap<Integer, String> empTWOID = new LinkedHashMap<>();
        empTWOID.put(1, " Tou, Xiong");
        empTWOID.put(2, " Software Engineer");
        empTWOID.put(3, " Separation Date:2016-10-05");

        LinkedHashMap<Integer, String> empTHREEID = new LinkedHashMap<>();
        empTHREEID.put(1, " Michaela, Michaelson");
        empTHREEID.put(2, " District Manager");
        empTHREEID.put(3, " Separation Date:2015-12-19");

        LinkedHashMap<Integer, String> empFOURID = new LinkedHashMap<>();
        empFOURID.put(1, "Jake, Jacobson");
        empFOURID.put(2, " Programmer");
        empFOURID.put(3, " Separation Date:----");

        LinkedHashMap<Integer, String> empFIVEID = new LinkedHashMap<>();
        empFIVEID.put(1, " Jackson, Jacquelyn");
        empFIVEID.put(2, " DBA");
        empFIVEID.put(3, " Separation Date:----");

        LinkedHashMap<Integer, String> empSIXID = new LinkedHashMap<>();
        empSIXID.put(1, " Sally, Webber");
        empSIXID.put(2, " Web Developer");
        empSIXID.put(3, " Separation Date:2015-12-18");


        System.out.println(empONEID);
        System.out.println(empTWOID);
        System.out.println(empTHREEID);
        System.out.println(empFOURID);
        System.out.println(empFIVEID);
        System.out.println(empSIXID);



    }

}
