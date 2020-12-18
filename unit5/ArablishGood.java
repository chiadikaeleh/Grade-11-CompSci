/*
 * Name: Chiadika Eleh
 * Date: April 30th, 2019
 * Version: v1.00
 * Description: 
 * This Java program will unscramble words that have been written right to left,
 * and write them left to right instead. 
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
public class ArablishGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        // VARIABLES 
        String reversedWord, workWord, newStr, line;
        boolean isNum;
        int numCount;

        // OBJECTS
        File file = new File("ARABLISH.txt");                               // read from file
        Scanner input = new Scanner(file);

        File outputFile = new File("OUT31.txt");                            // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        // SPLASH PAGE
        System.out.println("ARABLISH");
        System.out.println("------------------------------------------------------");
        System.out.println("This program will unscramble words that have been written "
                + "from right to left (similar to words in Arabic),");
        System.out.println("and will write them from left to right "
                + "(qualifications of the English language).");

        // PROCESSING
        while (input.hasNext()) {                                           // while there is still input to be read
            newStr = "";
            line = input.nextLine();
            StringTokenizer words = new StringTokenizer(line);

            while (words.hasMoreTokens()) {                                 // while there are still more tokens
                isNum = false;
                numCount = 0;
                workWord = words.nextToken();
                reversedWord = "";

                for (int i = 0; i < workWord.length(); i++) {               // checking if there are numbers in the word
                    if (workWord.codePointAt(i) >= 48 && workWord.codePointAt(i) <= 57) {
                        numCount++;
                    }
                }

                if (numCount == workWord.length()) {                        // checking if the entire word is a number
                    isNum = true;
                }

                if (!isNum) {
                    for (int j = workWord.length() - 1; j >= 0; j--) {      // if not an entire number, flip
                        reversedWord += workWord.charAt(j);
                    }
                } else {
                    reversedWord = workWord;                                // if number, dont flip
                }
                newStr = reversedWord + " " + newStr;                       // form new string
            }
            output.println(newStr);                                         // print
        }

        input.close();                                                      // closing output and input
        output.close();
    }

}
