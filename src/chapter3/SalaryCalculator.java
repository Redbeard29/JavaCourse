package chapter3;

import java.util.Scanner;

/*
All salespeople get a payment of $1000 per week.
Salespeople who exceed 10 sales get an additional bonus of $250.
 */

public class SalaryCalculator {

    public static void main(String args[]){
        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Prompt user for number of sales made
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Account for bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }

}
