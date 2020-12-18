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
public class StartEndFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int start, end;

       // INPUT AND OBJECTS
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start value: ");
        start = input.nextInt();
        System.out.print("Enter end value: ");
        end = input.nextInt();

        //PROCESSING/OUTPUT
        if (start <= end) {
            for (; start <= end; start++) {
                System.out.println(start);
            }
        } else if (start >= end) {
            for (; start >= end; start--) {
                System.out.println(start);
            }
        }
    }

}
