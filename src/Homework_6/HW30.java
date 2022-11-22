package Homework_6;

public class HW30 {
    //Write a code string array with the following strings:
    //"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday" and "Saturday".
    //Write a loop that displays the contents of each element
    //in the array that you declared.

    public static void main(String[] args) {

        String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}
