package HW40;

public class Main {

    //Write a AreWeInTrouble that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
    // and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends.

    public static void main(String[] args) {
        String decider = SleepDecider.SleepDecider(-1);
        System.out.println(decider);

    }
}
