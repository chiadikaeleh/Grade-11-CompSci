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
public class PowerTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int table[][] = new int[10][5];

        for (int i = 0; i < 16; i++) {
            System.out.println(" ");

            table[i][0] = i + 1;
            for (int j = 0; j < 5; j++) {
                table[i][j] = j + 1;

                table[i][j] = (int) Math.pow(i, j);
                if (table[i][j] == table[0][0]) {
                    table[i][j] = 0;
                }

                System.out.print(table[i][j] + " ");

            }
        }

    }

}
