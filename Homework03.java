// Mikael Huffman
import java.util.Random;
import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {
    	// Making a scanner 'key' and a random 'r' for user/computer input respectively.
        Scanner key = new Scanner(System.in);
        Random r = new Random();
        
        // declaring ints for score for future use.
        int playerScore = 0;
        int computerScore = 0;

        String[] possibilities = {"Rock", "Paper", "Scissors"};

        // Loop to play 3 rounds.
        for (int round = 1; round <= 3; round++) {
            System.out.println("This is round " + round + ": Enter \"rock\", \"paper\", or \"scissors\": ");
            String playerChoice = key.nextLine(); // Player's input
            
            int computerRandomChoice = r.nextInt(3); // Computer randomly selects rock, paper, or scissors
            String computerChoice = possibilities[computerRandomChoice];

            System.out.println("The computer chose: " + computerChoice);

            // Compares strings to draw, player win, or computer win.
            if (playerChoice.equalsIgnoreCase("rock") || playerChoice.equalsIgnoreCase("paper") || playerChoice.equalsIgnoreCase("scissors")) 
            {
                if (playerChoice.equalsIgnoreCase(computerChoice)) 
                {
                    System.out.println("It's a draw!");
                } 
                
                else if (
                    (playerChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
                    (playerChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                    (playerChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))
                ){
                    playerScore++;
                    System.out.println("You win this round! You have "+playerScore+" points!");
                }
                
                else 
                {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                }
            } 
            
            else 
            {
                System.out.println("Invalid input! Computer gets a point.");
                computerScore++;
            }
        }

        // if statement to determine winner
        if (playerScore > computerScore) 
        {
            System.out.println("You win!");
        } 
        else if (playerScore < computerScore) 
        {
            System.out.println("The computer wins!");
        } 
        else 
        {
            System.out.println("No winner; It's a tie!");
        }

    }
}