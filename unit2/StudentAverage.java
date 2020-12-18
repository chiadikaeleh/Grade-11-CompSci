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
public class StudentAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONSTANTS 
        
        //VARIABLE
        double subject1, subject2, subject3, subject4, avgMark;
        String yourName;
        
        //OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        //SPLASH
        System.out.println("This is a program to calculate your average in");
        System.out.println("4 subjects");
        System.out.println("It will require that you enter your score for each");
        System.out.println("subject in percentage form.");
        System.out.println("Please enter your name:");
        yourName = input.nextLine();
        System.out.println("Please enter your mark for Subject 1:");
        subject1 = input.nextDouble();
        System.out.println("Please enter your mark for Subject 2:");
        subject2 = input.nextDouble();
        System.out.println("Please enter your mark for Subject 3:");
        subject3 = input.nextDouble();
        System.out.println("Please enter your mark for Subject 4:");
        subject4 = input.nextDouble();
        
        //PROCESS
        avgMark = (subject1 + subject2 + subject3 + subject4) / 4;
        
        //OUTPUT
        System.out.println("Therefore, " + yourName + ", your average mark in 4");
        System.out.println("subjects was " + percent.format(avgMark));
    }
    
}
