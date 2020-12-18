/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Arablish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // VARIABLES 
        String reversedWord;
        StringBuilder newWord;

        // OBJECTS
        File file = new File("ARABLISH.txt"); // read from file
        Scanner input = new Scanner(file);

        File outputFile = new File("OUT31.txt");    // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        // SPLASH PAGE
        System.out.println("ARABLISH");
        System.out.println("------------------------------------------------------");
        System.out.println("This program will unscramble words that have been written "
                + "from right to left");

        // PROCESSING
        while (input.hasNext()) { 
            String newStr = "";
            String line = input.nextLine();
            StringTokenizer words = new StringTokenizer(line);

            while (words.hasMoreTokens()) {
                String workWord = words.nextToken();
                if (workWord.matches("[0-9]+")) {
                    reversedWord = workWord;
                } else {
                    newWord = new StringBuilder(workWord);
                    reversedWord = newWord.reverse().toString();
                }
                newStr = reversedWord + " " + newStr;
            }
            output.println(newStr);
        }
        input.close(); // closing input and output
        output.close();
    }
}
