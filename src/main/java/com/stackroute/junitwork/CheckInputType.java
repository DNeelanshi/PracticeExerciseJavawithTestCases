package com.stackroute.junitwork;

public class CheckInputType {

    public  String charCheck(char input_char){

        // CHECKING FOR ALPHABET

        if (input_char >= 65 && input_char <= 90){
            return ("It is capital letter Alphabet");
        }else if(input_char >= 97 && input_char <= 122){
            return("It is small letter Alphabet");
        }
        // CHECKING FOR DIGITS

        else if (input_char >= 48 && input_char <= 57)
            return("It is Number");

            // OTHERWISE SPECIAL CHARACTER
        else
            return ("IT is Special Character");
    }

}
