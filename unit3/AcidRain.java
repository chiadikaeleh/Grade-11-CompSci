/*
 * Name: Chiadika Eleh
 * Date: March 8th, 2019
 * Version: v1.00
 * Description: 
 * This program will determine whether or not a water body is safe for use 
 * depending on the pH that is entered.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        final double MIN_NEUTRAL = 6.5;
        final double MAX_NEUTRAL = 7.5;
        final double MAX_ACIDIC = 3.5;
        final double MAX_ALKALINE = 12.5;

        // VARIABLES
        double pH;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // SPLASH PAGE
        System.out.println("pH LEVEL CALCULATOR");
        System.out.println("------------------------------------------------------");
        System.out.println("This program will calculate the risk for fish depending");
        System.out.println("on the pH of water that is entered.");
        System.out.println("------------------------------------------------------");
        System.out.println("A pH that is too acidic or too neutral is dangerous,");
        System.out.println("therefore, a desirable pH is neutral.");
        System.out.println("------------------------------------------------------");

        // INPUT
        System.out.println("Please enter the pH of the water body:");
        pH = input.nextDouble();

        // PROCESSING/OUTPUT
        if (pH < MAX_ACIDIC || pH > MAX_ALKALINE) {
            // removing invalid data
            System.out.println(" ");
            System.out.println("Invalid data has been entered. Please try again.");
        } else if (pH >= MIN_NEUTRAL && pH <= MAX_NEUTRAL) {
            // cases for neutral water
            System.out.println(" ");
            System.out.println("THE WATER BODY IS NEUTRAL - FISH IN STREAMS, "
                    + "RIVERS AND LAKES WILL SURVIVE.");
        } else if (pH > MAX_NEUTRAL && pH < MAX_ALKALINE) {
            // cases for alkaline water
            System.out.println(" ");
            System.out.println("THE WATER BODY IS TOO ALKALINE - FISH IN STREAMS, "
                    + "RIVERS AND LAKES WILL NOT SURVIVE");
        } else {
            // cases for acidic water
            System.out.println(" ");
            System.out.println("THE WATER BODY IS TOO ACIDIC - FISH IN STREAMS, "
                    + "RIVERS AND LAKES WILL NOT SURVIVE");
        }
    }

}
