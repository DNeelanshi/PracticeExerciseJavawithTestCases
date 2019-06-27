package com.stackroute.junitwork;

public class RepeatLastString {


    public  String repeatlastalphabets(String str,int num){


        String s = " ";
        int count = 0;
        String res;
        res = str;
        for (int i = 0; i < num; i++)
        {
            for(int j=str.length()-num;j<str.length();j++)
            {
                res = res+str.charAt(j);
            }
        }

        return res;
    }
}
