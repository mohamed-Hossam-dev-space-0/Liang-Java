package assignments;

import java.util.Scanner;

public class CalculateInterest {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g , 3 for 3%): ");
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();


        double interest = balance * (interestRate / 1200.0);
        System.out.printf("The interest is %.5f", interest);
    }
}
