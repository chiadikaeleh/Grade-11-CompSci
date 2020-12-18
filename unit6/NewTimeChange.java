/*
 * Name: Chiadika Eleh
 * Date: May 21st, 2019
 * Version: v1.00
 * Description:
 * This program will output the standard/traditional version of a given time 
 */
package edu.hdsb.gwss.chiadika.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author chiadika
 */
public class NewTimeChange {

    public static void main(String[] args) throws FileNotFoundException {
        displaySplashPage();
        getInput();
    }

    public static void displaySplashPage() {
        System.out.println("------------------");
        System.out.println("TIME CHANGE!");
        System.out.println("------------------");
        System.out.println("THIS PROGRAM WILL DISPLAY INPUTTED TIME IN TRADITIONAL "
                + "FORM OR STANDARD FORM!");
        System.out.println("");
    }

    public static void getInput() throws FileNotFoundException {

        File file = new File("TimeInput.txt");                                      // reading and writing to a file
        Scanner input = new Scanner(file);

        File outputFile = new File("TimeOutput.txt");
        PrintWriter output = new PrintWriter(outputFile);

        
        while (input.hasNext()) {                                                   // while there is input

            String time = input.nextLine().toUpperCase();
            if (time.length() == 5) {
                output.println(convertToTraditional(time));
            } else if (time.length() == 8 || time.length() == 7) {
                output.println(convertToStandardTime(time));
            } else {
                output.println("invalid");
            }
        }
        input.close();
        output.close();
        readOutput(outputFile);
    }

    public static void readOutput(File outputFile) throws FileNotFoundException {
        Scanner readOutput = new Scanner(outputFile);

        while (readOutput.hasNext()) {
            System.out.println(readOutput.nextLine());
        }
        readOutput.close();
    }

    public static String convertToStandardTime(String time) {

        int hours, minute;
        String timeOfDay, timeWord = "", newMinutes = "", newHours = "";

        StringTokenizer workTime = new StringTokenizer(time, " ,:");                // tokenization
        hours = Integer.parseInt(workTime.nextToken());
        minute = Integer.parseInt(workTime.nextToken());
        timeOfDay = workTime.nextToken();

        if (hours > 12 || hours < 1 || minute > 59 || minute < 0) {                 // checks validity
            timeWord = "invalid";
        } else {
            if (hours < 10) {                                                       // adds 00s if needed
                newHours = "0" + hours;
            } else {
                newHours = "" + hours;
            }
            if (minute < 10) {
                newMinutes = "0" + minute;
            } else {
                newMinutes = "" + minute;
            }

            if (hours == 12) {                                                      // converts time
                if (timeOfDay.equals("AM")) {
                    timeWord = "00" + ":" + newMinutes;
                } else {
                    timeWord = "12" + ":" + newMinutes;
                }
            } else if (timeOfDay.equals("AM")) {
                timeWord = newHours + ":" + newMinutes;
            } else {
                timeWord = (Integer.parseInt(newHours) + 12) + ":" + newMinutes;
            }
        }
        return timeWord;
    }

    public static String convertToTraditional(String time) {

        int hours, minute;
        String timeWord = "", newMinutes = "";

        StringTokenizer workTime = new StringTokenizer(time, " ,:");                // tokenization
        hours = Integer.parseInt(workTime.nextToken());
        minute = Integer.parseInt(workTime.nextToken());

        if (hours > 23 || hours < 0 || minute > 59 || minute < 0) {                 // checks validity
            timeWord = "invalid";
        } else {
            if (minute < 10) {
                newMinutes = "0" + minute;                                          // adds 00s
            } else {
                newMinutes = "" + minute;
            }

            if (hours >= 0 && hours <= 11) {                                        // conversion
                timeWord = hours + ":" + newMinutes + " AM";
            } else if (hours == 12) {
                timeWord = hours + ":" + newMinutes + " PM";
            } else {
                timeWord = (hours - 12) + ":" + newMinutes + " PM";
            }
        }
        return timeWord;
    }
}