package Homework_7;

import java.util.Scanner;

public class HW37 {

    //write a method where it takes 2 double values and 1 integer value.  When the integer value is 1 it
    // returns to sum of the 2 double numbers, when integer is 2 it returns the subtraction of those 2 double
    // number, when integer value is 3 it returns to the multiplication of those 2 double numbers, and when the
    // integer value is 4 it returns the division of those 2 double numbers



    public static double SimpleCalculator(double a, double b, int c){
        double result = 0;
        switch (c){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: ");
        int c = scan.nextInt();
        System.out.println("The result is: "+SimpleCalculator(a,b,c));

    }
}
