/*
 * Name: Chiadika Eleh
 * Date: May 21st, 2019
 * Version: v1.00
 * Description:
 * This program will output the word version of a number 
 */
package edu.hdsb.gwss.chiadika.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1elehchi4
 */
public class NumbersToWords2 {

    static int number, digit;
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
        while (number > 999 || number < 1) {

            System.out.print("Enter Number: ");
            number = input.nextInt();

            // INVALID MESSAGE
            if (number > 999 || number < 1) {
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

        digit = number / 100;
        if (digit >= 1) {
            hundreds();
            digit = number / 10 % 10;
            if (digit == 1) {
                numberWord += " ";
                digit = number % 10;
                teens();

            } else {
                numberWord += " ";
                tens();
                numberWord += " ";
                digit = number % 10;
                ones();
            }
        } else if (digit > 0 || digit < 1) {

            digit = number / 10 % 10;
            if (digit == 1) {
                digit = number % 10;
                teens();
            } else {
                tens();
                numberWord += " ";
                digit = number % 10;
                ones();
            }

        } else {
            ones();
        }
    }

    public static void hundreds() {
        switch (digit) {
            case 1:
                numberWord = "ONE HUNDRED";
                break;
            case 2:
                numberWord = "TWO HUNDRED";
                break;
            case 3:
                numberWord = "THREE HUNDRED";
                break;
            case 4:
                numberWord = "FOUR HUNDRED";
                break;
            case 5:
                numberWord = "FIVE HUNDRED";
                break;
            case 6:
                numberWord = "SIX HUNDRED";
                break;
            case 7:
                numberWord = "SEVEN HUNDRED";
                break;
            case 8:
                numberWord = "EIGHT HUNDRED";
                break;
            case 9:
                numberWord = "NINE HUNDRED";
                break;
        }
    }

    public static void teens() {
        switch (digit) {
            case 0:
                numberWord += "TEN";
                break;
            case 1:
                numberWord += "ELEVEN";
                break;
            case 2:
                numberWord += "TWELVE";
                break;
            case 3:
                numberWord += "THIRTEEN";
                break;
            case 4:
                numberWord += "FOURTEEN";
                break;
            case 5:
                numberWord += "FIFTEEN";
                break;
            case 6:
                numberWord += "SIXTEEN";
                break;
            case 7:
                numberWord += "SEVENTEEN";
                break;
            case 8:
                numberWord += "EIGHTEEN";
                break;
            case 9:
                numberWord += "NINENTEEN";
                break;
        }
    }

    public static void tens() {
        switch (digit) {
            case 2:
                numberWord += "TWENTY";
                break;
            case 3:
                numberWord += "THIRTY";
                break;
            case 4:
                numberWord += "FOURTY";
                break;
            case 5:
                numberWord += "FIFTY";
                break;
            case 6:
                numberWord += "SIXTY";
                break;
            case 7:
                numberWord += "SEVENTY";
                break;
            case 8:
                numberWord += "EIGHTY";
                break;
            case 9:
                numberWord += "NINENTY";
                break;
        }
    }

    public static void ones() {
        switch (digit) {
            case 0:
                numberWord += "";
                break;
            case 1:
                numberWord += "ONE";
                break;
            case 2:
                numberWord += "TWO";
                break;
            case 3:
                numberWord += "THREE";
                break;
            case 4:
                numberWord += "FOUR";
                break;
            case 5:
                numberWord += "FIVE";
                break;
            case 6:
                numberWord += "SIX";
                break;
            case 7:
                numberWord += "SEVEN";
                break;
            case 8:
                numberWord += "EIGHT";
                break;
            case 9:
                numberWord += "NINE";
                break;
        }
    }

    public static void main(String[] args) {
        displaySplashPage();
        getInput();
        calculations();
        displayResults();
    }
}
