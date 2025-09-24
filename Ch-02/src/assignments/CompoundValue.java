package assignments;

import java.util.Scanner;

public class CompoundValue {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double deposit = input.nextDouble();
        double monthlyInterestRate = 0.05 / 12;

        double balance = 0;

        balance = (deposit + balance) * (1 + monthlyInterestRate);
        balance = (deposit + balance) * (1 + monthlyInterestRate);
        balance = (deposit + balance) * (1 + monthlyInterestRate);
        balance = (deposit + balance) * (1 + monthlyInterestRate);
        balance = (deposit + balance) * (1 + monthlyInterestRate);
        balance = (deposit + balance) * (1 + monthlyInterestRate);

        System.out.printf("After the sixth month, the account value is $%.2f", balance);
    }
}
