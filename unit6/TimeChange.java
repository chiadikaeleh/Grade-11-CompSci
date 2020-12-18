/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class TimeChange {

    public static void getInput() throws FileNotFoundException {
        int time1;
        String time2;

        File file = new File("TimeInput.txt");                                // read from file
        Scanner input = new Scanner(file);

        File outputFile = new File("TimeOutput.txt");                                    // Create File and Create a File Writer
        PrintWriter output = new PrintWriter(outputFile);

        while (input.hasNext()) {
            String time = input.nextLine();

        }

        while (input.hasNext()) {                                                  // while there is still input
            StringTokenizer time = new StringTokenizer(input.nextLine(), ":");

            time1 = Integer.parseInt(time.nextToken());                        // make the strings integers
            time2 = time.nextToken();

            if (time2.contains("AM") || time2.contains("PM")) {

                convertToTraditional(time1, time2);

            } else {
                convertToStandardTime(time1, time2);
            }

        }
        input.close();
        output.close();
    }

    public static String convertToTraditional(int time1, String time2) {
        int newTime2 = 0, newTime1 = 0;
        String timeString;

        newTime2 = Integer.parseInt(time2);

        if (time2.contains("AM")) {
            newTime1 = time1 - 12;

        } else {
            newTime1 = time1 + 12;
        }

        timeString = newTime1 + ":" + newTime2;
        return timeString;

    }

    public static String convertToStandardTime(int time1, String time2) {
        int newTime2 = 0, newTime1 = 0;
        String timeString = "";

        if (time1 < 12 && time1 >= 0) {
            newTime1 = time1;
            timeString = newTime1 + ":" + time2 + "AM";

        } else {
            newTime1 = time1 + 12;
        }

        timeString = newTime1 + ":" + time2 + "PM";

        return timeString;

    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
