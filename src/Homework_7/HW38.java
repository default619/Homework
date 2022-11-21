package Homework_7;

import Methods.*;

import java.util.ArrayList;

public class HW38 {
    /*
    Write a AreWeInTrouble where it takes 2 integer arrays as parameters, and returns to an integer array where it
    includes 2 highest different values in the first array and 2 lowest different values in the second array.
     */

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = RandomArray.randomArray(10);
        ArrayList<Integer> arr2 = RandomArray.randomArray(10);
        ArrayList<Integer> result = Max2Min2.Max2Min2(arr1,arr2);
        System.out.println(arr1);
        PrintBoarderLine.PrintLine(30);
        System.out.println(arr2);
        PrintBoarderLine.PrintLine(30);
        System.out.println("The first (2) numbers are the max and the second (2) numbers are the min: "+result);

    }
}
