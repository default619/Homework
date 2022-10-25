import java.util.Scanner;

public class HW27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = scan.nextLine();
        String nStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == str.charAt(i+1))) {
                nStr =  nStr+str.charAt(i) ;
            } else {continue;
                }


            }
        System.out.println(nStr);
        }
    }
