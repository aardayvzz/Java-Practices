package day2;

import java.util.Scanner;
import java.util.Random;

public class Guessthenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;
        
        
        int attemptsLeft = 5; 

        System.out.println("Game Start! I'm thinking of a number between 1 and 100. You have " + attemptsLeft + " attempts!");

       
        while (guess != secretNumber && attemptsLeft > 0) {
            System.out.print("Your guess: ");
            guess = input.nextInt();
            
           
            attemptsLeft = attemptsLeft - 1; 

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed it right.");
            } else if (guess < secretNumber) {
                System.out.println("Go HIGHER. Attempts left: " + attemptsLeft);
            } else if (guess > secretNumber) {
                System.out.println("Go LOWER. Attempts left: " + attemptsLeft);
            }
        }
        
        
        if (attemptsLeft == 0 && guess != secretNumber) {
            System.out.println("Out of attempts, you lost! The number was: " + secretNumber);
        }
        
    }
}