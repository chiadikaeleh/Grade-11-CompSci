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
public class TheCellSell2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dayMin, eveMin, wkendMin;
        double priceA, priceB;
        final double DAY_PRICE_A = 0.25, EVE_PRICE_A = 0.15, WKEND_PRICE_A = 0.20;
        final double DAY_PRICE_B = 0.45, EVE_PRICE_B = 0.35, WKEND_PRICE_B = 0.25;

// OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Number of Daytime Minutes: ");
        dayMin = input.nextInt();
        System.out.print("Number of Evening Minutes: ");
        eveMin = input.nextInt();
        System.out.print("Number of Weekend Minutes: ");
        wkendMin = input.nextInt();
        System.out.println("");

        if (dayMin <= 100) {
            priceA = (eveMin * EVE_PRICE_A) + (wkendMin * WKEND_PRICE_A);
            priceB = (eveMin * EVE_PRICE_B) + (wkendMin * WKEND_PRICE_B);
        } else if (dayMin > 100 && dayMin <= 250) {
            priceA = ((dayMin - 100) * DAY_PRICE_A) + (eveMin * EVE_PRICE_A) + (wkendMin * WKEND_PRICE_A);
            priceB = (eveMin * EVE_PRICE_B) + (wkendMin * WKEND_PRICE_B);
        } else {
            priceA = ((dayMin - 100) * DAY_PRICE_A) + (eveMin * EVE_PRICE_A) + (wkendMin * WKEND_PRICE_A);
            priceB = ((dayMin - 250) * DAY_PRICE_B) + (eveMin * EVE_PRICE_B) + (wkendMin * WKEND_PRICE_B);
        }

        System.out.println("Plan A costs " + priceA);
        System.out.println("Plan B costs " + priceB);
        System.out.println(" ");

        if (priceA < priceB) {
            System.out.println("Plan A is cheapest!");
        } else if (priceA > priceB) {
            System.out.println("Plan B is cheapest!");
        } else {
            System.out.println("Plan A & B are the same price!");
        }

    }

}
