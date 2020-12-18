package edu.hdsb.gwss.chiadika.ics3u.u2;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Name: Chiadika Eleh
 * Date: March 8th, 2019
 * Version: v1.00
 * Description: 
 * This program will calculate the amount of parts needed to produce the requested
 * revenue and then given the amount of workers working at your company by the user 
 * it will give you the amount your workers will be paid and the percentage it will take from
 * the revenue entered.
 */
/**
 *
 * @author chiadika
 */
public class RevenueCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CONSTANTS
        final double A = -0.5, B = 8, PAY_MANAGERS = 10.50,
                PAY_INTERNS = 8.50, WORK_TIME = 8;

        // VARIABLES
        double revenue, g, totalInterns, totalManagers, totalWorkerPay,
                percentWorkers, percentInterns, percentManagers, actualRevenue,
                gameParts1, gameParts2;
        int amntManagers, amntInterns, amntWorkers;
        String iphonePart;

        // OBJECTS
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(0);
        decimal.setMaximumFractionDigits(0);

        // SPLASH PAGE
        System.out.println("CALCULATION OF PARTS CALCULATOR");
        System.out.println("----------------------------------------------------");
        System.out.println("You are the new CEO of this iPhone parts provider");
        System.out.println("The revenue of this company can be modelled by");
        System.out.println("the equation R = -0.5g^2 + 8g - 24");
        System.out.println("where R is revenue in thousands and g are game");
        System.out.println("parts sold in thousands");
        System.out.println("This program will ask for the amount of");
        System.out.println("revenue you want");
        System.out.println("and then calculate 2 options for the amount of parts");
        System.out.println("needed to produce said revenue.");
        System.out.println("-----------------------------------------------------");

        // INPUT
        System.out.println("");
        System.out.println("Enter the iPhone part being created");
        iphonePart = input.nextLine();
        System.out.print("Enter the revenue in THOUSANDS (decimals allowed): ");
        revenue = input.nextDouble();

        // ASSIGNMENTS
        g = -24 - revenue;
        actualRevenue = revenue * 1000;

        // PROCESSING
        gameParts1 = (-B + Math.sqrt(Math.pow(B, 2)
                - (4 * A * g))) / (2 * A);
        gameParts2 = (-B - Math.sqrt(Math.pow(B, 2)
                - (4 * A * g))) / (2 * A);

        // IF STATEMENTS/OUTPUT
        System.out.println(" ");
        System.out.println("RESULT:");
        if (gameParts1 <= 0) {
            System.out.println("Option 1 is not a valid value. Please try again.");
        } else {
            gameParts1 = Math.round(gameParts1 * 1000);
            System.out.println("- Option 1 to get " + money.format(actualRevenue)
                    + " is to sell around");
            System.out.println(decimal.format(gameParts1) + " iPhone " + iphonePart + ".");
        }

        if (gameParts2 <= 0) {
            System.out.println("Option 2 is not a valid value. Please try again.");
        } else {
            gameParts2 = Math.round(gameParts2 * 1000);
            System.out.println("- Option 2 to get " + money.format(actualRevenue)
                    + " is to sell around");
            System.out.println(decimal.format(gameParts2) + " iPhone " + iphonePart + ".");
        }

        // IF STATEMENTS/OUTPUT 2
        if (gameParts1 <= 0) {
            System.out.println("The rest of the program is unavailable due to lack of "
                    + "feasible values in revenue entry. Please try again.");
        } else if (gameParts2 <= 0) {
            System.out.println("The rest of the program is unavailable due to lack of "
                    + "feasible values in revenue entry. Please try again.");
        } else {
            // SPLASH PAGE 2
            System.out.println(" ");
            System.out.println("CALCULATION OF WORKER PAY");
            System.out.println("------------------------------------------------------");
            System.out.println("There are 9 open work spots up for hire and you are ");
            System.out.println("in charge of assigning them.");
            System.out.println("Managers work for $10.50 an hour, and interns work for");
            System.out.println("$8.50. Each work for 8 hours a day.");
            System.out.println("This program will calculate the amount and percentage");
            System.out.println("of revenue taken by employees");

            // INPUT 2
            System.out.println(" ");
            System.out.println("------------------------------------------------------");
            System.out.println("Enter the amount of managers you would like to hire ");
            amntManagers = input.nextInt();
            System.out.println("and the amount of interns you would like to hire:");
            amntInterns = input.nextInt();

            // PROCESSING 2
            amntWorkers = amntInterns + amntManagers;
            totalManagers = amntManagers * PAY_MANAGERS * WORK_TIME;
            totalInterns = amntInterns * PAY_INTERNS * WORK_TIME;
            totalWorkerPay = totalInterns + totalManagers;
            percentInterns = totalInterns / actualRevenue;
            percentManagers = totalManagers / actualRevenue;
            percentWorkers = totalWorkerPay / actualRevenue;

            // OUTPUT 2
            System.out.println(" ");
            System.out.println("RESULT:");
            System.out.format("%-10s %11s %14s %10s %14s\n",
                    "Type of Worker", "AVG Pay", "# of Workers", "Total", "% of Revenue");
            System.out.format("%-16s %9s %14s %11s %12s\n", "Managers",
                    money.format(PAY_MANAGERS), amntManagers,
                    money.format(totalManagers), percent.format(percentManagers));
            System.out.format("%-16s %9s %14s %11s %12s\n", "Interns",
                    money.format(PAY_INTERNS), amntInterns, money.format(totalInterns),
                    percent.format(percentInterns));
            System.out.format("%-16s %9s %14s %11s %12s", "All Workers", " - ",
                    amntWorkers, money.format(totalWorkerPay),
                    percent.format(percentWorkers));
            System.out.println(" ");
        }

    }
}
