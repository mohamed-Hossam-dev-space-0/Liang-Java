package assignments;

import java.util.Scanner;

public class WindChillTemp {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double outsideTemp = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double velocity = input.nextDouble();

        double windChill = 35.74 + (0.6215 * outsideTemp) -
                (35.75 * Math.pow(velocity , 0.16))
                + (0.4275 * outsideTemp * Math.pow(velocity , 0.16));

        System.out.println("The wind chill index is " + windChill);
    }
}
