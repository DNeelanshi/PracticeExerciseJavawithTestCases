package com.stackroute.junitwork;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessNumber {


    public static String matchnumbers(int user_num){

        int res=0;
        int flag = 0;

        try{

            int randomnumber = 34;

            if(user_num == randomnumber){
                flag = 1;
                return("Number guessed matches the original number");     // user number matches the random number
            }else if(user_num < randomnumber){
                flag = 0;
                return("Number guessed is less than original number");         // user number is smaller than random number
            }else{
                flag = 2;
                return("Number guessed is greater than original number");        // user number is greater than random nunmber
            }

        }catch (InputMismatchException e){
            return(e+" Please enter valid number");
        }

    }
}
