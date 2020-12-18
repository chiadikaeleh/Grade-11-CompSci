/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Length30Study {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String word1, word2, combined = "", period = ".";
        int length = 0;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Enter Word 1 Value: ");
        word1 = input.next();
        System.out.print("Enter Word 2 Value: ");
        word2 = input.next();

        while (length <= 30) {
            length = word1.length() + period.length() + word2.length();

            combined = word1 + period + word2;
            period += ".";
        }
        System.out.println(combined);

    }

}
