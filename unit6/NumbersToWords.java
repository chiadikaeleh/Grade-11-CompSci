/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1elehchi4
 */
public class NumbersToWords {

    static int number;
    static int digit;
    static String numberWord = "";

    public static void displaySplashPage() {
        System.out.println("THIS PROGRAM WILL CHANGE THE NUMBER FORM OF A "
                + "NUMBER INTO THE WORD FORM!");
        System.out.println("");
    }

    public static void getInput() {
        // OBJECTS
        Scanner input = new Scanner(System.in);

        // INPUT
        while (number > 99 || number < 10) {

            System.out.print("Enter Number: ");
            number = input.nextInt();

            // INVALID MESSAGE
            if (number > 99 || number < 10) {
                System.out.println("Invalid Entry");
            }
        }
    }

    public static void displayResults() {
        System.out.println("");
        System.out.println("The Word Version of the Inputted "
                + "Number is: " + numberWord);
    }

    public static void calculations() {

        digit = number / 10 % 10;
        if (digit == 1) {
            digit = number % 10;
            teens();
        } else {
            tens();
            digit = number % 10;
            ones();
        }
    }

    public static void teens() {
        switch (digit) {
            case 0:
                numberWord = "TEN";
                break;
            case 1:
                numberWord = "ELEVEN";
                break;
            case 2:
                numberWord = "TWELVE";
                break;
            case 3:
                numberWord = "THIRTEEN";
                break;
            case 4:
                numberWord = "FOURTEEN";
                break;
            case 5:
                numberWord = "FIFTEEN";
                break;
            case 6:
                numberWord = "SIXTEEN";
                break;
            case 7:
                numberWord = "SEVENTEEN";
                break;
            case 8:
                numberWord = "EIGHTEEN";
                break;
            case 9:
                numberWord = "NINENTEEN";
                break;
        }
    }

    public static void tens() {
        switch (digit) {
            case 2:
                numberWord = "TWENTY";
                break;
            case 3:
                numberWord = "THIRTY";
                break;
            case 4:
                numberWord = "FOURTY";
                break;
            case 5:
                numberWord = "FIFTY";
                break;
            case 6:
                numberWord = "SIXTY";
                break;
            case 7:
                numberWord = "SEVENTY";
                break;
            case 8:
                numberWord = "EIGHTY";
                break;
            case 9:
                numberWord = "NINENTY";
                break;
        }
    }

    public static void ones() {
        switch (digit) {
            case 0:
                numberWord += "";
                break;
            case 1:
                numberWord += " ONE";
                break;
            case 2:
                numberWord += " TWO";
                break;
            case 3:
                numberWord += " THREE";
                break;
            case 4:
                numberWord += " FOUR";
                break;
            case 5:
                numberWord += " FIVE";
                break;
            case 6:
                numberWord += " SIX";
                break;
            case 7:
                numberWord += " SEVEN";
                break;
            case 8:
                numberWord += " EIGHT";
                break;
            case 9:
                numberWord += " NINE";
                break;
        }
    }

    public static void main(String[] args) {

        displaySplashPage();
        getInput();
        calculations();
        displayResults();

//                                                                          digit = number / 100;
//                                                                          if( digit > 0 ) {
//                                                                          //hundreds();  --> "ones() + " HUNDRED"
//                                                                            }
//        
    }

}
