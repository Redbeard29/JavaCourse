package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]){
        //Define different coin values
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;

        //Define variable for total change made so far, define target total
        double total;
        double dollar = 1.00;
        double difference;

        //Define the game for the user
        System.out.println("The goal of this game is to make exactly one dollar, using any combination of pennies, nickels, dimes and quarters. Good luck!");

        //Get user input for number of coins for each type of coin, store in variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pennies would you like?");
        int pennyQty = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int nickelQty = scanner.nextInt();
        System.out.println("How many dimes would you like?");
        int dimeQty = scanner.nextInt();
        System.out.println("How many quarters would you like?");
        int quarterQty = scanner.nextInt();
        scanner.close();

        //Calculate the change to be added to total
        total = (penny * pennyQty) + (nickel * nickelQty) + (dime * dimeQty) + (quarter * quarterQty);
        //Calculate how far off total was from $1 and output result
        if(total == dollar){
            System.out.println("Congrats! You made exactly one dollar. You win!");
        }
        else if(total > dollar){
            difference = total - dollar;
            System.out.println("Whoops! You were $" + String.format("%.2f", difference)  + " over a dollar.");
        }
        else if(total < dollar){
            difference = dollar - total;
            System.out.println("Whoops! You were $" + String.format("%.2f", difference)  + " under a dollar.");
        }
    }

}
