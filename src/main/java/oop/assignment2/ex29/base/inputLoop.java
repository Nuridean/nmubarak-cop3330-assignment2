package oop.assignment2.ex29.base;

public class inputLoop {
    public static void badInputLoop(String input){

        //int years = 0;
        while(true)
        {
            try
            {
                int divisor = Integer.parseInt(input);
                if(divisor == 0)
                    throw new Exception();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        //int years = (int)(72/divisor);
       // System.out.println("It will take "+years+" years to double your initial investment.");
    }
}
