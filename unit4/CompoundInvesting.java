/*
 * Name: Chiadika Eleh
 * Date: April 11th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate the final amount of money gained using user inputted
 * years and interest rate. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS

        // VARIABLES 
        int year, yearInput;
        double yearlyInvest, amntInAcc = 0, interest, interestAmnt, total;

        // SPLASH PAGE
        System.out.println("This program will print out a table that will display the amount \n"
                + "of a yearly investment over a period of up to 15 years.");

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // INPUT
        do {
            System.out.println(" ");
            System.out.print("Enter the number of years: ");
            yearInput = input.nextInt();
            // INVALID MESSAGE
            if (yearInput < 1 || yearInput > 15) {
                System.out.println("Invalid Year: 1-15");
            }
        } while (yearInput < 1 || yearInput > 15);
        do {
            System.out.print("Enter the yearly investment: ");
            yearlyInvest = input.nextDouble();
            // INVALID MESSAGE
            if (yearlyInvest < 10) {
                System.out.println("Invalid Yearly Investment: Larger than 10");
            }
        } while (yearlyInvest < 10);
        do {
            System.out.print("Enter the interest rate (%): ");
            interest = input.nextDouble();
            // INVALID MESSAGE
            if (interest < 0.1 && interest < 100) {
                System.out.println("Invalid Yearly Investment: Larger than 10");
            }
        } while (interest < 0.1);

        // OUTPUT/PROCESSING
        System.out.println(" ");
        System.out.format("%-6s | %19s | %13s | %8s\n", "Year:",
                "Amount in Account:", "Interest:", "Total:");
        for (year = 1; year <= yearInput; year++) {
            amntInAcc += yearlyInvest;
            interestAmnt = amntInAcc * (interest / 100);
            total = amntInAcc + interestAmnt;

            System.out.format("%-6s | %19s | %13s | %8s\n", year,
                    money.format(amntInAcc), money.format(interestAmnt), money.format(total));

            amntInAcc = total;
        }
    }
}
