import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int randNum = Guess();
        int PlayerNum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("""
            Welcome to Guessing Game
            Guess a number between 0 and 100
            you have 6 trys:
                """);

        while (count < 6){
            PlayerNum = input.nextInt();
            if (PlayerNum > randNum) {
                System.out.println("Try Lower Number");
                count++;
            }else if(PlayerNum == randNum){
                System.out.println("Congratulation!! You have guessed the number correctly, The number is "+ randNum);
                break;
            }else{
                System.out.println("Try Higher Number");
                count++;
            }
        }

        if (count >= 6) {
            System.out.println("Game Over, You Losed!, the number is: " + randNum );
        }


    }

    public static int Guess(){
        Random random = new Random();
        int randomNumber = random.nextInt(101); // 0 - 100
        return randomNumber;
    }
}