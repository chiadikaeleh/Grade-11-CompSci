/*
/** Chiadika Eleh
 * Feb 26 2018
 * Description:
 * Identifier Lesson
 */
package edu.hdsb.gwss.chiadika.ics3u.u1;

/**
 *
 * @author chiadika
 */
public class IdentifierLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    // bad identifier: lmgtfy good: middleInitial 
    // long identifiers are okay as long as it gives goos meanings 
    //identifiers must be descriptive and in camel style, first letter small all other capitalized eg whatDoYou
    
        
     //CONSTANTS identifiers are all UPPER CASE
      final double PI = 3.14;  // final makes it a constant
      final double GST_RATE = 0.13;
              // rules, no space (_ instead), cant start wtih a number, no weird symbols
        
      
    // VARIABLEs 
    //PRIMITIVE DATA TYPES
      //a blue word is a reserve word i
      //nt(eger) means # with nodecimals 
        int age = 15;
        // long is double the size of an int
        long realBigNumber = 123456;
        //double is a number with decimal
        double winningPercent = 0.5;
        //char means a single character
        char middleInitial = 'N';       // grey squigly means a varible is declared not used
        // boolean is true or false only
        boolean doYouLikeThisClass = false;
                // the equal sign makes it an assignment statement
    //NON PRIMITIVE DATA TYPES
      //a string
      String yourFirstName = "Chiadika";
      
    //DISPLAY OUTPUT
        System.out.println("Hello " + yourFirstName + "!");
        System.out.println("wow! " + age + " is so old!");
        System.out.println("What does " + middleInitial + "stand for?");
        System.out.println("Do you like this class " + doYouLikeThisClass);
        
        
    }
    
}
