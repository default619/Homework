package Methods;

import java.util.ArrayList;

public class Max2Min2{

    //This AreWeInTrouble takes two ArrayLists and finds the max 2 different values of the first array and finds the min 2
    //different values in the second array. It returns to an ArrayList with the first 2 values being the max and the
    //second 2 values being the min values.

    public static ArrayList<Integer> Max2Min2 (ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        ArrayList<Integer> Max2 = MaxTwo.MaxTwo(arr1);
        ArrayList<Integer> Min2 = MinTwo.MinTwo(arr2);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0,Max2.get(0));
        result.add(1,Max2.get(1));
        result.add(2,Min2.get(0));
        result.add(3,Min2.get(1));
        return result;

}
}


