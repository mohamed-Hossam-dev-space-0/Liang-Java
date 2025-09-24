package assignments;

import java.util.Scanner;

public class CalculateTips {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextInt();

        gratuityRate /= 100.0;

        double gratuity = gratuityRate * subtotal;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
