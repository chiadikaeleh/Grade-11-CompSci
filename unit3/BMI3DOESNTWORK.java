/*
 * Name: Chiadika Eleh
 * Date: March 26th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate the BMI of the person depending on the weight and
 * height inputted, then it will determine the person's health.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author chiadika
 */
public class BMI3DOESNTWORK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        // VARIABLES 
        String menuChoice;
        double height, weight, bmi = 0;

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(1);
        decimal.setMaximumFractionDigits(1);

        // SPLASH PAGE
        System.out.println("BMI CALCULATOR:");
        System.out.println("----------------------------------------------------");
        System.out.println("This program will calculate your BMI using the weight");
        System.out.println("and height inputted.");
        System.out.println("----------------------------------------------------");

        // INPUT
        System.out.println(" ");
        System.out.println("Please enter your value (metric or imperial):");
        menuChoice = input.nextLine();

        // PROCESSING/OUTPUT
        while (bmi > 0) {
            switch (menuChoice.toLowerCase()) {
                case "imperial":

                    System.out.println("Please enter your weight (lbs) in the measure system inputted:");
                    weight = input.nextDouble();
                    System.out.println("Please enter your height (in) in the measure system inputted:");
                    height = input.nextDouble();

                    if (height > 11.8 && height < 118 && weight > 2.2 && weight < 661.4) {
                        bmi = (weight * 703) / Math.pow(height, 2);
                        System.out.println("With a weight of " + weight + "lbs. and a height of" + height + "in, your BMI is," + bmi);
                    }
                    break;

                case "metric":

                    System.out.println("Please enter your weight (kg) in the measure system inputted:");
                    weight = input.nextDouble();
                    System.out.println("Please enter your height(m) in the measure system inputted:");
                    height = input.nextDouble();

                    if (height > 0.3 && height < 3 && weight > 1 && weight < 300) {
                        bmi = (weight) / Math.pow(height, 2);
                        System.out.println(" ");
                        System.out.println("With a weight of " + weight + "kg, and a height of" + height + " m, your BMI is," + bmi);
                    }
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("An incorrect menu choice was inputted. Try again.");

            }
        }

        // CLASSIFICATION: Only Vadlid Data
        

            if (bmi < 16) {
                System.out.println("You are in a state of stravation.");
            } else if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi < 25) {
                System.out.println("You are in ideal condition.");
            } else if (bmi < 30) {
                System.out.println("You are overweight.");
            } else if (bmi < 40) {
                System.out.println("You are obese.");
            } else if (bmi > 40) {
                System.out.println("You are morbidly obese.");
           
        }
            
         if (bmi < 0) {
            System.out.println("INVALID DATA...");
        }

    }
}
