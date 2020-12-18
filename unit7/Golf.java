/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Scanner;

/**
 *
 * @author 1elehchi4
 */
public class Golf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int holes = getInput();
        int[] scores = getResults(holes);

    }

    public static int getInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of holes played:");

        int number = input.nextInt();
        return number;
    }

    public static int[] getResults(int numberOfHoles) {

        Scanner input = new Scanner(System.in);
        int[] number = new int[numberOfHoles];

        for (int i = 0; i < number.length; i++) {

            System.out.print("Enter Hole " + (i + 1) + " : ");

            number[i] = input.nextInt();
        }
        return number;
    }

}
