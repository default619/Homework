package Homework_5;

import java.util.Scanner;

import static Homework_5.FactorialMethod.Factorial;

public class HW18 {

    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter an integer number:
        Using the given number find the factorial of that number and Print the result.
        example: 5 ==> 5! = 5*4*3*2*1 = 120
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num = scan.nextInt();
        int result = Factorial(num);
        System.out.println("The factorial of "+num+" is "+result);
    }

}
