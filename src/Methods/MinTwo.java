package Methods;

import java.util.ArrayList;

public class MinTwo {
    ///This method takes an ArrayList of numbers and returns the min 2 values as an ArrayList.

    public static ArrayList<Integer> MinTwo (ArrayList<Integer> list){
        ArrayList<Integer> MinTwo = new ArrayList<>();

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if(min1 >= list.get(i)){
                min2 = min1;
                min1 = list.get(i);
            } else if (min2 > list.get(i)) {
                min2 = list.get(i);
            }
        }
        MinTwo.add(0,min1);MinTwo.add(1,min2);


        return MinTwo;

    }
}
