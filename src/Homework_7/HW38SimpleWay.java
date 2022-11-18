package Homework_7;

import Methods.PrintBoarderLine;
import Methods.RandomArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class HW38SimpleWay {
    public static int [] MaxMinArray(ArrayList<Integer> arr1, ArrayList<Integer> arr2){

        Collections.sort(arr1);
        Collections.sort(arr2);

        int max1 = arr1.get(arr1.size()-1);
        int max2 = arr1.get(arr1.size()-2);
        int min1 = arr2.get(0);
        int min2 = arr2.get(1);

        int [] result = {max1,max2,min1,min2};

        return result;

    }
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = RandomArray.randomArray(10);
        ArrayList<Integer> arr2 = RandomArray.randomArray(10);
        System.out.println(arr1);
        PrintBoarderLine.PrintLine(30);
        System.out.println(arr2);
        int [] result = MaxMinArray(arr1,arr2);
        PrintBoarderLine.PrintLine(30);
        System.out.println("The first (2) numbers are the max and the second (2) numbers are the min: "+Arrays.toString(result));





    }
}
