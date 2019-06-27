package com.stackroute.junitwork;

import java.util.InputMismatchException;

public class LoopNumber {
    String store="";
        public  String  getpattern(int number) {

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

                return store;

            } catch (InputMismatchException e) {
                return ("Please enter valid input");
            }
        }

}
