package assignments;

public class AverageSpeedMiles {
  public static void main(String[] args) {
    final double KILOMETERS_MILES = 1.6;

    double kilometers = 14, miles;
    double time = (45 / 60.0) + ((30 / 60.0) / 60.0);

    miles = kilometers / KILOMETERS_MILES;

    double averageSpeed = miles / time;

    System.out.printf("The average speed for covering %.2f is %.2f MPH", miles, averageSpeed);
  }
}
