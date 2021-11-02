package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){
        //Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //Get number of hours worked
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Hours worked must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate gross
        double grossPay = payRate * hoursWorked;
        System.out.println("Gross pay: $" + grossPay);

    }

}
