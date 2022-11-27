package Methods;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {

    public static ArrayList<Integer> randomArray(int n) {
        ArrayList<Integer> randomArray = new ArrayList<>(n);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            Integer r = rand.nextInt(-10, 101);
            randomArray.add(r);
        }
        return randomArray;
    }
    public static Integer[] convertToIntegerArray(ArrayList<Integer> ArrayList) {

        Integer[] IntegerArray = new Integer[ArrayList.size()];
        IntegerArray = ArrayList.toArray(IntegerArray);
        return IntegerArray;
    }
    public static int[] convertToIntArray(ArrayList<Integer> ArrayList) {
        Integer[] IntegerArray = new Integer[ArrayList.size()];
        IntegerArray = ArrayList.toArray(IntegerArray);
        int[] intArray = new int[ArrayList.size()];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = IntegerArray[i];
        }
        return intArray;
    }
}




