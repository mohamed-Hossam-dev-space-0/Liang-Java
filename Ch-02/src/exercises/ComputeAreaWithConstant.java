package exercises;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    static void main(){
        Scanner input = new Scanner(System.in);

        // Declare a constant
        final double PI = 3.14159;
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute Area
        double area = radius * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
