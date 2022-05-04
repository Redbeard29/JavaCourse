package chapter6;

public class HomeAreaCalculator {

    public static void main(String args[]){

        //Instantiating using default constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        //Instantiating using constructor that accepts arguments
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        //Total area
        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The area of both rooms is: " + totalArea);

    }

}
