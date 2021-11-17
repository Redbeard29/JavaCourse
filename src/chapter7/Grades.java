package chapter7;

/*
Create a program that allows a user to enter any number of grades and provides them with
their average score, as well as the highest and lowest scores.
 */

import java.io.OutputStream;
import java.util.Scanner;

public class Grades {

    public static int[] grades;
    public static Scanner scanner = new Scanner(System.in);

    public static void getGrades(){
        for(int x = 0; x < grades.length; x++){
            System.out.print("Enter grade #" + (x + 1) + ": ");
            grades[x] = scanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static int getHighestGrade(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowestGrade(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

    public static void main(String[] args){

        System.out.print("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighestGrade());
        System.out.println("Lowest: " + getLowestGrade());

    }

}
