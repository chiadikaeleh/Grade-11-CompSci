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
public class CountingVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        String word;
        int vowelCount = 0;
        
        // CONSTANTS
        // SPLASH PAGE
        System.out.println("Count Vowels:");
        System.out.println("--------------------");
        System.out.println("The Program counts the number of vowels in a sentence.");
        
        // OBJECTS
        Scanner input = new Scanner(System.in);

        //INPUT
        System.out.print("Enter a sentence: ");
        word = input.nextLine();
        
        // PROCESSING
        for ( int i = 0 ; i < word.length() ; i++ ){
            if ( word.charAt(i) == 'a' || word.charAt(i) == 'e' 
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                
                vowelCount++;
            }
        }
        
        // OUTPUT
        System.out.println(" ");
        System.out.println("There are " + vowelCount + " vowels in this sentence!");
        
    }
    
}
