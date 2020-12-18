/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1elehchi4
 */
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        // VARIABLES
        String a;
        int wordCount, counter = 0;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.println("Enter a Word:");
        a = input.next();

        // PROCESSING/OUTPUT
        wordCount = a.length();
        System.out.println("The word " + a + " has a length of " + wordCount + " characters.");

        while (counter < wordCount) {
            System.out.print(a + " ");
            counter++;
        }
    }

}
