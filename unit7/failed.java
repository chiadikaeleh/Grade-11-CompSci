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
public class failed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] data = {
            { 1, 2, 2}
            
        };

        int min = data[0][0];
        int secondMin, counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] < min) {
                    int newMin = data[i][j];
                    if (data[i][j] == newMin) {
                        counter++;
                    }

                    if (counter < 2) {
                        while (data[i][j] != newMin) {
                            if (data[i][j] < min) {
                                min = data[i][j];
                            }
                        }
                    } else {
                        min = newMin;
                    }
                }
            }
        }
        System.out.println(min);

    }

}
