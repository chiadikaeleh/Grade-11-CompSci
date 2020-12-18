
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author chiadika
 */
public class Unit2Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(3);
                decimal.setMinimumFractionDigits(4);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double currency = 21.5;
        System.out.println("the money is " + money.format(currency));
        System.out.println("the number is" + decimal.format(radius));
        System.out.format("%-10s %8s %8s\n", "Teams", "Losses", "GB");
        System.out.format("%-10s %8s %8.3f\n", "Jaguars", "5", 6.654);
        System.out.format("%-10s %8s %8.4f\n", "Cheetahs", "8", 7.0987654);



    }
    
}
