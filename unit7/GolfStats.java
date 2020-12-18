/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class GolfStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int holes = getInput();
        int[] scores = getResults(holes);
        System.out.println(" ");
        System.out.println("The highest score was: " + maxValue(scores));
        System.out.println("The lowest score was: " + minValue(scores));

    }

    public static int getInput() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of holes played: ");
        int number = input.nextInt();
        return number;
    }

    public static int[] getResults(int numberOfHoles) {

        Scanner input = new Scanner(System.in);
        int[] number = new int[numberOfHoles];

        for (int i = 0; i < number.length; i++) {

            System.out.println(" ");
            System.out.print("Enter Hole " + (i + 1) + " : ");

            number[i] = input.nextInt();

        }
        return number;
    }

    public static int maxValue(int scores[]) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int minValue(int scores[]) {
        
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
}
