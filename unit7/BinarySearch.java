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
public class BinarySearch {

    public static int swapCount = 0, comparisions = 0;

    public static void main(String[] args) {
        int[] values = getRandom();
        displayOld(values);
        selectionSort(values);
        int[] numbers = values;
        displayNew(numbers);
        binarySearch(numbers);
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
                int max = numbers[pass];
                comparisions++;

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

    public static int binarySearch(int[] numbers) {
        int randomSearchValue = (int) (Math.random() * 10) + 
                1;;
        int x = numbers[randomSearchValue];

        System.out.println(" ");
        System.out.println("you are searching for " + x);
        System.out.println(" ");

        int left = 0, right = numbers.length - 1, middle = 0;

        for (int i = 0; i < right; i++) {
            middle = (int) Math.floor((right - left) / 2) + left;
            
            while ( left <= right){
            
            if (numbers[middle] == x) {
                System.out.println("The number you are searching for is at index " + middle);
                return middle;
            } else if (x < numbers[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        }
        return -1;
        
    }
}

//        while (left <= right) {
//            if (numbers[middle] == x) {
//                System.out.println("The number you are searching for is at index " + middle);
//                return middle;
//            } else if (x < numbers[middle]) {
//                right = middle - 1;
//            } else {
//                left = middle + 1;
//            }
//        }
