package assignments;

import java.util.Scanner;

public class ComputingBMI {
     static void main(){
        Scanner input = new Scanner(System.in);

        final double POUNDS_KILOGRAMS = 0.45359237;
        final double INCHES_METERS = 0.0254;

        System.out.print("Enter the weight in pounds: ");
         double pounds = input.nextDouble();

         System.out.print("Enter height in inches: ");
         double inches = input.nextDouble();

         double kg = pounds * POUNDS_KILOGRAMS; // 43,31807
         double meters = inches * INCHES_METERS; // 1.27

         double bmi = kg / (meters * meters);

         System.out.printf("BMI is %.4f",bmi);
    }
}
