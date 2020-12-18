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
public class TemperatureStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int days = getInput();
        int[] temp = getResults(days);
        System.out.println(" ");
        System.out.println("The average temperature was: " + average(temp, days));
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
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < number.length; i++) {
            System.out.print(daysOfWeek[i] + " : ");
            number[i] = input.nextInt();
        }
        return number;
    }

    public static double average(int[] data, int days) {
        double sum = 0;

        for (int i = 0; i < days; i++) {

            sum += data[i];
        }
        return sum / days;
    }

}
