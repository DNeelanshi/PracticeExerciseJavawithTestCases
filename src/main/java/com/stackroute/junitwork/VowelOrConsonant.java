package com.stackroute.junitwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelOrConsonant {


    public  String countVowelconsonant(String str) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*"); //regex pattern to check if string has any special character or not
        Matcher matcher = pattern.matcher(str);
        var check = str.matches(".*\\d.*"); //regex pattern to check if string has any digit or not

        if ((check == true) || (!matcher.matches())) {

            return("Error : Please enter only alphabets"); //error message

        } else {

            String summ = " ";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                        || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    summ = summ + "vowel,";
                } else {
                    summ = summ + "consonant,";
                }
            }

            return summ;
        }

    }
}