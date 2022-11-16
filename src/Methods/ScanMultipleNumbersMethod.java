package Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class ScanMultipleNumbersMethod {
    public static ArrayList<Integer> ScanMultipleNumbers() {
        ArrayList<Integer> nums = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter the (" + (i + 1) + ") number:");
            int num = scan.nextInt();
            nums.add(num);
        }
        return nums;
    }
}
