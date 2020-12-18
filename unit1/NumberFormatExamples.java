/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u1;

import java.text.NumberFormat;

/**
 *
 * @author chiadika
 */
public class NumberFormatExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Money (localized)
        NumberFormat money = NumberFormat.getCurrencyInstance();
        double dollars = 21.5;
        System.out.println(money.format(dollars));

        // Number (localized)
        NumberFormat number = NumberFormat.getIntegerInstance();
        int num = 123445678;
        System.out.println(number.format(num));

        // Percent (localized)
        NumberFormat percent = NumberFormat.getPercentInstance();
        double sale = .15;
        System.out.println(percent.format(sale));

        // Decimal (localized)
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(3);
        decimal.setMaximumFractionDigits(3);
        double numWithDecimal = 2.0 / 3.0;
        System.out.println(decimal.format(numWithDecimal));
        
    }
    
}
