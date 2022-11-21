package Homework_7;

public class HW35 {
    /*
    Write a AreWeInTrouble where it takes 2 strings as a parameter and returns true when 2 strings are equal and
    returns false when they are not equal.
     */
    public static boolean AreEqual (String str1, String str2){
        boolean AreTheyEqual = false;
        if(str1.equals(str2)){
            AreTheyEqual = true;
        }
        return AreTheyEqual;
    }

    public static void main(String[] args) {
        boolean AreTheyEqual = AreEqual("Hello Andy", "Hello Andy");
        System.out.println(AreTheyEqual);

    }
}
