package Homework_5;

import java.util.Scanner;

public class HW27 {
    public static void main(String[] args) {
        /*
        Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
        ex. "AAAAAVVVCCDDAA" ==> "AVCD"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();
        String nStr = "";
        for (int i = 0; i < str.length(); i++) {
            String check = ""+str.charAt(i);
            if (nStr.contains(check)){
                continue;
            }nStr=nStr+str.charAt(i);

            }
        System.out.println(nStr);
        }
    }

