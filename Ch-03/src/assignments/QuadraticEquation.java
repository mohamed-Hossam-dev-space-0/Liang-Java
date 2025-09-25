package assignments;

import java.util.Scanner;

public class QuadraticEquation {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b , 2) - (4 * a * c);

        double r1 = (-b + Math.pow(discriminant , 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(discriminant , 0.5)) / (2 * a);

        if (discriminant > 0){
            System.out.printf("The equation has two roots %.6f and %.6f", r1, r2);
        }else if (discriminant == 0){
            System.out.printf("The equation has one real root %.1f" , r1);
        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
