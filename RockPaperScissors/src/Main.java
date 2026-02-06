import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper","scissors"};
        String playerChoice;
        String pcChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            pcChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + pcChoice);

            if(playerChoice.equals(pcChoice)){
                System.out.println("It's a tie!");
            }
            else if(
                    (playerChoice.equals("rock") && pcChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && pcChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && pcChoice.equals("paper"))
            ){
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }
            System.out.println("Plat again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();

    }
}