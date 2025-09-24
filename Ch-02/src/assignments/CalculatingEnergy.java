package assignments;

import java.util.Scanner;

public class CalculatingEnergy {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kg: ");
        double weightOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = weightOfWater * (finalTemp - initialTemp) * 4184;

        System.out.printf("The energy needed is %.1f" , energy);
    }
}
