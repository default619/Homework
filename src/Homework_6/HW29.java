package Homework_6;

import java.util.ArrayList;
import java.util.Arrays;

public class HW29 {
    public static void main(String[] args) {
//        write a code with following requirements
//        - define an array with following values {90,34,23,87,45,36,98}
//        - Print the values that can be divided by 2 or 3


       int[] num = {90, 34, 23, 87, 45, 36, 98};
       ArrayList<Integer> result = new ArrayList<>();
       for (int i = 0; i < num.length; i++) {
           if (num[i] % 2 == 0 || num[i] % 3 == 0) {
               result.add(num[i]);
           }
        }
        System.out.println("The numbers divisible by 2 are 3 are: "+result);
    }
}

