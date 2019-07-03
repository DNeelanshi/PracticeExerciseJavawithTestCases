package com.stackroute.junitwork;

public class ReverseString {

    public String getReverse(String str){

        //Reverse the string using the loop

        try{
            String reverse = "";


            for(int i = str.length() - 1; i >= 0; i--){
                reverse = reverse + str.charAt(i);
            }

            return ("Reversed string is:"+reverse);   //result is reversed string

        }catch (NullPointerException e){
            return null;
        }


    }
}




