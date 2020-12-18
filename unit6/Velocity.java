/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1elehchi4
 */
public class Velocity {

    static double time;
    static double velocity;
    static double distance;
    
    /**
     * @param args the command line arguments
     */
    public static void toVelocity() {

        velocity = distance / time;

    }
    
    public static void displaySplashPage() {
        System.out.println("THIS PROGRAM...");
    }
    
    public static void displayResults() {
        System.out.println("The Velocity is: " + velocity );
    }
    
    public static void getInput() {
        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Enter Distance:");
        distance = input.nextDouble();
        System.out.print("Enter Time:");
        time = input.nextDouble();
        
    }
    
    

    public static void main(String[] args) {

        displaySplashPage();
        getInput();
        toVelocity();
        displayResults();
                      
    }

}
