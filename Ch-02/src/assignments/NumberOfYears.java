package assignments;

import java.util.Scanner;

public class NumberOfYears {
     static void main(){
        Scanner input = new Scanner(System.in);

         System.out.print("Enter the number of minutes: ");
         int numberOfMinutes = input.nextInt();

         int hours = numberOfMinutes / 60;
         int days = hours / 24;
         int years = days / 365;

         int remainingDays = days % 365;

         System.out.println(numberOfMinutes + " minutes is approximately " + years + " years and " + remainingDays + " days");
    }
}
