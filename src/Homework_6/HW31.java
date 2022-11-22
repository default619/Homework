package Homework_6;

import Methods.ScanMultipleNumbersMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class HW31 {
    //Write   a   program   that   creates   an   array   of   10   elements   size.
    // Your   program   should   prompt   the   user   to   input   numbers   in
    // array   and   then   display   the   sum   of   all
    //array   elements. ( we already did this in the class but try to do it again)


    public static void main(String[] args) {
        ArrayList<Integer> nums = ScanMultipleNumbersMethod.ScanMultipleNumbers();
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum +=nums.get(i);
        }
        System.out.println("The entered list is: "+nums);
        System.out.println("The result of the summation of the list is: "+sum);

    }
}
