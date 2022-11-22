package Homework_6;

import java.util.Arrays;

public class HW29 {
    public static void main(String[] args) {
        //write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int[] num = {90, 34, 23, 87, 45, 36, 98};
        int[] result = new int[num.length]; // not sure how to create an array with a dynamic length (dependent on the amount of numbers needed)
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 || num[i] % 3 == 0) {
                result[j] = num[i]; j++;
            }
        }
        System.out.println("The values that can be divided by 2 and 3 are: " + Arrays.toString(result));
        System.out.println();
        System.out.println("*************************************************************************");
        System.out.println();
        System.out.print("The values that can be divided by 2 and 3 are: "); //another way of getting the same answer.
        int[] num2 = {90, 34, 23, 87, 45, 36, 98};
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] %2 == 0 || num[i] % 3 == 0) {
                System.out.print("("+num[i]+") " );
            }

        }


    }
}

