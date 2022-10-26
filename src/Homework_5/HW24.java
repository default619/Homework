package Homework_5;

import java.util.Scanner;

public class HW24 {
    public static void main(String[] args) {
        /*
            Write a code where user is being asked to enter a String and that checks if the String is Palindrome
            PS. A palindrome is a sentence, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
            (Java, or Ziya or Cat are not palindrome)
            (This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)
             */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a word or sentence to check if it's a palindrome:) ");
        String str="Hello";
        String rStr ="";
        for (int i = 0; i <str.length() ; i++) {
            rStr=str.charAt(2) + rStr;
        }
        System.out.println(rStr);
        /* if (str.equals(rStr)){
            System.out.println(str+" is a palindrome.");
        }
        else {
            System.out.println(str+" isn't a palindrome.");
        } */
    }
}
