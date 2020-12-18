/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class StartEndStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int end, start;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Start Value: ");
        start = input.nextInt();
        System.out.print("Enter the End Value: ");
        end = input.nextInt();
        System.out.println("");
        System.out.println("START");

//        if (start < end) {
//            do {
//                System.out.println(start);
//                start += 1;
//            } while (start <= end);
//        } else {
//            do {
//                System.out.println(start);
//                start -= 1;
//            } while (start >= end);
//        }
        if (start < end) {
            for (; start <= end; start++) {
                System.out.println(start);
            }
        } else {
            for (; start >= end; start--) {
                System.out.println(start);
            }
        }

    }

}
