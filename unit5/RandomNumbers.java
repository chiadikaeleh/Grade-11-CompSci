/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author chiadika
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here


        File file = new File("output.txt");
                Scanner input = new Scanner( file );

        PrintWriter output = new PrintWriter(file);

        // Write Data 
        for (int i = 0; i <= 100; i++) {
            int num = (int) (Math.random() * 100) + 1;
            output.println(num);

        }

        // Close File
        output.close();

        while (input.hasNext()) {
            output.println(input.nextLine());
        }

        // Close File
        input.close();
    }

}
