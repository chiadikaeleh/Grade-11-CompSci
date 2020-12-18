/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        // VARIABLES
        int startValue, endValue;

        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Enter Start Value:");
        startValue = input.nextInt();
        System.out.print("Enter End Value:");
        endValue = input.nextInt();

        // PROCESSING/OUTPUT
        while (startValue <= endValue) {
            System.out.println( startValue );
            startValue += 1;
      }
        
        while (startValue >= endValue) {
            System.out.println( startValue );
            startValue -= 1;
      }
        
        
    }

}
