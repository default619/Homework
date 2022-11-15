package Homework_6;

public class HW28 {
    public static void main(String[] args) {
        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int sum = test.SumTwo(5,5);
        System.out.println(sum);


        int [] num = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]<min) {min = num[i];
            }
        }
        System.out.println("The smallest number is: "+min);
    }
}
