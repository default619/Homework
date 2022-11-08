package Homework_6;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a word, find home many 3 character palindrome substrings are
        // in the given Word and print each one of them ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD"
        // there are 6 Palindrome three Char substring)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a single word, and ill tell you how many 3 character palindromes are in your word.");
        String word = scan.nextLine();
        int count = 0;
        for (int i = 0; i < word.length()-2; i++) {
            String sub = word.substring(i,i+3);
            String reverse = "";
            for (int j = sub.length()-1; j >= 0; j--) {
                reverse = reverse + sub.charAt(j);
            }
            if (sub.equals(reverse)){
                count++;
                System.out.println("The 3 character sub-word ("+sub+") is a palindrome.");

            }
        }System.out.println("The word ("+word+") contains "+count+" palindromes.");

























    }
}
