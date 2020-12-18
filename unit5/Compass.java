/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        String direction;
        int length, degree;

        // CONSTANTS
        // OBJECTS
        Scanner input = new Scanner(System.in);

        // SPLASH PAGE
        System.out.println("COMPASS DIRECTIONS:");
        System.out.println(" ");
        System.out.println("Compass directions are written in the following form: S45W. This indicates");
        System.out.println("that the direction is determined by facing SOUTH and then turning 45 degrees");
        System.out.println("towards the WEST. This program has the user enter a compass direction and");
        System.out.println("then prints a message.");

        // INPUT
        System.out.println("-----------------------------------------------------");

        do {
            System.out.println(" ");
            System.out.print("Enter the direction: ");
            direction = input.nextLine();
            length = direction.length();
            degree = Integer.parseInt(direction.substring(1, 2));

            // INVALID MESSAGE
            if (length != 4 || direction.charAt(0) != 'S' || direction.charAt(0) != 'N'
                    || direction.charAt(3) != 'W' || direction.charAt(3) != 'E' || degree > 90) {
                System.out.println("Vector entry must be 4 characters long.");
                System.out.println("N or S must be the first direction");
                System.out.println("The angle must not be greater.");
                System.out.println("W or E must be the last direction.");
                System.out.println(" ");
            }
        } while (length != 4 || direction.charAt(0) != 'S' || direction.charAt(0) != 'N'
                || direction.charAt(3) != 'W' || direction.charAt(3) != 'E' || degree > 90);

//        if ( direction.charAt(0) != 'S' || direction.charAt(0) != 'N') {
//                System.out.println("Vector entry must be 4 characters long.");
//            }
//        } while ( direction.charAt(0) != 'S' || direction.charAt(0) != 'N');
// OUTPUT AND PROCESSING
        System.out.println(" ");
        System.out.println("RESULT:");
        System.out.println(" ");

        if (direction.charAt(0) == 'S') {
            System.out.print("Start facing SOUTH. ");
        } else {
            System.out.print("Start facing SOUTH. ");

        }
        System.out.print("Turn " + direction.substring(1, 3) + " towards the");

        if (direction.charAt(3) == 'E') {
            System.out.print(" EAST. ");
        } else {
            System.out.print(" WEST. ");

        }

    }

}
