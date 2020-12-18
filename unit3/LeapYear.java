/*
 * Name: Chiadika Eleh
 * Date: March 26th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate whether or not the year entered is a leap year.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        int year;

        //OBJECT
        Scanner input = new Scanner(System.in);

        //SPLASH PAGE
        System.out.println("LEAP YEAR MACHINE:");
        System.out.println(" ");
        System.out.println("This program will determine whether the year entered");
        System.out.println("is a leap year");
        System.out.println(" ");

        //INPUT
        System.out.print("Please enter the year: ");
        year = input.nextInt();

        // PROCESSING AND OUTPUT 
        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // characteristics of a leap year
            System.out.println("--------------------------------------------------");
            System.out.println(year + " is a leap year.");
        } else if (year < 1582) {
            System.out.println("--------------------------------------------------");
            System.out.println("The Gregorian calendar starts at 1582,");
            System.out.println("so the year inputted must be above 1582.");
            System.out.println("Please try again.");
        } else {
            System.out.println("--------------------------------------------------");
            System.out.println(year + " is not a leap year.");
        }

    }

}
