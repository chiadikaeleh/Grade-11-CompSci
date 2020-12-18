/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author chiadika
 */
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        final int HALL_RENTAL = 350;
        
        // VARIABLES
        String yourName;
        int numOfGuests;
        double costPerPerson, price;
        
        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        // SPLASH
        System.out.println("This is a program to calculate the cost of dinner");
        System.out.println("This program will ask for your first name");
        System.out.println(" , the number of guests and the cost pers person.");
        
        // INPUT
        System.out.println(" ");
        System.out.print("Please enter your name:");
        yourName = input.nextLine();
        System.out.print("the number of guests:");
        numOfGuests = input.nextInt();
        System.out.print("the cost per person:");
        costPerPerson = input.nextDouble();
        
        // PROCESS
        price = ((numOfGuests * costPerPerson) + HALL_RENTAL);
        
        // OUTPUT
        System.out.println("Therfore, " + yourName + ", the cost of dinner is ");
        System.out.println(money.format(price));
    }
    
}
