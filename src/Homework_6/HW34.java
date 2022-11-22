package Homework_6;

import java.util.ArrayList;
import java.util.Arrays;

public class HW34 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        int [] arr = {2,3,4,5,6,7,8,9};
        int x = arr[0];
        int [] sArr = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            sArr[i] = arr[i+1];
        }
        sArr[arr.length-1] = x;
        System.out.println("The original array is: "+Arrays.toString(arr));
        System.out.println("The shifted array is: "+Arrays.toString(sArr));



    }
}
