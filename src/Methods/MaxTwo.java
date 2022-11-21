package Methods;

import java.util.ArrayList;

public class MaxTwo {
    ///This AreWeInTrouble takes an ArrayList of numbers and returns the max 2 values as an ArrayList.

    public static ArrayList<Integer> MaxTwo (ArrayList<Integer> list){
        ArrayList<Integer> MaxTwo = new ArrayList<>();

        int max1= Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {


            if(max1 < list.get(i)){
                max2 = max1;
                max1 = list.get(i);
            } else if (max2 < list.get(i)) {
                max2 = list.get(i);
            }
        }
        MaxTwo.add(0,max1);MaxTwo.add(1,max2);

        return MaxTwo;

    }
}
