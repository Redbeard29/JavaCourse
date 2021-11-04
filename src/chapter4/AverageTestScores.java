package chapter4;

/*
Find the average of each student's test scores
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
        //Initialize known variables
        int numOfStudents = 24;
        int numOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all student scores
        for(int x = 0; x < numOfStudents; x++){

            double total = 0;
            for(int y = 0; y < numOfTests; y++){
                System.out.println("Enter the score for test #" + (y + 1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total / numOfTests;
            System.out.println("The test average for student #" + (x + 1) + " is " + average);
        }

        scanner.close();
    }

}
