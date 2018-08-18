package edu.asu.transcend.rps;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Adam
 */
public class RPS {

    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, String> options = new HashMap<>();

    public static void main(String[] args) {
        boolean userContinues = true;
        String playerName;
        // Populate the options Map
        options.put(1, "ROCK");
        options.put(2, "PAPER");
        options.put(3, "SCISSORS");

        System.out.println("--- Rock, Paper, Scissors ---");
//        Prompt for the player’s name
        System.out.println("What's your name");
        playerName = scanner.next();

//       Enter game loop (do{game} while ( userContinues == true )
        do {
            // Get User Choice
            String userChoice = getUserChoice();
            // Get Computer Choice
            String compChoice = getComputerChoice();
            //            Evaluate outcome.

            // If Tie, let's figure it out now.
            if (userChoice.equalsIgnoreCase(compChoice)) {
                System.out.println("It's a Tie!");
            } else if (userChoice.equalsIgnoreCase("ROCK")) {
                if (compChoice.equalsIgnoreCase("PAPER")) {
                    System.out.println("Computer Wins!");
                } else if (compChoice.equalsIgnoreCase("SCISSORS")) {
                    System.out.println(playerName + " Wins!");
                }
            } else if (userChoice.equalsIgnoreCase("PAPER")) {
                if (compChoice.equalsIgnoreCase("ROCK")) {
                    System.out.println(playerName + " Wins!");
                }
                if (compChoice.equalsIgnoreCase("SCISSORS")) {
                    System.out.println("Computer Wins!");
                }
            } else if (userChoice.equalsIgnoreCase("SCISSORS")) {
                if (compChoice.equalsIgnoreCase("ROCK")) {
                    System.out.println("Computer Wins");
                } else if (compChoice.equalsIgnoreCase("PAPER")) {
                    System.out.println(playerName + " wins");
                }
            }

            //            Output the outcome.
            userContinues = getUserContinues();
        } while (userContinues);

//        Exit.
    }

    public static boolean getUserContinues() {
        //            Ask user if they want to continue (userContinues)
        System.out.println("Do you want to continue playing?");
        System.out.println("Y or N");
        String keepPlaying = scanner.next();

        return keepPlaying.equalsIgnoreCase("Y");
    }

    public static String getUserChoice() {
        //            Prompt user for choice (rock, paper, scissors)
        System.out.println("Rock, Paper, or Scissors?");
        String userChoice = scanner.next();
        return userChoice;
    }

    public static String getComputerChoice() {
        //            Program randomly chooses (rock, paper, scissors)
        // https://stackoverflow.com/a/363692
        Random rand = new Random();
        int randomNumber = rand.nextInt(3) + 1;
        String compChoice = options.get(randomNumber);
        return compChoice;
    }

}