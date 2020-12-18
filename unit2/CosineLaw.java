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
public class CosineLaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // ASSIGN VARIABLES
        double a, b, c, C;
        a = 10;
        b = 15;
        C = (Math.toRadians (45));
        
        // EQN
        c = ( Math.sqrt ( Math.pow ( a , 2 ) + ( Math.pow (b , 2 )) - (( 2 * a * b) * ( Math.cos(C)))));
        c = (Math.ceil (c));
      
        System.out.println("The length of side c, when a is " + a + " and side be is " + b + " is " + c);
    }
    
}
