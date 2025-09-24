package assignments;

import java.util.Scanner;

public class ConvertPoundsKilograms {
    static void main(){
        Scanner input = new Scanner(System.in);

        final double POUND_KILOGRAM = 0.454;

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * POUND_KILOGRAM;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
