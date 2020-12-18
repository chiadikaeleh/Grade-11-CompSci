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
public class findSecondMIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] data = {
            {1, 2, 2}
        };

        int min = data[0][0], newMin = 0, printMin = 0;
        int secondMin = data[0][0], counter = 0;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    newMin = data[i][j];
                }

            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == newMin) {
                    counter++;
                }
                if (counter == 2) {
                    printMin = newMin;
                } else {
                    if (secondMin != newMin) {
                        if (data[i][j] < secondMin) {
                            secondMin = data[i][j];
                            printMin = secondMin;
                            // System.out.println(secondMin);
                        }
                    }
                }

            }
        }
        System.out.println(printMin);

    }
}
