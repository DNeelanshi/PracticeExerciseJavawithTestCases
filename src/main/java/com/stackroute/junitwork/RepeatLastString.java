package com.stackroute.junitwork;

public class RepeatLastString {


    public  String repeatlastalphabets(String str,int num){

// Using loop to generate the string with repeating alphabets nth times.

        String s = " ";
        int count = 0;
        String res;
        res = str;
        if(num<0){
            return null;
        }
        for (int i = 0; i < num; i++)
        {
            for(int j=str.length()-num;j<str.length();j++)
            {
                //storing each value in res parameter chracter wise
                res = res+str.charAt(j);

            }
        }

        return res;
    }
}
