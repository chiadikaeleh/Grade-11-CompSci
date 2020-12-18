/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        final double BOLT_PRICE = 0.05, NUT_PRICE = 0.03, WASHER_PRICE = 0.01;
        
        // VARIABLES
        int bolts, nuts, washers;
        double price;
        
        // oBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();


        
        // INPUT
        System.out.print("Enter the amount of bolts:");
        bolts = input.nextInt();
        System.out.print("Enter the amount of nuts:");
        nuts = input.nextInt();
        System.out.print("Enter the amount of washers:");
        washers = input.nextInt();
        
        // ASSIGNMENTS 
        
        // PROCESSING/OUTPUT
        System.out.println(" ");
        System.out.println("Price of Order:");
        price = ( bolts * BOLT_PRICE ) + ( nuts * NUT_PRICE ) + ( washers * WASHER_PRICE );
        System.out.println("The total price is " + money.format(price));
        
        if ( bolts == nuts && washers == bolts * 2) {
            System.out.println(" ");
                System.out.println("ORDER IS OK");
    }
      
        else if (bolts > nuts){
            System.out.println(" ");
            System.out.println("Check Order: too few nuts");
        }
        
        else if (nuts > bolts){
            System.out.println("");
            System.out.println("Check Order: too few bolts");
        }
        if ( washers != bolts *2 ){
            System.out.println("Check Order: too few washers");
        
        }
    }
    
}
