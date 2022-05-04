package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int dayAsInt;
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        do{
            System.out.println("Enter a number between 1 and 7: ");
            dayAsInt = scanner.nextInt();
        }while(!(dayAsInt > 0 && dayAsInt < 8));

        scanner.close();
        System.out.println("Corresponding Day: " + daysOfWeek[dayAsInt - 1]);
    }
}
