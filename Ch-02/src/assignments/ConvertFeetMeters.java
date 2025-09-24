package assignments;

import java.util.Scanner;

public class ConvertFeetMeters {
    static void main(){
        Scanner input = new Scanner(System.in);

        final double FEET_METER = 0.305;

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meter = feet * FEET_METER;

        System.out.println(feet + " feet is " + meter + " meters");
    }
}
