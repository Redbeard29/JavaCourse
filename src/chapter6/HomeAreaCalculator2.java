package chapter6;

import java.util.Scanner;

public class HomeAreaCalculator2 {

    private Scanner scanner = new Scanner(System.in);

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static void main(String args[]){

        HomeAreaCalculator2 calculator = new HomeAreaCalculator2();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        calculator.scanner.close();

        System.out.println("The total area is: " + area);
    }

}
