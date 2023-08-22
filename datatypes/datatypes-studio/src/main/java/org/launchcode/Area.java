package org.launchcode;
import java.util.Scanner;
import studios.areaofacircle.Circle;
public class Area {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a radius: ");

            if(input.hasNextDouble()) {
                double radius = input.nextDouble();

                if (radius >= 0) {

                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    break;
                } else {
                    System.out.println("Error: Enter a positive number");
                }
            }
            else{
                input.nextLine();
                System.out.println("Error: Please enter a valid number.");
            }
        }
    }
}
