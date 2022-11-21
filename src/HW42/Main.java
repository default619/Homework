package HW42;
import Methods.PrintBoarderLine;
public class Main {
    //Write a method where it takes a String and returns to a String by adding "Not" in front of
    // the String only if It does not have "Not" in front of it already.
    // For example :
    // notString("Car" ) == > "Not Car"
    // notString("Home"). ==> "Not Home"
    // notString("Not Home") == > "Not Home"
    public static String Not (String param1){
        String result = "";
        if (param1.startsWith("Not") || param1.startsWith("not")){
            result = param1;
        }else if (!param1.startsWith("Not") || !param1.startsWith("not")) {
            result = result.join("","Not ",param1);
        }
        return result;
    }
    public static void main(String[] args) {
        String word = "hello";
        String result = Not(word);
        System.out.println("The word entered is: "+word);
        PrintBoarderLine.PrintLine(25);
        System.out.println("Result: "+result);
    }
}
