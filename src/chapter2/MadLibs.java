package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        //1. Get an adjective
        System.out.println("Enter an adjective.");
        Scanner scanner = new Scanner(System.in);
        String adj = scanner.nextLine();

        //2. Get a season
        System.out.println("Enter a season.");
        String season = scanner.nextLine();

        //3. Get a whole number
        System.out.println("Enter a whole number.");
        int num = scanner.nextInt();
        scanner.close();

        //4. Output the Mad Lib
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + num + " cups of coffee.");

    }

}
