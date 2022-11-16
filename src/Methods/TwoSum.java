package Methods;

import java.util.ArrayList;
import java.util.Scanner;
import static Methods.ScanMultipleNumbersMethod.ScanMultipleNumbers;

public class TwoSum {
    public static ArrayList<Integer> TwoSum(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> result = new ArrayList();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
        }

    }
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = ScanMultipleNumbers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target number:");
        int target = scan.nextInt();
        ArrayList<Integer> result = TwoSum(nums,target);
        System.out.println(nums);
        System.out.println("The numbers at locations "+result+" add up to "+target);
    }
}


