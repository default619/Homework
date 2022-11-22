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
            if (i==0){
                System.out.println("Enter the "+(i+1)+"st number:");
                int num = scan.nextInt();
                nums.add(num);
            } else if (i==1) {
                System.out.println("Enter the "+(i+1)+"nd number:");
                int num = scan.nextInt();
                nums.add(num);
            } else if (i==2) {
                System.out.println("Enter the "+(i+1)+"rd number:");
                int num = scan.nextInt();
                nums.add(num);
            }else {
                System.out.println("Enter the "+(i+1)+"th number:");
                int num = scan.nextInt();
                nums.add(num);
            }
        }
        return nums;
    }
}


