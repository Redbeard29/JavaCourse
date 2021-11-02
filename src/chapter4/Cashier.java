package chapter4;

import java.util.Scanner;

//Write a cashier program that will scan a given number of items and tally the cost.

public class Cashier {

    public static void main(String args[]){
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);

        int qty = scanner.nextInt();

        double total = 0;

        for(int x=0; x < qty; x++){

            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your total is $" + total);
    }

}
