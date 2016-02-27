/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package df4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DF4 {

    static void GuessingGame() {
        Scanner read = new Scanner(System.in);
        int answer = (int) Math.floor((Math.random() * 100) + 1);        
        int guess = 0;
        int numGuesses = 1;
        while (numGuesses < 7 && (guess != answer)) {
            System.out.println("Guess a number: ");
            guess = read.nextInt();
            if (guess < answer) {
                System.out.println("Higher...");
            } else if (guess > answer) {
                System.out.println("Lower...");
            } else if(answer == guess){
                System.out.println("You win,");
            }
            numGuesses = numGuesses + 1;
        }
        if (numGuesses > 6) {
            System.out.println("You loser.");
            System.out.println("The correct number: " +answer);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String playAgain = "y";
        while (playAgain.equals("y")) {
            GuessingGame();
            System.out.println("Would you like to play another game? (y/n): ");
            playAgain = read.next();
        }
        System.out.println("Thanks for playing!");
    } 
}
