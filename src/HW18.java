import java.util.Scanner;

public class HW18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int num1 = scan.nextInt();
        int count = 1;
        int result = 0;
        while (count<=num1){
              result=num1*count+result;count++; // 5*1=5  2*5=10 3*5=15 4*5=20
        }
        System.out.println("The factorial of "+num1+" is "+result);

    }
}
