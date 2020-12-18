/*
 * Name: Chiadika Eleh
 * Date: Feb 28 2019
 * Description: to convert Celcius to Farenheit
 */
package edu.hdsb.gwss.chiadika.ics3u.u1;

/**
 *
 * @author chiadika
 */
import java.util.Scanner;

public class CelciusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // create a scanner object
       Scanner input = new Scanner(System.in);
       
       // prompt user to enter Celsius
        System.out.print("Enter three numbers:");
       
       // ASSIGN VALUES
        double c, ans;
        c = input.nextDouble(); 
        
        // EQN (c * 9/5) + 32
        ans = (c * 9.0 / 5) + 32;
        System.out.println( c + " Celcius is " + ans + " Fareneheit");
      

    }

}
