package assignments;

import java.util.Scanner;

public class RunwayLength {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (Math.pow(speed , 2)) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f" , length);
    }
}
