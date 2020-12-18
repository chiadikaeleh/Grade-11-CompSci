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
 * @author chiadika
 */
public class NumberToWordsGood {

    static int number;
    static String numberWord;

    public static void displaySplashPage() {
        System.out.println("----------------------");
        System.out.println("NUMBER TO WORDS");
        System.out.println("-----------------------");
        System.out.println("THIS PROGRAM WILL CHANGE THE NUMBER FORM OF A "
                + "NUMBER INTO THE WORD FORM!");
        System.out.println("");
    }

    public static void getInput() {                                                 // gets input and checks validity
        Scanner input = new Scanner(System.in);

        while (number > 999 || number < 1) {
            System.out.print("Enter Number: ");
            number = input.nextInt();
            if (number > 999 || number < 1) {
                System.out.println("Invalid.");
            }
        }
    }

    public static void displayResults() {
        System.out.println("");
        System.out.print("The Word Version of the Inputted "
                + "Number is: " + numberWord);
    }

    public static void calculations() {                                             // checks cases for diff portions of a #
        numberWord = "";
        switch (number / 100) {

            case 0:
                break;
            case 1:
                numberWord += "ONE HUNDRED ";
                break;
            case 2:
                numberWord += "TWO HUNDRED ";
                break;
            case 3:
                numberWord += "THREE HUNDRED ";
                break;
            case 4:
                numberWord += "FOUR HUNDRED ";
                break;
            case 5:
                numberWord += "FIVE HUNDRED ";
                break;
            case 6:
                numberWord += "SIX HUNDRED ";
                break;
            case 7:
                numberWord += "SEVEN HUNDRED ";
                break;
            case 8:
                numberWord += "EIGHT HUNDRED ";
                break;
            case 9:
                numberWord += "NINE HUNDRED ";
                break;
        }

        switch (number / 10 % 10) {                                                 

            case 0:
                break;
            case 1:
                switch (number % 100) {

                    case 10:
                        numberWord += "TEN ";
                        break;
                    case 11:
                        numberWord += "ELEVEN ";
                        break;
                    case 12:
                        numberWord += "TWELVE ";
                        break;
                    case 13:
                        numberWord += "THIRTEEN ";
                        break;
                    case 14:
                        numberWord += "FOURTEEN ";
                        break;
                    case 15:
                        numberWord += "FIFTEEN ";
                        break;
                    case 16:
                        numberWord += "SIXTEEN ";
                        break;
                    case 17:
                        numberWord += "SEVENTEEN ";
                        break;
                    case 18:
                        numberWord += "EIGHTEEN ";
                        break;
                    case 19:
                        numberWord += "NINETEEN ";
                        break;
                }
                break;
            case 2:
                numberWord += "TWENTY ";
                break;
            case 3:
                numberWord += "THIRTY ";
                break;
            case 4:
                numberWord += "FOURTY ";
                break;
            case 5:
                numberWord += "FIFTY ";
                break;
            case 6:
                numberWord += "SIXTY ";
                break;
            case 7:
                numberWord += "SEVENTY ";
                break;
            case 8:
                numberWord += "EIGHTY ";
                break;
            case 9:
                numberWord += "NINETY ";
                break;
        }

        if (!(number / 10 % 10 == 1)) {
            switch (number % 10) {
                case 0:
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
    }

    public static void main(String[] args) {
        displaySplashPage();
        getInput();
        calculations();
        displayResults();
    }

}
