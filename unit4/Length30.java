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
public class Length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIBLES
        String a, b;
        int wordCount, wordCount2, wordTotal;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Enter the first word:");
        a = input.next();
        System.out.print("Enter the second word:");
        b = input.next();

        // PROCESSING/OUTPUT
        wordCount = a.length();
        wordCount2 = b.length();
        int counter = 0;
        wordTotal = wordCount + wordCount2;

        while ( wordTotal <= 30) {
            System.out.println( );
            
        }
    }

}
