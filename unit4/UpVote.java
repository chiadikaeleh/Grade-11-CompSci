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
public class UpVote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARRIABLES
        int rows;
        String a = "#";
        
        // OBJECTS/INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = input.nextInt();
        StringBuilder sb = new StringBuilder();
        
        //PROCESSING/OUTPUT
        if ( rows <= 15){
            
        for (int i = 0 ; i < rows ; i++) {
        
            a += "#"; 
            
        System.out.println(" " + a );
    }
        }
        System.out.println(" ##");
        System.out.println(" ##");
    }
    
}