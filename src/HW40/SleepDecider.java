package HW40;

public class SleepDecider {
    public static String SleepDecider (int day){

        String result = "";

        if(day >0 && day <= 5){
            result = "Go to work!";
        }else if (day > 5 && day <= 7) {
            result = "Go back to sleep :)";
        }else {
            result = "Invalid input!";
            result = result.toUpperCase();
        }
        return result;

    }

}
