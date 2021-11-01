package chapter3;

/*
All Salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
*/

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){
        //Initialize known values
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Evaluate message based on conditionals and generate output
        if(sales >= quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
