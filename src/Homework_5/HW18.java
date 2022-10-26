package Homework_5;

import java.util.Scanner;

public class HW18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an whole number: "); //5*4*3*2*1
        int num = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result*i; // 2 --> 6 --> 24 --> 120


        }
        System.out.println(result);
    }
}
