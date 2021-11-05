package chapter5;
/*

Given a user's plan fee and number of overage minutes, calculate the final total of the user's cell phone bill.
Charge the user $0.25 for every overage minute, and 15% tax on the subtotal.
Print an itemized bill that includes:

Cost of base fee
Cost of overage
Tax
Total

 */

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        //Get plan fee and overage minutes
        System.out.println("What is your plan's base cost?");
        double baseCost = scanner.nextDouble();

        System.out.println("How many overage minutes do you have?");
        int overageMins = scanner.nextInt();

        scanner.close();

        //Calculate overage fee, tax, and total
        double overageFees = getOverageFees(overageMins);
        double tax = getTax(overageFees + baseCost);
        printBill(baseCost, overageFees, tax);
    }

    public static double getOverageFees(double overageMins){
        double overageRate = 0.25;
        double overageFees = overageMins * overageRate;
        return overageFees;
    }

    public static double getTax(double subtotal){
        double taxRate = 0.15;
        double tax = subtotal * taxRate;
        return tax;
    }

    public static void printBill(double baseCost, double overageFees, double tax){
        double total = baseCost + overageFees + tax;

        //Print itemized bill
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", overageFees));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

    }

}
