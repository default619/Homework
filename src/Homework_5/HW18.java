package Homework_5;

import java.util.Scanner;

public class HW18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num1 = scan.nextInt();
        int result;
        //int fResult;
        int count =1;
        while(count <= num1){result=count*num1;  int fResult=result*count;
            System.out.println("The factorial of "+num1+" is: "+fResult);count++;}


    }
}
