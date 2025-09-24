package assignments;

import java.util.Scanner;

public class Acceleration {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double initialVelocity = input.nextDouble();
        double finalVelocity = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (finalVelocity - initialVelocity) / time;

        System.out.printf("The average acceleration is %.4f",acceleration);

    }
}
