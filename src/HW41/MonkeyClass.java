package HW41;

import Methods.PrintBoarderLine;

import java.util.Random;

public class  MonkeyClass {

    boolean IsSmiling;
    String name;

    public static void AreWeInTrouble(){

        MonkeyClass monA = new MonkeyClass();
        monA.name = "Monkey A";
        MonkeyClass monB = new MonkeyClass();
        monB.name = "Monkey B";
        Random random = new Random();
        monA.IsSmiling = random.nextBoolean();
        System.out.println("Is "+monA.name+" smiling? "+monA.IsSmiling);
        monB.IsSmiling = random.nextBoolean();
        System.out.println("Is "+monB.name+" smiling? "+monB.IsSmiling);
        PrintBoarderLine.PrintLine(25);
        if (!monA.IsSmiling && !monB.IsSmiling || monA.IsSmiling && monB.IsSmiling){
            System.out.println("We're in trouble!");
        }else {
            System.out.println("We're fine!");
        }
    }
}
