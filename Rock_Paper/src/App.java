import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //////////////////////////////////////////
        String bootAns = "";
        String playerAns = "";
        int playerScore = 0;
        int bootScore = 0;
        int gameDone = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add("R");
        list.add("P");
        list.add("S");
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            /////////////////////////////////////////////
            System.out.println("Welcome to rock paper Scissors game");
            System.out.println("""
                    you will play aginst a boot for 3 times, win at least 2 times to win the matche
                    you need to write one of the follwoing in the same formate
                    (R) for Rock
                    (P) for Paper
                    (S) for Scissors
                    ready?? (Y/N)
                    """);
            bootAns = input.next();
            if (bootAns.equals("Y")) {
                System.out.println("===============================================================");
                while (gameDone < 4) {
                    System.out.println("""
                            Choose one of theese:
                            R- Rock
                            P- Paper
                            S- Scissors""");
                    playerAns = input.next();
                    bootAns = list.get(random.nextInt(3));

                    if (playerAns.equals(bootAns)) {
                        System.out.println("Youre choise: " + playerAns);
                        System.out.println("Boot choise: " + bootAns);
                        System.out.println("It's a tie!");
                        System.out.println("===============================================================");
                    } else if ((playerAns.equals("R") && bootAns.equals("S"))
                            || (playerAns.equals("P") && bootAns.equals("R"))
                            || (playerAns.equals("S") && bootAns.equals("P"))) {
                        playerScore++;
                        System.out.println("Youre choise: " + playerAns);
                        System.out.println("Boot choise: " + bootAns);
                        System.out.println(
                                "You got it!! Your points become " + playerScore + " and the boot is " + bootScore);
                        System.out.println("===============================================================");
                        gameDone++;
                    } else {
                        bootScore++;
                        System.out.println("Youre choise: " + playerAns);
                        System.out.println("Boot choise: " + bootAns);
                        System.out
                                .println("lose!! Your points become " + playerScore + " and the boot is " + bootScore);
                        System.out.println("===============================================================");
                        gameDone++;
                    }
                }

                if (playerScore > bootScore) {
                    System.out.println("You won!");
                } else if (playerScore == bootScore) {
                    System.out.println("Draw!");
                } else {
                    System.out.println("Boot won!");
                }
                System.out.println("Thank you for playing");
            } else {
                System.out.println("Thank you");
            }
        }
    }
}