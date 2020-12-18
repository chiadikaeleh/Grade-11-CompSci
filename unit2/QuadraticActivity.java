/*
 * Name: Chiadika Eleh
 * Date: Feb 28 2019
 * Description: 
 * to find x values for 3x2 - 8X + 4
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;

/**
 *
 * @author chiadika
 */
public class QuadraticActivity {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // DECLARE VARIABLES
        double x, ans;
        
        // ASSIGN VALUES
        x = 4.0;
        
        // EQN 3x2 - 8X + 4
        ans = 3 * (Math.pow( x, 2.0 )) - ( 8 * x ) + 4;
        
        System.out.println("At x = to " + x + " the answer is " + ans);
        
        x = 0.0;
        ans = 3 * (Math.pow( x, 2.0 )) - ( 8 * x ) + 4;
        System.out.println("At x = to " + x + " the answer is " + ans);
        
        x = 2.0;
        ans = 3 * (Math.pow( x, 2.0 )) - ( 8 * x ) + 4;
        System.out.println("At x = to " + x + " the answer is " + ans);
        
        x = 2.0/3;
        ans = 3 * (Math.pow( x, 2.0 )) - ( 8 * x ) + 4;
        System.out.println("At x = to " + x + " the answer is " + ans);

         // Question 6
          double miles, kilometers;
          miles = 100;
          final double KILOMETERS_PER_MILE;
          KILOMETERS_PER_MILE = 1.609;
          kilometers = miles * KILOMETERS_PER_MILE;
          System.out.println( miles + " miles is " + kilometers + " kilometers " + 
                  " when the conversion ratio is " + KILOMETERS_PER_MILE );
    }
    
    
    
}
