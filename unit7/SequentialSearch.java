/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Arrays;

/**
 *
 * @author chiadika
 */
public class SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = getRandom();
        displayOld(values);
        search(values);

    }

    public static int[] getRandom() {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = (int) (Math.random() * 1000) + 1;
        }
        return numbers;
    }

    public static void displayOld(int values[]) {

        System.out.println("BEFORE SORTING:");
        System.out.println(Arrays.toString(values));
    }

    

    public static void search(int numbers[]) {
        int randomSearchValue = (int) (Math.random() * 10) + 1;;
        int x = numbers[randomSearchValue];

        System.out.println(" ");
        System.out.println("you are searching for " + x);
        System.out.println(" ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("the value is at index " + i);
            }
        }

    }

}
