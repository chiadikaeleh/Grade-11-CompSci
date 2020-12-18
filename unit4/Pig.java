/*
 * Name: Chiadika Eleh
 * Date: April 11th, 2019
 * Version: v1.00
 * Description: 
 * This is a Java implementation of the dice game "Pig." The user will play against
 * the computer and the first one to get to 100 points wins. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Pig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int compTotal = 0, userTotal = 0, decision = 0, die, compScore = 0,
                userScore = 0, compRolls = 0, start, compRoll;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // SPLASH PAGE - necessary so the game doesnt start before the rules are read
        do {
            System.out.println(" ");
            System.out.println("Welcome to the Pig Game!");
            System.out.println("-----------------------");
            System.out.println("This is a game to test your greediness and your "
                    + "strategy skills.");
            System.out.println("On each turn, you must decide whether you would "
                    + "like to play again, or hold your points.");
            System.out.println("But if you score a 0... too bad for you! All your "
                    + "points for that round are taken away!");
            System.out.println("The first player to reach 100 points is the winner!");
            System.out.println(" ");
            System.out.println("Would you like to play?");
            System.out.println(" ");
            System.out.print("Please enter your choice (1 means Yes, 2 means No): ");
            start = input.nextInt();
            // INVALID MESSAGE
            if (start != 1 && start != 2) {
                System.out.println("Invalid Choice. Please try again.");
            }
        } while (start == 2 || start != 1 && start != 2);

        // INPUT / PROCESSING / OUTPUT
        if (start == 1) {                                               // if the user decides to start the program
            System.out.println(" ");
            System.out.println("LET THE GAMES BEGIN!");

            while (compTotal < 100 && userTotal < 100) {                // while no one has won
                System.out.println(" ");
                System.out.println("--------------------");
                System.out.println("USER'S TURN:");
                System.out.println("USER SCORE: " + userTotal);
                System.out.println("--------------------");
                do {
                    die = (int) (Math.random() * 6 + 1);                // rolls the dice
                    System.out.println("You rolled a " + die + ".");

                    if (die == 1) {                                     // turn is over
                        userScore = 0;
                        System.out.println(" ");
                        System.out.println("You have lost your turn for this round!");
                        System.out.println("It is now the CPUs turn.");
                        System.out.println(" ");
                    } else {                                            // user continues turn
                        userScore = userScore + die;
                        System.out.println(" ");
                        System.out.println("USER TURN TOTAL: " + userScore);

                        do {                                            // error checking input
                            System.out.println(" ");
                            System.out.print("Roll Again? 1 = Yes, 2 = No (to keep your score of " + userScore + "): ");
                            decision = input.nextInt();
                            // INVALID MESSAGE if user does not enter 1 or 2 
                            if (decision != 1 && decision != 2) {
                                System.out.println("Invalid Choice. Try again.");
                            }

                        } while (decision != 1 && decision != 2);

                        if (decision == 2) {                            // user chooses turn is over
                            userTotal = userTotal + userScore;
                        }
                    }
                } while (decision == 1 && die != 1);                    // repeat when the user wants to roll again and when the die isnt a 1
                userScore = 0;

                System.out.println("USER TOTAL SCORE: " + userTotal);   // prints users total score

                // CPU's turn
                die = -1;
                compRolls = (int) (Math.random() * 6 ) + 3;              // randomizes computers rolls
                System.out.println(" ");
                System.out.println("--------------------");
                System.out.println("CPU's TURN:");
                System.out.println("CPU SCORE: " + compTotal);
                System.out.println("--------------------");

                System.out.println(" ");
                for (compRoll = 0; compRoll <= compRolls && die != 1; compRoll++) {

                    die = (int) (Math.random() * 6 + 1);                // comp rolls die
                    System.out.println("CPU rolled a " + die);

                    if (die == 1) {                                     // cancels turn and removes points
                        // TURN OVER
                        compScore = 0;
                        System.out.println("CPU lost their turn. It is now the User's turn.");
                    } else {                                            // comp rolls again
                        // ROLL AGAIN
                        compScore = compScore + die;
                    }
                }
                compTotal = compTotal + compScore;                      // adds up comp total
                System.out.println(" ");
                System.out.println("CPU collected " + compScore + " points.");
                System.out.println("CPU TOTAL: " + compTotal);
                compScore = 0;                                          // sets computer score back to 0

            }

            while (compTotal >= 100 || userTotal >= 100) {              // decides winner
                break;
            }
            {
                if (compTotal > userTotal) {
                    System.out.println("--------------------");
                    System.out.println(" ");

                    System.out.println("THE CPU HAS WON WITH A SCORE OF " + compTotal + "! GAME OVER!");

                } else if (compTotal == userTotal) {
                    System.out.println("--------------------");
                    System.out.println(" ");

                    System.out.println("THE USER AND THE CPU TIED WITH A SCORE OF " + userTotal + "! GAME OVER!");
                } else {
                    System.out.println("--------------------");
                    System.out.println(" ");

                    System.out.println("THE USER HAS WON WITH A SCORE OF " + userTotal + "! GAME OVER!");
                }
            }

        }
    }
}
