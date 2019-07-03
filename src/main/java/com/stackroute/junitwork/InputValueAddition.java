package com.stackroute.junitwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValueAddition {

    public int addnumber (int arr []){
        int sum =0;


        try{

            //Taking the values in array and addition of all numbers

            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }
            return(sum);

        }catch( InputMismatchException e){

            //Exceotion to check input mismatch

            return(0);
        }catch (NullPointerException e){
            return (0);
        }


    }

}
