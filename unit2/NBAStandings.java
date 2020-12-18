/*
 ** Name: Chiadika Eleh
 * Date: Feb 25, 2018
 * Version: v0.01
 * Description: 
 * Activity for NBA Standings
 */
package edu.hdsb.gwss.chiadika.ics3u.u2;

/**
 *
 * @author chiadika
 */
public class NBAStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // title
        System.out.println("EASTERN CONFERENCE");
        //header of table
        System.out.println("-----------------------------------------------------");
        //CLASS PRACTICE
        //% means colum, # means how big the colums, s means spaces, 
        //"-" means left justified, "6.3" means 6 spaces with 3 decimals
        //HEADER
        System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", " ", "Team", "W", "L","pct", "GB");
         //beginning of teams
System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", "1. ", "Miluwakee Bucks", "43", "14",".754", "-");
System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", "2. ", "Toronto Raptors", "43", "16",".729", "1.0");
System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", "3. ", "Indiana Pacers", "38", "20",".655", "5.5");
System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", "4. ", "Boston Celtics", "37", "21",".638", "6.5");
System.out.format(
                "%-3s | %-20s | %-4s | %-4s | %-6s | %-4s |\n", "1. ", "Philadelphia 76ers", "37", "21",".638", "6.5");

 
// HOME WORK
System.out.println("EASTERN CONFERENCE");
        System.out.println("Team \t\t\t  W \t L \t  Pct \t GB");
        System.out.println("1. Miluwakee Bucks \t 43 \t 14 \t .754 \t  -");
        System.out.println("-----------------------------------------------------");
        System.out.println("2. Toronto Raptors \t 43 \t 16 \t .729 \t 1.0");
        System.out.println("-----------------------------------------------------");
        System.out.println("3. Indiana Pacers \t 38 \t 20 \t .655 \t 5.5");
        System.out.println("-----------------------------------------------------");
        System.out.println("4. Boston Celtics \t 37 \t 21 \t .638 \t 6.5");
        System.out.println("-----------------------------------------------------");
        System.out.println("5. Philadelphia 76ers \t 37 \t 21 \t .638 \t 6.5");
        //ending of teams
        //beginning of class practice
    }

}
