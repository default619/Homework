package Homework_6;



public class HW27 {
//    Write a code which asks user to enter a String and removes all the duplicate characters from
//    the String and prints the result
//    ex. "AAAAAVVVCCDDAA" ==> "AVCD"

    public static void main(String[] args){
        String str = "AAAAAVVVCCDDAA";
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)){
                result += str.charAt(i);
            }

        }
        System.out.println(result);

    }

}
