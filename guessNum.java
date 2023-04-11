package competition;

import java.util.Scanner; // imports the scanner class

public class main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        
        System.out.println("--------------------- GUESS THE NUMBER GAME ---------------------");
        System.out.println();
        
        int lives = 3;
        int secretNumber = 9;
        int guess = 0;
        String playAgain = "y";
        
        while(playAgain.equalsIgnoreCase("y")) {
            lives = 3;
            guess = 0;
            
            while(lives > 0) {
                System.out.print("Guess the secret number: ");
                guess = scan.nextInt();
                
                if(guess == secretNumber) {
                    System.out.println("You win!");
                    break;
                }
                else {
                    lives--;
                    System.out.println("Wrong guess, you have " + lives + " guesses left.");
                    System.out.println();
                }
            }
            
            if(lives == 0) {
                System.out.println("You lose!");
            }
            
            System.out.println();
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = scan.next();
            System.out.println();
        }
        
        System.out.println("Thanks for playing! Goodbye.");
        scan.close();
	}

}
