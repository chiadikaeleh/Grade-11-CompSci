/*
 * Name: Chiadika Eleh
 * Date: April 30th, 2019
 * Version: v1.00
 * Description: 
 * This Java program will determine whether 2 words have the same vowel - consonant
 * structure. 
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
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // VARIABLES
        String pattern1, pattern2, line, first, second;

        // OBJECTS
        File file = new File("PATTERNMATCHING.txt");                                // read from file
        Scanner input = new Scanner(file);

        File outputFile = new File("OUT21.txt");                                    // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        // SPLASH PAGE
        System.out.println("PATTERN MATCHING");
        System.out.println("------------------------------------------------------");
        System.out.println("This program will deteremine if the vowel-consonant "
                + "structure of 2 words is the same or different");

        // PROCESSING
        while (input.hasNext()) {                                                   // while there is still input
            pattern1 = "";
            pattern2 = "";

            line = input.nextLine();
            StringTokenizer cutLine = new StringTokenizer(line);

            while (cutLine.hasMoreTokens()) {                                       // while there are still tokens

                first = cutLine.nextToken();
                second = cutLine.nextToken();

                if (first.length() != second.length()) {                            // first exemption
                    output.println("different");
                } else {
                    for (int i = 0; i < first.length(); i++) {                      // checking if there are vowels
                        if (first.charAt(i) == 'a' || first.charAt(i) == 'e'
                                || first.charAt(i) == 'i' || first.charAt(i) == 'o'
                                || first.charAt(i) == 'u' || first.charAt(i) == 'A'
                                || first.charAt(i) == 'E' // capital letters bc hacker rank
                                || first.charAt(i) == 'I' || first.charAt(i) == 'O'
                                || first.charAt(i) == 'U') {
                            pattern1 += "v";                                        // making a string of its structure
                        } else {
                            pattern1 += "c";
                        }

                        if (second.charAt(i) == 'a' || second.charAt(i) == 'e'      // checking if there are vowels
                                || second.charAt(i) == 'i' || second.charAt(i) == 'o'
                                || second.charAt(i) == 'u' || second.charAt(i) == 'A'
                                || second.charAt(i) == 'E' || second.charAt(i) == 'I'
                                || second.charAt(i) == 'O'                          // capital letters bc hacker rank
                                || second.charAt(i) == 'U') {
                            pattern2 += "v";                                        // making a string of its structure
                        } else {
                            pattern2 += "c";
                        }
                    }
                    if (!pattern1.equals(pattern2)) {
                        output.println("different");                                // printing
                    } else {
                        output.println("same");
                    }
                }
            }
        }
        input.close();                                                              // closing input and output
        output.close();
    }
}
