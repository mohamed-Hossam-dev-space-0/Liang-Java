package assignments;

public class PopulationProjection {
    public static void main(String[] args) {
        int population = 312_032_486 , secondPerYear = 365 * 24 * 60 * 60;
        double birthRate = secondPerYear / 7.0;
        double deathRate = secondPerYear / 13.0;
        double newImmigrantRate = secondPerYear / 45.0;

        double changeRate = (birthRate - deathRate) + newImmigrantRate;

        population += (int)(changeRate);
        System.out.printf("The 1 year population is %d\n", population);

        population += (int)(changeRate);
        System.out.printf("The 2 year population is %d\n", population);

        population += (int)(changeRate);
        System.out.printf("The 3 year population is %d\n", population);

        population += (int)(changeRate);
        System.out.printf("The 4 year population is %d\n", population);

        population += (int)(changeRate);
        System.out.printf("The 5 year population is %d\n", population);
    }
}