package Methods;

public class PrintBoarderLine {
    public static void PrintLine(int length){
        int count = 0;
        while(count <= length){
            System.out.print("-");
            count++;
        }
        System.out.println();
    }
}
