import java.util.Scanner;

public class HW27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();
        String nStr = "";
        for (int i = 0; i < str.length(); i++) {
            String check = ""+str.charAt(i);
            if (nStr.contains(check)){
                continue;
            }nStr=nStr+str.charAt(i);

            }
        System.out.println(nStr);
        }
    }

