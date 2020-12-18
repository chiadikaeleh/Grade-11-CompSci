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
public class Unit3Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS
        // VARIABLES
        int a = 3, b = 5, c = 8;
String menuChoice;
        
        // ONJECTS
        Scanner input = new Scanner(System.in);
        
        // iNPUT
        // RELATIONAL OPERATORS
        System.out.println(a > b); // false 
        System.out.println(a == c);
        System.out.println(c < a);
        System.out.println(b == 5);

        // LOGICAL OPERATORS
        boolean t = true, r = false, d = false;
        System.out.println("-------------------------");
        System.out.println(t || r || d);  // true
        System.out.println(!(t && r && d)); // true
        System.out.println(r && d); // false
        System.out.println(t ^ d); // true
        System.out.println(d ^ r); // false

        // IF STRUCTURE
        if (a == 2) { // nothing prints
            System.out.println("--------------------");
            System.out.println("radius");
        }
        if (a + b < 14) { // yes should print
            System.out.println("--------------------");
            System.out.println("yes");
        }

        // IF ELSE STRUCTURE
        if (a == 2) { // no one cares should print
            System.out.println("wig");
        } else {
            System.out.println("------------------");
            System.out.println(" no one cares!");

        }

        // ELSE IF STRUCTURE
        if (a == 45) {
            System.out.println("no");
        } else if (b + 4 == 3434) {
            System.out.println(" no x 2");
        } else if (b * a > 877) {
            System.out.println(" this is right");
        } else {
            System.out.println("---------------------");
        }
        System.out.println("yall dumb");

        // NESTED IF STRUCTURE
        if (a == 3) {
            if (b + 3 == 8) {
                System.out.println("---------------------");
                System.out.println("idk the name");
                if (b + a > 8) {
                    System.out.println("yes");
                }
            }
        }
        
        // SWITCH
        System.out.println(" ");
        System.out.println("Enter the menu choice");
        menuChoice = input.nextLine();
        
        switch ( menuChoice ){
            case "metric":
                System.out.println(" who knows");
                break;
            case "idk":
                System.out.println(" why?");
                break;
            case "not me":
                System.out.println("not you?");
                break;
            default:
                System.out.println("please try again.");
            
        }

    }

}
