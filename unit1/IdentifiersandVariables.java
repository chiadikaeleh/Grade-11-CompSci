/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.chiadika.ics3u.u1;

/**
 *
 * @author chiadika
 */
public class IdentifiersandVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //assignment statements
        int x = 24;
        int y = 4;
        double a = x;
        double b = y;
        int z = 5;
       
        // math 
        // % means you take a number and you divide it by another number eg
        // 13 divided by 4 is 3 remainder 1, so the answer is 1
        // when you hit the 5th thing the remainder is 0, so it loops every 5
        int ans = x + y;
        System.out.println( ans );
        
        ans = x - y;
        System.out.println( ans );
        
        ans = x * y;
        System.out.println( ans );
        
        ans = y % x;
        System.out.println( ans );
        
        // decimal math
        ans = y / x;
        System.out.println( ans);
            // this wont work because its truncated
        
        x = (int) a; // if a is 2.99 it will be truncated to 2 (this is telling the computer that it is okay to truncate a double)
        y = (int) b; // if b is 1.01 it will be truncated to 1
        
        ans = x- y + y*z; // java knows bedmas
        System.out.println( ans );
        
        // to get x divided by (y times z)
        ans = x / (y * z);
        System.out.println( ans );
     
        // all calculator work is stored in library called math System.out.println( Math. )
     
        System.out.println( Math.sqrt(x)); //square root and it will give u a double
      // to get int
        System.out.println( (int) Math.sqrt (x));
        // absolute means always positive
        System.out.println( Math.abs ( -4));
        System.out.println( Math.abs (4));
        //to round a number 
        System.out.println( Math.round (3.14)); // will give you 3 not 3.0 and it follows standard rounding rules
        
        // 21 people and each car fits 4
        System.out.println( 21 / 4 ); // rounds down
        System.out.println( 21.0 / 4 ); // gives decimals 
        System.out.println( Math.ceil (21.0 / 4)); // ceil rounds up
        
        //101 people, and the plane holds 100
        System.out.println( Math.floor ( 101/100 )); // floor rounds down
        
        // a test question 
        System.out.println( Math.ceil ( -4.05)); // this answer is -4 because its rounded up
        
        // power to
        System.out.println( Math.pow ( 2, 5)); // means 2 to the power of 5
        
        //sine 
        System.out.println( Math.sin ( 30 )); // calculator will give u 0.5 but java is doing 30 radians
        //radians
        System.out.println( Math.sin ( Math.toRadians (30)));
        
        //random
        
    }
    
}
