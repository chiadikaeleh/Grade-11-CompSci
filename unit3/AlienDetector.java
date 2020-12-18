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
public class AlienDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIBLES
        int eyes, antenna;
        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        System.out.print("Enter the number of eyes seen: ");
        eyes = input.nextInt();
        System.out.print("Enter the number of antenna seen: ");
        antenna = input.nextInt();
        System.out.println("");

        // PROCESSING
        if (antenna >= 3 && eyes <= 4) {
            System.out.println("Troy Martian");
        }

        if (antenna <= 6 && eyes >= 2) {
            System.out.println("Vlad Saturian");
        }

        if (antenna <= 2 && eyes <= 3) {
            System.out.println("Graeme Mercurian");
        } else {
            System.out.println("Data provided is invalid");
        }
    }

}
