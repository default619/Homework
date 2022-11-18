package Methods;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
    public static ArrayList<Integer> randomArray (int n){
        ArrayList<Integer> randomArray = new ArrayList<Integer>(n);
        Random rand = new Random();
        for (int i=0; i<n; i++)
        {
            Integer r = rand.nextInt(-999,999);
            randomArray.add(r);
        }
    return randomArray;
    }
}




