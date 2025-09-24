package assignments;

import java.util.Scanner;

public class ComputeVolumeOfCylinder {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        final double PI = 3.14159;

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.printf("The area is %.4f\n" , area);
        System.out.printf("The volume is %.1f" , volume);
    }
}
