/*
 * Name: Chiadika Eleh
 * Date: April 11th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate the amount of years it will take for Canada's soil 
 * to be reduced to 10cm (a level at which crops cannot grow). 
 */
package edu.hdsb.gwss.chiadika.ics3u.u4;

/**
 *
 * @author chiadika
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES
        double soil = 30;
                int year = 0;

        // CONSTANTS
                final double YEARLY_GROWTH = 2.5/400;

        // SPLASH PAGE:
        System.out.println("TOPSOIL EROSION:");
        System.out.println("-----------------------------------------------"
                + "-----------------------------");
                System.out.println("");
        System.out.println("Careless land management causes approximately 1.25% of "
                + "the topsoil to erode each year.");
        System.out.println("It is then lost forever since it takes nature "
                + "approximately 400 years to produce 2.5cm");
        System.out.println("of topsoil. At 10cm, the topsoil is so shallow the "
                + "crops cannot grow on a large scale. ");
        System.out.println("If Canada has about 30cm of topsoil, how many years "
                + "will it take for the depths to be");
        System.out.println("reduced to 10cm?");
        
        // PROCESSING
        while(soil > 10){     
            soil -= 0.0125 * soil;
            soil += YEARLY_GROWTH;
            year++;
        }
        
        // OUTPUT
        System.out.println(" ");
        System.out.println("RESULT:");
        System.out.println(" ");
        System.out.println("It will take " + year + " years for the soil to erode to a depth such that crops will not grow.");
    }
    
}
