package chapter3;

/*
Display the letter grade for a student based on their test score.
 */
import java.util.Scanner;

public class TestResults {

    public static void main(String args[]){
        //Get the test score from user
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine letter grade based on conditions
        char grade;
        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'D';
        }
        else if(score < 80){
            grade = 'C';
        }
        else if(score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        //Output
        System.out.println("Your grade is " + grade);
    }

}
