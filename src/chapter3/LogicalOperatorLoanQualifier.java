package chapter3;

/*
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){
        //Initialize known values
        int minSalary = 30000;
        int minYears = 2;

        //Receive values we do not know
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        //Use conditionals to route logic appropriately
        if(salary >= minSalary && years >= minYears){
            System.out.println("Congrats! You qualify for the loan");
        }
        else{
            System.out.println("Sorry, you must earn at least $" + minSalary + " and have been with your current employer for at least " + minYears + " years to qualify for this loan.");
        }


    }

}
