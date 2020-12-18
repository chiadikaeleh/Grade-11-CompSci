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
public class TimChange2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("TimeInput.txt"));

        PrintWriter input = new PrintWriter(new File("TimeOutput.txt"));

        while (file.hasNextLine()) {

            String time = file.nextLine().toUpperCase().trim();
            StringTokenizer st = new StringTokenizer(time);
            if (st.countTokens() == 2) {
                input.println(convertToStandardTime(time));

            } else {
                input.println(convertToTraditional(time));
            }
        }
        input.close();
        file.close();
    }

    public static String convertToStandardTime(String time) {

        StringTokenizer st = new StringTokenizer(time, ":");

        if (st.countTokens() == 2) {

            int hours = Integer.parseInt(st.nextToken());
            int mins = Integer.parseInt(st.nextToken());
            if (hours >= 0 && hours < 24 && mins >= 0 && mins < 60) {

                if (hours >= 12) {
                    time = ((hours - 12) + ":" + mins + " PM");
                    return time;
                } else {
                    time = (hours + ":" + mins + " AM");
                    return time;
                }
            }
        }
        return "invalid";
    }

    public static String convertToTraditional(String time) {

        StringTokenizer st = new StringTokenizer(time, " ");

        if (st.countTokens() == 2) {

            String time1 = st.nextToken();
            String minute = st.nextToken();
            StringTokenizer st1 = new StringTokenizer(time1, ":");

            if (st1.countTokens() == 2) {

                int hours = Integer.parseInt(st1.nextToken());
                int mins = Integer.parseInt(st1.nextToken());
                if (hours >= 0 && hours <= 12 && mins >= 0 && mins < 60) {

                    if (minute.equalsIgnoreCase("AM")) {

                        time  = hours + ":" + mins;
                        return time;

                    } else if (minute.equalsIgnoreCase("PM")) {

                        time = (hours + 12) + ":" + mins;
                        return time;
                    }
                }
            }
        }
        return "invalid";
    }
}
