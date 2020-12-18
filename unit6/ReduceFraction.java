/*
 * Name: Chiadika Eleh
 * Date: May 21st, 2019
 * Version: v1.00
 * Description:
 * This program will ouput the reduced version of a fraction 
 */
package edu.hdsb.gwss.chiadika.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1elehchi4
 */
public class ReduceFraction {

    public static void displaySplashPage() {
        System.out.println("------------------");
        System.out.println("REDUCE FRACTION!");
        System.out.println("------------------");
        System.out.println("THIS PROGRAM WILL FIND THE SIMPLIFIED FRACTION");
        System.out.println("");
    }

    public static void getInput() throws FileNotFoundException {
        File file = new File("FractionInput.txt");                                  // read from file
        Scanner input = new Scanner(file);

        File outputFile = new File("FractionOutput.txt");                           // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        while (input.hasNext()) {

            String number = input.nextLine();

            if (!number.contains("/")) {
                output.println("Invalid");
            } else {
                StringTokenizer st = new StringTokenizer(number, "/");              // tokenization
                int num = Integer.parseInt(st.nextToken());
                int denum = Integer.parseInt(st.nextToken());

                output.println(reduceFraction(num, denum));

            }
        }
        input.close();
        output.close();
        readOutput(outputFile);
    }

    public static void readOutput(File outputFile) throws FileNotFoundException {
        Scanner readOutput = new Scanner(outputFile);

        while (readOutput.hasNext()) {
            System.out.println(readOutput.nextLine());
        }
        readOutput.close();
    }

    public static String reduceFraction(int num, int denum) {

        int newNum = 0, newDenum = 0, gcd;
        String newFrac = "";
        gcd = gcd(num, denum);

        if (denum == 0) {                                                           // checks validity of denum
            return ("UNDEFINED");
        } else {
            if (gcd != 0) {
                newNum = num / gcd;
                newDenum = denum / gcd;
            } else {
                newNum = num;
                newDenum = denum;
            }
        }
        if (newDenum == 1 || newDenum == - 1 || newDenum == 0) {

            if (newDenum == 1 || newDenum == 0) {
                newFrac = Integer.toString(newNum);
            } else {
                newFrac = Integer.toString(-newNum);
            }
        } else if (newDenum < 0) {                                                  // if denum is larger than 0
            newFrac = Integer.toString(-newNum) + "/"
                    + Integer.toString(Math.abs(newDenum));
        } else if (newDenum < 0 && newNum < 0) {
            newFrac = Integer.toString(Math.abs(newNum)) + "/"
                    + Integer.toString(Math.abs(newDenum));

        } else if (newNum == 0) {                                                   // is num is 0
            newFrac = Integer.toString(newNum);

        } else {                                                                    // normal case
            newFrac = Integer.toString(newNum) + "/" + Integer.toString(newDenum);
        }

        return newFrac;
    }

    public static int gcd(int num, int denum) {
        int gcd = 0;

        for (int i = 2; i <= Math.abs(Math.min(num, denum)); i++) {                 // finds gcf

            if (num % i == 0 && denum % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) throws FileNotFoundException {
        displaySplashPage();
        getInput();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //
