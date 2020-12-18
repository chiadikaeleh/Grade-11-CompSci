/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Arrays;

/**
 *
 * @author 1elehchi4
 */
public class SelectionSort {

    static int swapCount = 0, comparisions = 0;

    public static void main(String[] args) {
        int[] values = getRandom();
        displayOld(values);
        selectionSort(values);
        int[] numbers = values;
        displayNew(numbers);
    }

    public static int[] getRandom() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000) + 1;
        }
        return numbers;
    }

    public static void displayOld(int values[]) {

        System.out.println("BEFORE SORTING:");
        System.out.println(Arrays.toString(values));
    }

    public static void selectionSort(int numbers[]) {

        int temp = 0;

        for (int pass = 0; pass < numbers.length; pass++) {

            for (int j = pass + 1; j < numbers.length; j++) {
                comparisions++;

                int max = numbers[pass];

                if (numbers[pass] < numbers[j]) {
                    max = numbers[j];
                    swap(numbers, pass, j);
                } else {
                    max = numbers[pass];
                }
            }
        }

    }

    public static void swap(int[] numbers, int pass, int j) {
        int temp = 0;

        temp = numbers[pass];
        numbers[pass] = numbers[j];
        numbers[j] = temp;
        swapCount++;

    }

    public static void displayNew(int[] numbers) {
        System.out.println(" ");
        System.out.println("AFTER SORTING");
        System.out.println(Arrays.toString(numbers));
        System.out.println(" ");
        System.out.println("This sequence was swapped " + swapCount + " times and compared " + comparisions + " times.");
    }

}
