package com.stackroute.junitwork;

import java.util.InputMismatchException;

public class CheckOddOrEvenNUmber {

    public String checkoddeven(int num) {
        try {

            if (num > 0) {
                //checking for odd/even

                if (num % 2 == 0) {
                    //checking for range 20-30

                    if ((num > 20) && (num < 30)) {
                        return ("Jerry");
                    } else {
                        return ("Number is even but doesn't lie between 20-30");
                    }
                } else {
                    //checking for range 20-30

                    if ((num > 20) && (num < 30)) {
                        return ("Tom");
                    } else {
                        return ("Number is odd but doesn't lie between 20-30");
                    }
                }
            } else {
                return ("Please enter number greater than zero");
            }

        } catch (InputMismatchException e) {
            return ("Please enter valid number");
        }

    }
}
