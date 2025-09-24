package assignments;

import java.util.Scanner;

public class AreaOfHexagon {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        double area = (3 * Math.sqrt(3) * Math.pow(side  , 2)) / 2.0;

        System.out.println("The area of the hexagon is " + area);
    }
}
