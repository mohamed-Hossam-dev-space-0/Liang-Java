package exercises;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    static void main(){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches;
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUNDS = 0.45359237; // Constant
        final double METERS_PER_INCHES = 0.0254; // Constant

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUNDS;
        double heightInMeters = height * METERS_PER_INCHES;
        double bmi = weightInKilograms / Math.pow(heightInMeters , 2);

        // Display results
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }
    }
}
