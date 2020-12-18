/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

/**
 *
 * @author chiadika
 */
public class MaxMinArrayValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] data = {
            {2, 3, 9, 5},
            {7, -3, 5},
            {-1, 5, 12, 13, 14},
            {1, 0, 0, 15}
        };
        int max = data[0][0];
        int min = data[0][0];

        for (int i = 0; i <= data.length - 1; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (max < data[i][j]) {
                    max = data[i][j];
                }
                if (min > data[i][j]) {
                    min = data[i][j];

                }
            }
        }
        
        System.out.println("the minimum value is " + min + " and the maximum value is " + max);

    }

}
