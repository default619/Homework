package Homework_6;

import java.util.ArrayList;

public class HW34 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        Integer [] arr = {2,3,4,5,6,7,8,9};
        ArrayList<Integer> sArr = new ArrayList();
        for (int i = 1; i < arr.length; i++) {
            sArr.add(arr[i]);
        }sArr.add(arr.length-1,arr[0]);
        System.out.println(sArr);



    }
}
