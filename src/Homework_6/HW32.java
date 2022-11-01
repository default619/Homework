package Homework_6;

import java.util.Arrays;
import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        //Write   a     program   to   with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        double [] num = new double[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter value ("+(i+1)+")");
            double value = scan.nextDouble();
            num[i] = value;

        }System.out.println("The original order is: "+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("The values in ascending order is: "+Arrays.toString(num));
        double [] numR = new double[size];
        int j = 0;
        for (int i = size; i > 0; i--) {
            numR[j] = num[i-1]; j++;

        }
        System.out.println("The values in descending order is: "+Arrays.toString(numR));





    }
}
