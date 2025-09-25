package exercises;

import java.util.Scanner;

public class LeapYear {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display result
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
