/*
 * Name: Chiadika Eleh
 * Date: April 11th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate how many times one can add the half of a number
 * (starting from 1) before the answer reaches 2. 
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

/**
 *
 * @author chiadika
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        long denominator = 1;
        double answer = 0;

        //PROCESSING
        while (answer < 2) {
            System.out.println(answer + " + 1/" + denominator + " = " + (answer += 1.0 / denominator));
            denominator *= 2;
        }
    }

}
