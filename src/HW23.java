import java.util.Scanner;

public class HW23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();
        char search = 'a';
        char search2 ='A';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==search || str.charAt(i)==search2){count++;}
        }
        System.out.println("The sentence ("+str+") contains the letter 'A' and 'a' "+count+" times.");

    }
}
