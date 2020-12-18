/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class BubbleSortNew {

    static int swapCount = 0, comparisions = 0;

    public static void main(String[] args) {
        int[] values = getRandom();
        displayOld(values);
        bubbleSort(values);
        int[] numbers = values;
        displayNew(numbers);

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


    public static void bubbleSort(int numbers[]) {
        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; i < numbers.length - 1; j++) {
                comparisions++;
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[j] = numbers[i];
                    numbers[j] = temp;
                    swapCount++;

                }
            }

        }

    }

    public static void displayNew(int[] numbers) {
        System.out.println(" ");
        System.out.println("AFTER SORTING");
        System.out.println(Arrays.toString(numbers));
        System.out.println("This sequence was swapped " + swapCount + " times and it was compared " + comparisions + " times");
    }
}
