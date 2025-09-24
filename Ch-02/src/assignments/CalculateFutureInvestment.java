package assignments;

import java.util.Scanner;

public class CalculateFutureInvestment {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();


        double futureInvestment = investmentAmount * Math.pow(1 + annualInterestRate/1200.0 , numberOfYears * 12);

        System.out.printf("Future value is $%.2f",futureInvestment);
    }
}
