package assignments;

import java.util.Scanner;

public class PopulationProjection {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int population = 312_032_486 , secondPerYear = 365 * 24 * 60 * 60;
        double birthRate = secondPerYear / 7.0;
        double deathRate = secondPerYear / 13.0;
        double newImmigrantRate = secondPerYear / 45.0;

        double changeRate = (birthRate - deathRate) + newImmigrantRate;

        for(int i = 0; i < years ; i++){
            population+=(int)(changeRate);
        }
        System.out.printf("The population in %d years is %d\n" , years , population);
    }
}