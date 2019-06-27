package com.stackroute.junitwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValueAddition {

    public int addnumber (int arr []){
   int sum =0;

        try{

            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }
            return(sum);

           }catch( InputMismatchException e){

            return(0);
        }


    }

}
