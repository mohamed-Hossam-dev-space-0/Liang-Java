package assignments;

import java.util.Scanner;

public class CurrentTime {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        currentHour += offset;

        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSeconds);
    }
}
