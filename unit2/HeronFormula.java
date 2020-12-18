/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;

/**
 *
 * @author chiadika
 */
public class HeronFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // ASSIGN VARIABLES 
        double a, b, c, A;
        final double S;
        a = 5;
        b = 8;
        c = 7;
        S = ((a + b + c) / 2);
        
        // EQN
       A = (Math.sqrt (S * (S - a) * (S - b) * (S -c)));
        System.out.println("The area of the triangle when the sides are " 
                + a + ", " + b + " and " + c + " is " + A);
    }
    
}
