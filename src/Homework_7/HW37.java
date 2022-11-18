package Homework_7;

public class HW37 {

    //write a method where it takes 2 double values and 1 integer value.  When the integer value is 1 it
    // returns to sum of the 2 double numbers, when integer is 2 it returns the subtraction of those 2 double
    // number, when integer value is 3 it returns to the multiplication of those 2 double numbers, and when the
    // integer value is 4 it returns the division of those 2 double numbers



    public static double test1(double a, double b, int c){
        double result = 0;
        switch (c){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(test1(5,6,1));
        System.out.println(test1(5,6,2));
        System.out.println(test1(5,6,3));
        System.out.println(test1(5,6,4));
    }
}
