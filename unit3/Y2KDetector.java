/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u3;
import java.util.Scanner;


/**
 *
 * @author chiadika
 */
public class Y2KDetector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        int currentYear, yearOfBirth, age;
        
        //OBJECTS
        Scanner input = new Scanner(System.in);
        
        // INPUT
        System.out.println("Input the last 2 digits of your birth year");
        yearOfBirth = input.nextInt();
        System.out.println("Input the last 2 digits of the current year");
        currentYear = input.nextInt();

        
        // PROCESSING
        if ( yearOfBirth > currentYear ) {
            
            age = ( currentYear + 2000 ) - ( yearOfBirth + 1900 );
            System.out.println("Age: " + age);
        }
       
        else if ( yearOfBirth < currentYear){
            age = currentYear - yearOfBirth;
            System.out.println("You are " + age + "years old");
        }
        
    }
    
}
