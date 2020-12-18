/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days = getInput();
        int[] temp = getResults(days);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter how many days of the week: ");
        int number = input.nextInt();
        return number;
    }

    public static int[] getResults(int numberOfDays) {

        Scanner input = new Scanner(System.in);
        int[] number = new int[numberOfDays];
        int temp;
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < number.length; i++) {

            System.out.print(daysOfWeek[i] + " : ");

            temp = input.nextInt();

        }
        return number;
    }

}
