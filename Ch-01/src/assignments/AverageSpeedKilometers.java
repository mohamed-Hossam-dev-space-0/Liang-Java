package assignments;

public class AverageSpeedKilometers {
    public static void main(String[] args){
        double miles = 24.0;
        double time = 1.0 + (40 / 60.0) + ((35 / 60.0) / 60.0);
        final double KILOMETERS_MILES = 1.6;

        double kilometers = miles * KILOMETERS_MILES;

        double averageSpeed = kilometers / time;

        System.out.printf("The average speed of covering %.1f miles in kilometers is %.2f KPH" , miles , averageSpeed);

    }
}
