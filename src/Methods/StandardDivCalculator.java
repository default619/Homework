package Methods;

import java.util.ArrayList;

public class StandardDivCalculator {

    //write a code that will calculate the standard deviation of the given array
    //standard deviation = sqrt(sum of (each element - mean)^2 / (n-1))
    //mean = sum of all elements / n


    public static int StandardDeviation(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int average = sum / list.size();
        int sumOfSquares = 0;
        for (int i = 0; i < list.size(); i++) {
            sumOfSquares += Math.pow(list.get(i) - average, 2);
        }
        int variance = sumOfSquares / list.size();
        int standardDeviation = (int) Math.sqrt(variance);
        return standardDeviation;
    }

}
