/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       // create scanner object
       Scanner input = new Scanner(System.in);
        
        // ASSIGN VALUES
        int change, quarterRmdr, quarterAmnt, nickelRmdr, nickelAmnt, penniesAmnt,
              penniesRmdr, dimesRmdr, dimesAmnt ;
        final int QUARTERS, NICKELS, PENNIES, DIMES;
       
        QUARTERS = 25;
        NICKELS = 5;
        PENNIES = 1;
        DIMES = 10;
        
        //prompt user:
        System.out.print("Enter Change in Cents:");
        
        change = input.nextInt();
        
        // EQUATIONS
        quarterAmnt = change / QUARTERS;
        quarterRmdr = change % QUARTERS;
        dimesAmnt = quarterRmdr / DIMES;
        dimesRmdr = quarterRmdr % DIMES;
        nickelAmnt = dimesRmdr / NICKELS;
        nickelRmdr = dimesRmdr % NICKELS;
        penniesAmnt = nickelRmdr / PENNIES;
        penniesRmdr = nickelRmdr % PENNIES;
        
        // OUTPUT
      
        System.out.println("The Minimum Number of Coins is:");
        System.out.println("------------------------------");
        System.out.println("Quarters:" + quarterAmnt);
        System.out.println("Dimes:" + dimesAmnt);
        System.out.println("Nickels:" + nickelAmnt);
        System.out.println("Pennies:" + penniesAmnt);
    }
    
}
