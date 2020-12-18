/*
 * Name: Chiadika Eleh
 * Date: March 26th, 2019
 * Version: v1.00
 * Description: 
 * Using the 3 sides entered, this program will determine wheter or not a triangle
 * can be made, and it will also determine if it is a right triangle. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        double side1, side2, side3;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // SPLASH PAGE
        System.out.println("TRIANGLE SIDES CALCULATOR:");
        System.out.println(" ");
        System.out.println("Using the side values entered, this program will");
        System.out.println("determine if those sides make a triangle, and also if");
        System.out.println("the triangle is a right triangle.");
        System.out.println("------------------------------------------------------");
        System.out.println(" ");

        // INPUT
        System.out.println("Enter side 1:");
        side1 = input.nextDouble();
        System.out.println("Enter side 2:");
        side2 = input.nextDouble();
        System.out.println("Enter side 3");
        side3 = input.nextDouble();

        // PROCESSING/OUTPUT
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            // checking if triangle is made
            if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
                System.out.println("The sides entered form a triangle.");
            } else {
                System.out.println("The sides entered do not make a triangle.");
            }

            // checking if right triangle is made
            if (Math.pow(side3, 2) + Math.pow(side2, 2) == Math.pow(side1, 2)
                    || Math.pow(side3, 2) + Math.pow(side1, 2) == Math.pow(side2, 2)
                    || Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)) {
                System.out.println("The sides entered also form a right triangle.");
            } else {
                System.out.println("The sides entered do not form a right triangle.");
            }
        } else {
            System.out.println("The sides entered are not valid input. Try again.");
        }
    }

}
