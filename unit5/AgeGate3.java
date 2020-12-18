/*
 * Name: Chiadika Eleh
 * Date: April 30th, 2019
 * Version: v1.00
 * Description: 
 * Using an age inputted, this program will determine whether it is old enough to 
 * enter the CCC. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author chiadika
 */
public class AgeGate3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // OBJECTS
        File file = new File("AgeGate.txt"); // Create File, and Scanner to File
        Scanner input = new Scanner(file);

        File outputFile = new File("OUT11.txt"); // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        // VARIABLES
        int month, day, year;

        //CONSTANTS
        final int COMPARE_YEAR = 2005, COMPARE_DAY = 25, COMPARE_MONTH = 04;

        // SPLASH PAGE
        System.out.println("AGE GATE");
        System.out.println("------------------------------------------------------");
        System.out.println("This program will deteremine if someone is old enough"
                + "to enter the CCC");

        // PROCESSING
        while (input.hasNext()) {
            StringTokenizer birthday = new StringTokenizer(input.nextLine());

            month = Integer.parseInt(birthday.nextToken());
            day = Integer.parseInt(birthday.nextToken());
            year = Integer.parseInt(birthday.nextToken());

            if (year <= COMPARE_YEAR && day <= COMPARE_DAY && month <= COMPARE_MONTH) {
                output.println("old enough");
            } else {
                output.println("too young");
            }
        }
        // Close File
        input.close();
        output.close();
    }
}
