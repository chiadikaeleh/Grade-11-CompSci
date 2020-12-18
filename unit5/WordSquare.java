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
public class WordSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        String word, start, end;
        int length;

        // OBJECT
        Scanner input = new Scanner(System.in);

        // SPLASH PAGE
        System.out.println("This program prints a square out of the letters of a word entered by the user.");

        // INPUT
        System.out.print("Enter the word: ");
        word = input.nextLine();

        // oUTPUT AND PROCESSING
        length = word.length();
        System.out.println(" ");
        System.out.println("RESULT:");
        System.out.println(" ");

        for (int i = 0; i < length; i++) {
            end = word.substring(0, i);
            start = word.substring(i);
            System.out.println(start + end);

        }
    }

}
