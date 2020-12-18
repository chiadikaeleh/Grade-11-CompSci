/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;
import java.util.Scanner;
/**
 *
 * @author chiadika
 */
public class ISBNChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //CONSTANT
        final double A = 9*1 + 7*3 + 8*1 + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3;
        
        //VARIABLE
        int digit11, digit12, digit13, sum;
        String bookName;
        
        //OBJECTS
        Scanner input = new Scanner(System.in);
        
        //SPLSH
        System.out.println("This is a program that will output the 1-3 sum");
        System.out.println("of an ISBN number.");
        System.out.println("It will require that you enter the last 3 digits of");
        System.out.println("the ISBN number.");
        System.out.println("Please Enter:");
        System.out.println("The book name:");
        bookName = input.nextLine();
        System.out.println("Digit 11:");
        digit11 = input.nextInt();
        System.out.println("Digit 12:");
        digit12 = input.nextInt();
        System.out.println("Digit 13");
        digit13 = input.nextInt();

        //PROCESS
        sum = ((digit11 *1) + (digit12 * 3) + (digit13 * 1) + (int) A);
        
        //OUTPUT
        System.out.println("Therfore for \"" + bookName + "\", the 1-3 sum is");
        System.out.println( sum );
    }
    
}
