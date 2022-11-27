package Homework_7;

import Methods.PrintBoarderLine;
import Methods.RandomArray;
import Methods.ScanMultipleNumbersMethod;

import java.util.ArrayList;
import java.util.Collections;

public class HW36 {
    /*
    Write a AreWeInTrouble where it takes array of integers and returns the sorted version of that array
     */

    public static ArrayList<Integer> SortedArrayList (ArrayList<Integer> nums){
        Collections.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = RandomArray.randomArray(10);
        System.out.println("The original list: "+nums);
        ArrayList<Integer> SortedList = SortedArrayList(nums);
        PrintBoarderLine.PrintLine(40);
        System.out.println("The sorted list: "+nums);

    }
}
