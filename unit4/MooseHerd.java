/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

/**
 *
 * @author chiadika
 */
public class MooseHerd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int t, popHit = -1;
        double a = 0.83, N;

        //PROCESSING/OUTPUT
        System.out.format("%-6s | %12s\n", "Years", "Population");

        for (t = 0; t <= 25; t++) {
            N = 220 / (1 + (10 * Math.pow(a, t)));
            System.out.format("%-6s | %12s\n", t, Math.round(N));

            if (N >= 80 && popHit == -1) {
                popHit = t;
            }

        }

        System.out.println("The moose has to be supervised for " + popHit + " years.");
    }
}
