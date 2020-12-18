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
public class WordEchoStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String word;
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        word = input.next();
        int i = 0;

        do {
            System.out.print(word + " ");
            i++;
        } while (i < word.length());

    }

}
