package com.stackroute.junitwork;

public class ReverseString {

    public String getReverse(String str){

        String reverse = "";


        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        return ("Reversed string is:"+reverse);

    }
    }




