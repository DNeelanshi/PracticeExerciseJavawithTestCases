package com.stackroute.junitwork;


public class SortingNumber {


    public String sum(int num) {
        int sum = 0;
        int count = 0;
        int temp = num;

// Calculating the length of number
        while (num > 0) {
            num = num / 10;
            count++;
        }
        int arr[] = new int[count];

// put the number into array
        for (int i = 0; i < count; i++) {
            if (temp % 10 > 0) {
                arr[i] = temp % 10;
                temp = temp / 10;

            }
        }
// reverse the number
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
// adding even number values.
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]);
            if ((arr[i]) % 2 == 0)
                sum = sum + arr[i];
        }

//checking if sum is greater or smaller than 15
        if (sum > 15) {
           return ("True");
        } else {
            return ("False");

    }

}
}
