
package edu.hdsb.gwss.chiadika.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/* Name: Chiadika Eleh
 * Date: March 23rd, 2019
 * Version: v1.00
 * Description: 
 * A 10% discount is taken on purchases over $10.00. This program will calculate 
 * the discounted price
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // CONSTANTS
        final double DISCOUNT = 0.10;
        
        // VARIABLES
        double price, totalPrice;
        
        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // SPLASH PAGE
       
        
        // INPUT
        System.out.println("Enter amount of Purchases:");
        price = input.nextDouble();
        
        // ASSIGNMENTS
        // PROCESSING
        if ( price > 10.00 ) {
            totalPrice = price - (price * DISCOUNT);
            System.out.println("Your orginal price was " + money.format(price) + ".");
            System.out.println("Your discounted price is " + money.format(totalPrice));
        }
            
            else if ( price < 10.00 ) {
                 totalPrice = price;
                    System.out.println("Your purchase is not eligible for a discount.");
                    System.out.println("Your final price is " + money.format(totalPrice));
                    }
        }
        
    }
    

