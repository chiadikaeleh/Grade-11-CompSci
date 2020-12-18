/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;

/**
 *
 * @author chiadika
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // ASSIGN VALUES
        int number, hundredsRmdr, hundredsAmnt, tensAmnt, tensRmdr, 
                onesAmnt, onesRmdr;
        final int HUNDREDS, TENS, ONES;
        number = 123;
        HUNDREDS = 100;
        TENS = 10;
        ONES = 1;
    
        // EQNS
        hundredsAmnt = number / HUNDREDS;
        hundredsRmdr = number % HUNDREDS;
        tensAmnt = hundredsRmdr / TENS;
        tensRmdr = hundredsRmdr % TENS;
        onesAmnt = tensRmdr / ONES;
        onesRmdr = tensRmdr % ONES; // not needed
        
        // OUTPUT
        System.out.println("Enter a Three Digit Number:" + number);
        System.out.println("-------------------------------");
        System.out.println("The Hundreds Place Digit : " + hundredsAmnt);
        System.out.println("The Tens Place Digit : " + tensAmnt);
        System.out.println("The Ones Place Digit : " + onesAmnt);
        
     
     
    }
    
}
