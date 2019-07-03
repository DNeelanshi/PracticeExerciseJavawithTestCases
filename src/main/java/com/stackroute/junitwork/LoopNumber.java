package com.stackroute.junitwork;

import java.util.InputMismatchException;

public class LoopNumber {
    String store="";

    public  String  getpattern(int number) {

        //Generating the pattern to repeat every number the number value times

        try {
            if(number == 0){

                store = "0";
            }else{

                for (int i = 1; i <= number; i++) {
                    for (int j = 1; j <= i; j++) {
                        store =  store+""+i;
                    }
                }
            }
            if(store.length() >=1){
                return store;
            }else{
                return null;
            }


        } catch (InputMismatchException e) {
            // for values other than numbers
            return ("Please enter valid input");
        }
    }

}
