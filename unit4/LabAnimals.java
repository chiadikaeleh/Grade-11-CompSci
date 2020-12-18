/*
 * Name: Chiadika Eleh
 * Date: April 11th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate how many hours it will take until the amount of
 * animals in a barn outweighs the food available. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // VARIABLES
        int population, hour = 1, food, addedFood, oldPopulation = 0, oldFood = 0;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        //SPLASH PAGE
        System.out.println("LAB ANIMALS");
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println(" ");
        System.out.println("At present there are X animals in the lab and enough "
                + "food for Y animals. At the end of every hour the");
        System.out.println("population doubles, and enough food is added to support "
                + "Z more animals. During any hour the animals");
        System.out.println("will eat enough food for only themselves. The program "
                + "will determine when the population will");
        System.out.println("outgrow the food supply.");

        // INPUT
        do {
            System.out.println(" ");
            System.out.print("Enter the initial population(X): ");
            population = input.nextInt();
            // INVALID MESSAGE
            if (population <= 0) {
                System.out.println("Invalid Input: Must be greater than 0");
            }
        } while (population <= 0);

        do {
            System.out.print("Enter the initial food supply(Y): ");
            food = input.nextInt();
            // INVALID MESSAGE
            if (food <= 0) {
                System.out.println("Invalid Input: Must be greater than 0");
            }
        } while (food <= 0);

        do {
            System.out.print("Enter the amount of food added each hour(Z): ");
            addedFood = input.nextInt();
            // INVALID MESSAGE
            if (addedFood <= 0) {
                System.out.println("Invalid Input: Must be greater than 0");
            }
        } while (addedFood <= 0);

        // PROCESSING/OUTPUT

        System.out.println(" ");
        System.out.printf("%-5s | %-15s | %-12s | %-12s | %-12s | ", "Hour",
                "Animals at Start", "Food at Start", "Food at End", "Animals at End");
        System.out.println(" ");

        while (food > population) {
            oldPopulation = population;
            oldFood = food;
            food += addedFood;
            food = food - oldPopulation;
            population *= 2;
            System.out.printf("%5s | %15s | %12s | %12s | %12s ", hour, 
                    oldPopulation, oldFood, food, population);
            System.out.println();
            hour++;
        }
        System.out.println(" ");
        System.out.println("It would take " + (hour - 1) + " hours for the animals "
                + "present to overpower the food supply.");

    }

}
