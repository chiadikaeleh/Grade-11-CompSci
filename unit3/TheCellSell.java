/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class TheCellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        final double DAY_PRICE_A = 0.25, EVE_PRICE_A = 0.15, WKEND_PRICE_A = 0.20;
        final double DAY_PRICE_B = 0.45, EVE_PRICE_B = 0.35, WKEND_PRICE_B = 0.25;

        // VARIABLES
        double priceA, priceB, wkendMinutes, eveMinutes, dayMinutes;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Number of Daytime Minutes: ");
        wkendMinutes = input.nextDouble();
        System.out.print("Number of Evening Minutes: ");
        eveMinutes = input.nextDouble();
        System.out.print("Number of Weekend Minutes: ");
        dayMinutes = input.nextDouble();
        System.out.println("");

        if (dayMinutes <= 100) {
            priceA = (eveMinutes * EVE_PRICE_A) + (wkendMinutes * WKEND_PRICE_A);
        } else {
            priceA = ((dayMinutes - 100) * DAY_PRICE_A) + (eveMinutes * EVE_PRICE_A) + (wkendMinutes * WKEND_PRICE_A);
        }

        if (dayMinutes <= 250) {
            priceB = (eveMinutes * EVE_PRICE_B) + (wkendMinutes * WKEND_PRICE_B);
        } else {
            dayMinutes = dayMinutes - 250;
            priceB = (dayMinutes  * DAY_PRICE_B) + (eveMinutes * EVE_PRICE_B) + (wkendMinutes * WKEND_PRICE_B);
        }

        //priceA = Math.max(0, ((dayMinutes - 100) * DAY_PRICE_A)) + (eveMinutes * EVE_PRICE_A) + (wkendMinutes * WKEND_PRICE_A);
        //priceB = Math.max(0, (dayMinutes - 250)) * DAY_PRICE_B + (eveMinutes * EVE_PRICE_B) + (wkendMinutes * WKEND_PRICE_B);
        System.out.println("Price A is: " + priceA);
        System.out.println("Price B is: " + priceB);

        //OUTPUT
        if (priceA < priceB) {
            System.out.println("Plan A is better");

        } else if (priceA > priceB) {
            System.out.println("Plan B is better");
        } else {
            System.out.println("Plan A and Plan B are the same price");
        }

    }

}
