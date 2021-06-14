package oop.assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentCalculator {
    public static void calculateMonthsUntilPaidOff(double balance, double APR, double mpayment) {
       /* double month = 0;
        double aprCalc = APR / 365;
        double x = (1 + balance/mpayment * (1 - (1 + aprCalc)));
        double xDouble = Math.pow(x, 30);
        double xLog = Math.log(xDouble);
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)

        double n = -(1/30) * xLog/Math.log(1 + aprCalc);
        System.out.print(n);

        */

        //double n = -(1/30) * (Math.log((1) + (balance/mpayment) * (1 - Math.pow((1 + aprCalc), 30)))) / Math.log(1 + aprCalc);
        //smonth = n;

        //return month;

    }
}
