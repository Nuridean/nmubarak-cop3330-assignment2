package oop.assignment2.ex27.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatingClass {
    public static void validatingInput(String fName, String lName, String emID, int zip) {
        if(validateZip(zip))
        {
            String output = "The zipcode must be a 5 digit number.";
        }
        else
        {

        }
    }


    public static boolean validateZip(int zip){
        boolean correctInput = true;
        if(zip < 10000 || zip > 99999)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int validateName(String name)
    {
        //boolean correctInput = true;
        int stringName = name.length();
        if(stringName < 2)
        {
            return 1;
        }
        if(stringName < 0)
        {
            return 2;
        }
        else
        {
            return 3;
        }
    }
    public static  void validateID(String id)
    {
        //The employee ID must be in the format of AA-1234
        //if(Integer.parseInt(id[0]) && Integer.parseInt(id[1])) {

    }


}
